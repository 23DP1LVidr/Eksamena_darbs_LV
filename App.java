import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        PatientManager manager = new PatientManager();
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

                Console.clear();
                manager.getPatientList();

                if (lang.equalsIgnoreCase("english")){
                    System.out.println("ENTER to countinue");
                } else{
                    System.out.println("ENTER, lai turpinātu");
                }

                scanner.nextLine();
                Show.menu(lang);

            } else if(input.equalsIgnoreCase("find")){
                
            } else if(input.equalsIgnoreCase("exit")){

            }
        }
    }
}