public class Show {
    public static void menu(String language, String user){
        Console.clear();

        if(language.equalsIgnoreCase("E")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║             _   _                 _ _        _               ║");
            System.out.println("║            | | | |               (_) |      | |              ║");
            System.out.println("║            | |_| | ___  ___ _ __  _| |_ __ _| |              ║");
            System.out.println("║            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              ║");
            System.out.println("║            | | | | (_) \\__ \\ |_) | | || (_| | |              ║");
            System.out.println("║            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              ║");
            System.out.println("║                            | |                               ║");
            System.out.println("║                            |_|                               ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                        Welcome back,                         ║");
            System.out.printf("║%" + (62-user.length())/2 + "s%s%" + (62 - (62-user.length())/2 - user.length()) + "s║\n", "", user, "");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║  Available Commands:                                         ║");
            System.out.println("║    [1] Add an appointment                                    ║");
            System.out.println("║    [2] View appointments                                     ║");
            System.out.println("║    [3] E-shop                                                ║");
            System.out.println("║    [4]                                                       ║");
            System.out.println("║    [5] Exit                                                  ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║             _   _                 _ _        _               ║");
            System.out.println("║            | | | |               (_) |      | |              ║");
            System.out.println("║            | |_| | ___  ___ _ __  _| |_ __ _| |              ║");
            System.out.println("║            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              ║");
            System.out.println("║            | | | | (_) \\__ \\ |_) | | || (_| | |              ║");
            System.out.println("║            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              ║");
            System.out.println("║                            | |                               ║");
            System.out.println("║                            |_|                               ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                         Sveicināti!                          ║");
            System.out.printf("║%" + (62-user.length())/2 + "s%s%" + (62 - (62-user.length())/2 - user.length()) + "s║\n", "", user, "");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║  Ievadiet komandu:                                           ║");
            System.out.println("║    [1] Pievienot pierakstu                                   ║");
            System.out.println("║    [2] Apskatīt pierakstus                                   ║");
            System.out.println("║    [3] E-veikals                                             ║");
            System.out.println("║    [4]                                                       ║");
            System.out.println("║    [5] Exit                                                  ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
        }
    }

    public static void startMenu(String language){
        Console.clear();
        if(language.equalsIgnoreCase("E")){
            System.out.println("Log in or register!");
            System.out.println();
            System.out.println("Log in (L)");
            System.out.println("Register (R)");
        } else{
            System.out.println("Piesakaties vai reģistrējaties!");
            System.out.println();
            System.out.println("Pietiekties (L)");
            System.out.println("Reģistrēties (R)");
        }
    }

    public static void logInEmail(String language){
        Console.clear();
        if(language.equalsIgnoreCase("E")){
            System.out.println("Please, log in");
            System.out.println("Enter email:");
            System.out.println();   
        } else{
            System.out.println("Lūdzu piesakaties");
            System.out.println("Ievadiet ē-pastu:");
            System.out.println();   
        }
    }

    public static void logInPassword(String language){
        Console.clear();
        if(language.equalsIgnoreCase("E")){
            System.out.println("Please, log in");
            System.out.println("Enter password:");
            System.out.println();   
        } else{
            System.out.println("Lūdzu piesakaties");
            System.out.println("Ievadiet paroli:");
            System.out.println();   
        }
    }

    public static void noAccout(String language){
        Console.clear();
        if (language.equalsIgnoreCase("E")){
            System.out.println("No account found, wish to register?");
            System.out.println();
            System.out.println("Try again (a)");
            System.out.println("Register (r)");
        } else{
            System.out.println("Lietotājs nav atrasts, vēlaties piereģistrēties?");
            System.out.println();
            System.out.println("Mēģināt vēlreiz (a)");
            System.out.println("Reģistrēties (r)");
        }
    }

    public static void incorrectPassword(String language){
        Console.clear();
        if (language.equalsIgnoreCase("E")){
            System.out.println("Incorrect password!");
            System.out.println();
            System.out.println("Try again (a)");
            System.out.println("Register (r)");
        } else{
            System.out.println("Nepareiza parole!");
            System.out.println();
            System.out.println("Mēģināt vēlreiz (a)");
            System.out.println("Reģistrēties (r)");
        }
    }

    public static void appointmentListHeader(String language){
        Console.clear();
        if (language.equalsIgnoreCase(language)){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║                      YOUR APPOINTMENTS                       ║");
            System.out.println("╠════╦════════════╦══════════╦═════════════════════════════════╣");
            System.out.println("║ NR ║    DATE    ║   TIME   ║            APPOINTMENT          ║");
            System.out.println("╠════╬════════════╬══════════╬═════════════════════════════════╣");
            System.out.println("║ 1. ║ 2025.20.23 ║  12:20   ║            APPOINTMENT          ║");
        }
    }
}