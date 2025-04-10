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
            System.out.println("Stop program (exit)");
            System.out.println();
        } else{
            System.out.println("PALĪDZĪBAS IZVĒLNE");
            System.out.println();
            System.out.println("Izvēlieties komandu un ievadiet atslēgvārdu iekavās");
            System.out.println("Pievienot personu (add)");
            System.out.println("Parādīt esošo personu sarakstu (show)");
            System.out.println("Atrast personu (find)");
            System.out.println("Apstādināt programmu (exit)");
            System.out.println();
        }
    }

    public static void addPatient(String language){
        Console.clear();
        if(language.equalsIgnoreCase("english")){
            System.out.println("ADDING A PATIENT");
            System.out.println();
            System.out.println("Enter patient's name, surname, birthdate, email (separated by commas)");
            System.out.println("Or \"exit\" to return to menu");
        } else{
            System.out.println("PACIENTA PIEVIENOŠANA");
            System.out.println();
            System.out.println("Ievadiet pacienta vārdu, uzvārdu, dzimšanas datumu, e-pastu (atdalot ar komatiem)");
            System.out.println("Vai \"exit\", lai atgrieztos menu");
        }
    }

    public static void addPatientEnd(String language){
        if(language.equalsIgnoreCase("english")){
            System.out.println("Patient added!");
            System.out.println("Add another? (\"+\"/\"-\")");
        } else{
            System.out.println("Pacients pievienots!");
            System.out.println("Pievienot vēl? (\"+\"\"-\")");
        }
    }

    public static void header(String language){
        if (language.equalsIgnoreCase("english")){
            System.out.printf("|%-19s| %-19s| %-19s| %-34s| \n","Name","Surname","Birthdate","Email");
            System.out.println("|-------------------|--------------------|--------------------|-----------------------------------|");
        }else{
            System.out.printf("|%-19s| %-19s| %-19s| %-34s| \n","Vārds","Uzvārds","Dzimšanas datums","E-pasts");
            System.out.println("|-------------------|--------------------|--------------------|-----------------------------------|");
        }
    }
}