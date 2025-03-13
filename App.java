import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        String lang;
        
        System.out.println("Hello! Choose language (write \"english\" or \"latvian\" in console)");
        while(true){
            lang = scanner.nextLine();
            if (lang.equalsIgnoreCase("english") || lang.equalsIgnoreCase("latvian")){
                Show.menu(lang);
                break;
            } else{
                System.out.println("Incorrect input, try again");
                continue;
            }
        }

        while(true){
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("add") ){
                Show.addPatient(lang);
            } else if(input.equalsIgnoreCase("show")){
                
            } else if(input.equalsIgnoreCase("find")){
                
            } else if(input.equalsIgnoreCase("exit")){

            }
        }
    }
}
