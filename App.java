import java.util.ArrayList;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String lang;

        Console.clear();
        Show.language();

        while (true) {
            lang = scanner.nextLine();
            if (lang.equalsIgnoreCase("1") || lang.equalsIgnoreCase("2")) break;
            System.out.println("Incorrect input, try again");
        }

        boolean loggedIn = false;
        String userName = "";
        String userEmail = "";

        while (!loggedIn) {
            Show.startMenu(lang);
            String choice = scanner.nextLine();



            // LOG IN
            if (choice.equalsIgnoreCase("1")) {
                Show.logInEmail(lang);
                userEmail = scanner.nextLine();
                String correctPassword = PatientManager.findPassword(userEmail);

                if (correctPassword == null || correctPassword.isEmpty()) {
                    Show.noAccout(lang);
                    String retry = scanner.nextLine();
                    if (retry.equalsIgnoreCase("1")) continue;
                    else break;
                } else {
                    while (true) {
                        Show.logInPassword(lang);
                        String inputPassword = scanner.nextLine();

                        if (inputPassword.equals(correctPassword)) {
                            System.out.println(lang.equalsIgnoreCase("1") ? "Successfully logged in!" : "Veiksmīgi!");
                            loggedIn = true;
                            userName = PatientManager.findName(userEmail);
                            break;
                        } else {
                            Show.incorrectPassword(lang);
                            String retry = scanner.nextLine();
                            if (retry.equalsIgnoreCase("1")) continue;
                            else break;
                        }
                    }
                }



            // REGISTER
            } else if (choice.equalsIgnoreCase("2")) {
                Console.clear();

                String name, surname, email, password;


                while (true) {
                    Show.registerName(lang);
                    String[] info = scanner.nextLine().split(" ");
                     if (info.length >= 2) {
                        name = info[0];
                        surname = info[1];
                        break;
                    } else {
                        System.out.println(lang.equalsIgnoreCase("1") ? "Incorrect input!" : "Nepareizi!");
                    }
                }

                Show.registerEmail(lang);
                email = scanner.nextLine();

                Show.registerPassword(lang);
                password = scanner.nextLine();

                PatientManager.addPatient(name, surname, email, password);
                Console.clear();
                loggedIn = true;
                userName = name;
            }
        }



        Show.menu(lang, userName);

        while (true) {
            String input = scanner.nextLine();


            //ADD APPOINTMENT
            if (input.equalsIgnoreCase("1")) {
                Console.clear();
            
                Show.addAppointmentDate(lang);
                String dateTimeInput = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime dateTime;
            
                try {
                    dateTime = LocalDateTime.parse(dateTimeInput, formatter);
                } catch (DateTimeParseException e) {
                    Show.invalidDate(lang);
                    scanner.nextLine();
                    Console.clear();
                    Show.menu(lang, userName);
                    continue;
                }
            
                int hour = dateTime.getHour();
                if (hour < 10 || hour >= 18) {
                    Show.invalidTime(lang);
                    scanner.nextLine();
                    Console.clear();
                    Show.menu(lang, userName);
                    continue;
                }
            
                ArrayList<Appointment> existingAppointments = AppointmentManager.findAppointment(userEmail);
                boolean hasConflict = false;
                for (Appointment app : existingAppointments) {
                    long diffMinutes = Math.abs(Duration.between(app.getDateTime(), dateTime).toMinutes());
                    if (diffMinutes < 60) {
                        hasConflict = true;
                        break;
                    }
                }
            
                if (hasConflict) {
                    Show.timeConflict(lang);
                    scanner.nextLine();
                    Console.clear();
                    Show.menu(lang, userName);
                    continue;
                }
            
                Show.addAppointmentPurpose(lang);
                String description = scanner.nextLine();
            
                int newID = AppointmentManager.getAppointmentArrayList().size() + 1;
                AppointmentManager.addAppointment(userEmail, dateTime, description, newID);
            
                Show.appointmentAdded(lang);
                scanner.nextLine();
                Console.clear();
                Show.menu(lang, userEmail);
                continue;
            }


            //SEE ALL APPOINTMENTS
            else if(input.equalsIgnoreCase("2")) {
                Console.clear();
            
                Show.appointmentListHeader(lang);
                ArrayList<Appointment> appointments = AppointmentManager.findAppointment(userEmail);
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            
                int nr = 1;
                for (Appointment appointment : appointments) {
                    String date = appointment.getDateTime().format(dateFormatter);
                    String time = appointment.getDateTime().format(timeFormatter);
                    System.out.printf("║ %-2d ║ %-10s ║ %-6s ║ %-31s ║\n", nr++, date, time, appointment.getDescription());
                }
            
                Show.appointmentListFooter(lang);
                String inputLine = scanner.nextLine();
            
                if (inputLine.isEmpty()) {
                    Console.clear();
                    Show.menu(lang, userName);
                    continue;
                }
            
                try {
                    int selection = Integer.valueOf(inputLine);
                    if (selection < 1 || selection > appointments.size()) {
                        System.out.println("Invalid number!");
                    } else {
                        Appointment toRemove = appointments.get(selection - 1);
                        AppointmentManager.deleteAppointment(toRemove.getID());
                        System.out.println("Appointment deleted successfully.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }
            
                System.out.println("Press ENTER to return to menu.");
                scanner.nextLine();
                Console.clear();
                Show.menu(lang, userName);
            }
            
            
            
            // EXIT
            else if(input.equalsIgnoreCase("5")){
                Console.clear();
                Show.exit(lang);
                break;
            }
        scanner.close(); 
        }
    }
}