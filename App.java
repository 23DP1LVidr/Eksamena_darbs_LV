import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        PatientManager manager = new PatientManager();
        Scanner scanner = new Scanner(System.in);
        String lang;
        
        Console.clear();
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
                String patientsInfo = scanner.nextLine();

                if (patientsInfo.equals("exit")){
                    Show.menu(lang);
                }else{
                    manager.addPatient(patientsInfo);
                    Show.addPatientEnd(lang);
                }

                while(scanner.nextLine().equals("+")){
                    Show.addPatient(lang);
                    patientsInfo = scanner.nextLine();
                    manager.addPatient(patientsInfo);
                    Show.addPatientEnd(lang);
                }

                Show.menu(lang);






            } else if(input.equalsIgnoreCase("show")){

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
                Show.menu(lang);




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