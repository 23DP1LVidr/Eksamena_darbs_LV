import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String lang;

        Console.clear();
        System.out.println("Hello! Choose language english (E) or latvian (L)");

        while (true) {
            lang = scanner.nextLine();
            if (lang.equalsIgnoreCase("E") || lang.equalsIgnoreCase("L")) break;
            System.out.println("Incorrect input, try again");
        }

        boolean loggedIn = false;
        String user = "";

        while (!loggedIn) {
            Show.startMenu(lang);
            String choice = scanner.nextLine();

            // LOG IN
            if (choice.equalsIgnoreCase("L")) {
                Show.logInEmail(lang);
                String email = scanner.nextLine();
                String correctPassword = PatientManager.findLogin(email);

                if (correctPassword == null || correctPassword.isEmpty()) {
                    Show.noAccout(lang);
                    String retry = scanner.nextLine();
                    if (retry.equalsIgnoreCase("a")) continue;
                    else break;
                } else {
                    while (true) {
                        Show.logInPassword(lang);
                        String inputPassword = scanner.nextLine();

                        if (inputPassword.equals(correctPassword)) {
                            System.out.println(lang.equalsIgnoreCase("E") ? "Successfully logged in!" : "Veiksmīgi!");
                            loggedIn = true;
                            user = email;
                            break;
                        } else {
                            Show.incorrectPassword(lang);
                            String retry = scanner.nextLine();
                            if (retry.equalsIgnoreCase("a")) continue;
                            else break;
                        }
                    }
                }

            // REGISTER
            } else if (choice.equalsIgnoreCase("R")) {
                Console.clear();

                String name, surname, email, password;

                if (lang.equalsIgnoreCase("E")) {
                    while (true) {
                        System.out.println(lang.equalsIgnoreCase("E") ? "Please, enter your name and surname:" : "Lūdzu, ievadiet savu vārdu un uzvārdu:");
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

                    System.out.println(lang.equalsIgnoreCase("E") ? "Please, enter your email:" : "Lūdzu, ievadiet savu e-pastu:");
                    email = scanner.nextLine();

                    System.out.println(lang.equalsIgnoreCase("E") ? "Please, enter password:" : "Lūdzu, ievadiet paroli:");
                    password = scanner.nextLine();

                    PatientManager.addPatient(name, surname, email, password);
                    Console.clear();
                    loggedIn = true;
                    user = email;
                }
            }
        }



        Show.menu(lang, user);

        while (true) {
            String input = scanner.nextLine();

            //ADD APPOINTMENT
            if (input.equalsIgnoreCase("1")) {
                Console.clear();
            
                System.out.println(lang.equalsIgnoreCase("E") ? "When will you sign up? (yyyy-MM-dd HH:mm)" : "Kad jūs pierakstīt? (gggg-MM-dd SS:mm)");
                String dateTimeInput = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime dateTime;
            
                try {
                    dateTime = LocalDateTime.parse(dateTimeInput, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println(lang.equalsIgnoreCase("E") ? "Invalid date! Exmample: 2025-12-23 10:20" : "Nepareizs datums! Piemērs: 2025-12-23 10:20");
                    System.out.println(lang.equalsIgnoreCase("E") ? "Back to menu (ENTER)": "Atpakaļ (ENTER)");
                    scanner.nextLine();
                    Console.clear();
                    Show.menu(lang, user);
                    continue;
                }
            
                System.out.println(lang.equalsIgnoreCase("E") ? "Enter appointment reason:" : "Ievadi pieraksta iemeslu:");
                String description = scanner.nextLine();
            
                int newID = AppointmentManager.getAppointmentArrayList().size() + 1;
                AppointmentManager.addAppointment(user, dateTime, description, newID);
            
                System.out.println(lang.equalsIgnoreCase("E") ? "Appointment added!" : "Pieraksts pievienots!");
                System.out.println(lang.equalsIgnoreCase("E") ? "Back to menu (ENTER)" : "Atgriezties uz menu (ENTER)");
                scanner.nextLine();
                Console.clear();
                Show.menu(lang, user);
            }


            //SEE ALL APPOINTMENTS
            else if(input.equalsIgnoreCase("2")){
                Console.clear();
                
            } 
            
            
            
            else if(input.equalsIgnoreCase("5")){

                Console.clear();

                System.out.println(lang.equalsIgnoreCase("E") ? "Thanks for using, bye!" : "Paldies par izmantošanu, visu labu!");
                break;
            }
        }
    }
}