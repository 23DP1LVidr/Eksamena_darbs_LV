public class Show {
    public static void menu(String language){
        Console.clear();
        if(language.equalsIgnoreCase("english")){
            System.out.println("HELP MENU");
            System.out.println();
            System.out.println("Choose the command and type the keyword in brackets");
            System.out.println("Add a person (add)");
            System.out.println("Show existing person list (show)");
            System.out.println("Find a person (find)"); 
        } else{
            System.out.println("PALĪDZĪBAS IZVĒLNE");
            System.out.println();
            System.out.println("Izvēlieties komandu un ievadiet atslēgvārdu iekavās");
            System.out.println("Pievienot personu (add)");
            System.out.println("Parādīt esošo personu sarakstu (show)");
            System.out.println("Atrast personu (find)");
        }
    }

    public static void addPatient(String language){
        Console.clear();
        if(language.equalsIgnoreCase("english")){
            System.out.println("ADDING A PATIENT");
            System.out.println();
            System.out.println("Enter patient's name, surname, birthdate, contact information (email or phone number) separated by commas");
        } else{
            System.out.println("PACIENTA PIEVIENOŠANA");
            System.out.println();
            System.out.println("Ievadiet pacienta vārdu, uzvārdu, dzimšanas datumu, kontaktinformācijas (e-pasts vai tālruņa numurs), atdalot ar komatiem");
        }
    }
}
