import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ProductManager {
    private static final String FILE_NAME = "Products.csv";

    public static List<Product> getAllProducts() throws Exception {
        List<Product> products = new ArrayList<>();
        BufferedReader reader = Helper.getReader(FILE_NAME);
        reader.readLine();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            String desc = parts[2];
            double price = Double.parseDouble(parts[3]);
            int stock = Integer.parseInt(parts[4]);

            products.add(new Product(id, name, desc, price, stock));
        }

        return products;
    }

    public static void addProduct(Product product) throws Exception {
        BufferedWriter writer = Helper.getWriter(FILE_NAME, StandardOpenOption.APPEND);
        writer.write(String.format("%d,%s,%s,%.2f,%d",
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getStock()));
        writer.newLine();
        writer.close();
    }

    public static void updateStock(int productId, int newStock) throws Exception {
        List<Product> products = getAllProducts();
        
        // Use a PrintWriter for consistent newline handling
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, false));
        writer.println("id,name,description,price,stock");
    
        for (Product p : products) {
            if (p.getId() == productId) {
                p.setStock(newStock);
            }
            writer.printf("%d,%s,%s,%.2f,%d%n",
                    p.getId(), p.getName(), p.getDescription(), p.getPrice(), p.getStock());
        }
    
        writer.close();
    }
}