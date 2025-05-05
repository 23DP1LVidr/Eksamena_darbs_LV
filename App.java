import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        PatientManager manager = new PatientManager();
        Scanner scanner = new Scanner(System.in);
        String lang;
        
        Console.clear();
        System.out.println("Hello! Choose language english (E) or latvian (L)");

        while(true){
            lang = scanner.nextLine();
            if (lang.equalsIgnoreCase("E") || lang.equalsIgnoreCase("L")){
                break;
            } else{
                System.out.println("Incorrect input, try again");
                continue;
            }
        }

        boolean loggedIn = false;
        while (!loggedIn) {
            
            Show.startMenu(lang);
        
            String choice = scanner.nextLine();
        
            // LOGIN
            if (choice.equalsIgnoreCase("L")) {
                Show.logInEmail(lang);
                String email = scanner.nextLine();
                String correctPassword = manager.findLogin(email);
        
                if (correctPassword == null || correctPassword.isEmpty()) {
                    Show.noAccout(lang);
                    String retry = scanner.nextLine();
                    if (retry.equalsIgnoreCase("a")) continue;
                    else if (retry.equalsIgnoreCase("r")) break;
                } else {

                    while (true) {
                        Show.logInPassword(lang);
                        String inputPassword = scanner.nextLine();
        
                        if (inputPassword.equals(correctPassword)) {
                            System.out.println("Successfully logged in!");
                            loggedIn = true;
                            break;
                        } else {
                            Show.incorrectPassword(lang);
                            String retry = scanner.nextLine();
                            if (retry.equalsIgnoreCase("a")) continue;
                            else if (retry.equalsIgnoreCase("r")) break;
                        }
                    }
                }
        
            // REGISTER
            } else if (choice.equalsIgnoreCase("R")) {
                Console.clear();
        
                String name = "";
                String surname = "";
                String email = "";
                String password = "";
        
                if (lang.equalsIgnoreCase("E")) {
                    while (true) {
                        System.out.println("Please, enter your name and surname!");
                        String[] info = scanner.nextLine().split(" ");
                        if (info.length >= 2) {
                            name = info[0];
                            surname = info[1];
                            break;
                        } else {
                            Console.clear();
                            System.out.println("Incorrect input!");
                        }
                    }
        
                    System.out.println("Please, enter your email:");
                    email = scanner.nextLine();
        
                    System.out.println("Please, enter password:");
                    password = scanner.nextLine();
        
                    manager.addPatient(name,surname,email,password);
                    Console.clear();
                    loggedIn = true;
                }
            }
        }


            

        while(true){
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("show")){

                int PatientCount;
                Console.clear();
                
                Show.header(lang);

                PatientCount = manager.getPatientList();

                if (lang.equalsIgnoreCase("english")){
                    System.out.println("Total " + PatientCount + " entries");
                    System.out.println();
                    System.out.println("Back to menu (ENTER)");
                } else{
                    System.out.println("Kopumā " + PatientCount + " ieraksti");
                    System.out.println();
                    System.out.println("Atgriezties uz menu (ENTER)");
                }

                scanner.nextLine();
                Show.menu(lang);





            } else if(input.equalsIgnoreCase("find")){
                
                Console.clear();

                if (lang.equalsIgnoreCase("english")){
                    System.out.println("What to search for?");
                }else{
                    System.out.println("Ko meklēt?");
                }

                String findInput = scanner.nextLine();
                Console.clear();

                if (lang.equalsIgnoreCase("english")){
                    System.out.println("Found:");
                    System.out.println();
                }else{
                    System.out.println("Atrasts:");
                    System.out.println();
                }

                Show.header(lang);

                manager.findPatient(findInput);

                if (lang.equalsIgnoreCase("english")){
                    System.out.println();
                    System.out.println("Back to menu (ENTER)");
                } else{
                    System.out.println();
                    System.out.println("Atgriezties uz menu (ENTER)");
                }

                scanner.nextLine();
                break;




            } else if(input.equalsIgnoreCase("exit")){

                Console.clear();

                if (lang.equalsIgnoreCase("english")){
                    System.out.println("Thanks for using, bye!");
                }else{
                    System.out.println("Paldies par izmantošanu, visu labu!");
                }

                break;
            }
        }
    }
}