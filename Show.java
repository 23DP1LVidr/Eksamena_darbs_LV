public class Show {
    public static void menu(String language, String user){
        Console.clear();

        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
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
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                         Sveicināti,                          ║");
            System.out.printf("║%" + (62-user.length())/2 + "s%s%" + (62 - (62-user.length())/2 - user.length()) + "s║\n", "", user, "");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║  Ievadiet komandu:                                           ║");
            System.out.println("║    [1] Pievienot pierakstu                                   ║");
            System.out.println("║    [2] Apskatīt pierakstus                                   ║");
            System.out.println("║    [3] E-veikals                                             ║");
            System.out.println("║                                                              ║");
            System.out.println("║    [4] Exit                                                  ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void language(){
        Console.clear();
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                        CHOOSE LANGUAGE                       ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════╦═══════════════════════════════╣");
            System.out.println("║         ENGLISH (1)          ║          LATVIAN (2)          ║");
            System.out.println("╚══════════════════════════════╩═══════════════════════════════╝");
            System.out.println();
    }

    public static void startMenu(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                      LOG IN OR REGISTER                      ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════╦═══════════════════════════════╣");
            System.out.println("║         LOG IN (1)           ║         REGISTER (2)          ║");
            System.out.println("╚══════════════════════════════╩═══════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                PIESAKATIES VAI REĢISTRĒJATIES                ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════╦═══════════════════════════════╣");
            System.out.println("║         PIETEIKTIES (1)      ║        REĢISTRĒTIES (2)       ║");
            System.out.println("╚══════════════════════════════╩═══════════════════════════════╝");
            System.out.println();
        }
    }

    public static void logInEmail(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                          LOGGING IN                          ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                         Enter e-mail                         ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝"); 
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                         PIESLĒGŠANĀS                         ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                       Ievadiet e-pastu                       ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println(); 
        }
    }

    public static void logInPassword(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                          LOGGING IN                          ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                        Enter password                        ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝"); 
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                         PIESLĒGŠANĀS                         ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                        Ievadiet paroli                       ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();   
        }
    }

    public static void noAccout(String language){
        Console.clear();
        if (language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                        NO ACCOUT FOUND                       ║");
            System.out.println("║                       WISH TO MAKE ONE?                      ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════╦═══════════════════════════════╣");
            System.out.println("║          Try again (1)       ║          Register (2)         ║");
            System.out.println("╚══════════════════════════════╩═══════════════════════════════╝");
            System.out.println();   
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                     LIETOTĀJS NAV ATRASTS                    ║");
            System.out.println("║                        IZVEIDOT KONTU?                       ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════╦═══════════════════════════════╣");
            System.out.println("║      Mēģināt vēlreiz (1)     ║        Reģistrēties (2)       ║");
            System.out.println("╚══════════════════════════════╩═══════════════════════════════╝");
        }
    }

    public static void incorrectPassword(String language){
        Console.clear();
        if (language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                       INCORRECT PASSWORD                     ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════╦═══════════════════════════════╣");
            System.out.println("║          Try again (1)       ║          Register (2)         ║");
            System.out.println("╚══════════════════════════════╩═══════════════════════════════╝");
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                       NEPAREIZA PAROLE                       ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════╦═══════════════════════════════╣");
            System.out.println("║      Mēģināt vēlreiz (1)     ║        Reģistrēties (2)       ║");
            System.out.println("╚══════════════════════════════╩═══════════════════════════════╝");
        }
    }

    public static void registerName(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                     CREATING AN ACCOUNT                      ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                 Enter your name and surname                  ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝"); 
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                         REĢISTRĀCIJA                         ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║               Ievadiet savu vārdu un uzvārdu                 ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝"); 
            System.out.println(); 
        }
    }

    public static void registerEmail(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                     CREATING AN ACCOUNT                      ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                      Enter your e-mail                       ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝"); 
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                         REĢISTRĀCIJA                         ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                     Ievadiet savu e-pastu                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println(); 
        }
    }

    public static void registerPassword(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                     CREATING AN ACCOUNT                      ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                       Enter password                         ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝"); 
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                         REĢISTRĀCIJA                         ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                       Izdomājat paroli                       ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println(); 
        }
    }

    public static void addAppointmentDate(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                    ADDING AN APPOINTMENT                     ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║             Enter appointment's date and time                ║");
            System.out.println("║                       (10:00 - 18:00)                        ║");
            System.out.println("║                     (yyyy-MM-dd HH:mm)                       ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                    PIERAKSTA REZERVĒŠANA                     ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                Ievadiet vēlāmo datumu un laiku               ║");
            System.out.println("║                       (10:00 - 18:00)                        ║");
            System.out.println("║                      (gggg-MM-dd SS:mm)                      ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void invalidDate(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                         INVALID DATE                         ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                  Enter appointment's date                    ║");
            System.out.println("║                 (expample 2005-12-30 10:30)                  ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                     Back to menu (ENTER)                     ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                       NEPAREIZS DATUMS                       ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                    Ievadiet vēlāmo datumu                    ║");
            System.out.println("║                 (piemēram 2005-12-30 10:30)                  ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                   Atpakaļ uz menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void invalidTime(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                        INVALID TIME                          ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║              Appointments accepted from 10 to 18             ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                     Back to menu (ENTER)                     ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                       NEPAREIZS LAIKS                        ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║            Pierakstīties var no 10:00 līdz 18:00             ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                   Atpakaļ uz menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void timeConflict(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                        ALREADY BOOKED                        ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║          An appointment is already booked for this time      ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                     Back to menu (ENTER)                     ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                        AIZŅEMTS LAIKS                        ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                 Uz šo laiku jau ir pieraksts                 ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                    Atpakaļ uz menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void addAppointmentPurpose(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                    ADDING AN APPOINTMENT                     ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                  Enter appointments purpose                  ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                     PIERAKSTA REZERVĒŠANA                    ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                    Ievadiet tikšanās mērķi                   ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void appointmentAdded(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                 APPOINTMENT SUCCESSFULLY ADDED               ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                      Back to menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                      PIERAKSTA IZVEIDOTS                     ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                    Atpakaļ uz menu (ENTER)                   ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void appointmentListHeader(String language){
        Console.clear();
        if (language.equalsIgnoreCase("1")){
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║                      YOUR APPOINTMENTS                     ║");
            System.out.println("╠════╦════════════╦════════╦═════════════════════════════════╣");
            System.out.println("║ NR ║    DATE    ║  TIME  ║           APPOINTMENT           ║");
            System.out.println("╠════╬════════════╬════════╬═════════════════════════════════╣");
        } else{
            System.out.println("╔════════════════════════════════════════════════════════════╗");
            System.out.println("║                        JŪSU PIERAKSTI                      ║");
            System.out.println("╠════╦════════════╦════════╦═════════════════════════════════╣");
            System.out.println("║ NR ║   DATUMS   ║ LAIKS  ║            PIERAKSTS            ║");
            System.out.println("╠════╬════════════╬════════╬═════════════════════════════════╣");  
        }
    }

    public static void appointmentListFooter(String language){
        if (language.equalsIgnoreCase("1")){
            System.out.println("╠════╩════════════╩════════╩═════════════════════════════════╣");  
            System.out.println("║           Enter number to delete am appointment            ║");
            System.out.println("║                    Back to menu (ENTER)                    ║");
            System.out.println("╚════════════════════════════════════════════════════════════╝");
        } else{
            System.out.println("╠════╩════════════╩════════╩═════════════════════════════════╣");  
            System.out.println("║           Ievadiet numuru, lai dzēstu ierakstu             ║");
            System.out.println("║                  Atpakaļ uz menu (ENTER)                   ║");
            System.out.println("╚════════════════════════════════════════════════════════════╝");
        }
    }

    public static void productListHeader(String language){
        Console.clear();
        if (language.equalsIgnoreCase("1")){
            System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
            System.out.println("║                        AVAILABLE PRODUCTS                         ║");
            System.out.println("╠════╦══════════════╦═════════════════════════════════════╦═════════╣");
            System.out.println("║ NR ║     NAME     ║              DESCRIPTION            ║  PRICE  ║");
            System.out.println("╠════╬══════════════╬═════════════════════════════════════╬═════════╣");
        } else{
            System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
            System.out.println("║                          PIEEJAMĀS PRECES                         ║");
            System.out.println("╠════╦══════════════╦═════════════════════════════════════╦═════════╣");
            System.out.println("║ NR ║  NOSAUKUMS   ║              APRAKSTS               ║  CENA   ║");
            System.out.println("╠════╬══════════════╬═════════════════════════════════════╬═════════╣");
        }
    }

    public static void productListFooter(String language){
        if (language.equalsIgnoreCase("1")){
            System.out.println("╠════╩══════════════╩═════════════════════════════════════╩═════════╣");  
            System.out.println("║                Sort by:    Name (N)    Price (P)                  ║");
            System.out.println("╠═══════════════════════════════════════════════════════════════════╣");
            System.out.println("║                      Enter number to purchase                     ║");
            System.out.println("║                        Back to menu (ENTER)                       ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
        } else{
            System.out.println("╠════╩══════════════╩═════════════════════════════════════╩═════════╣");  
            System.out.println("║            Kārtot pēc:    Nosaukuma (N)    Cenas (P)              ║");
            System.out.println("╠═══════════════════════════════════════════════════════════════════╣");  
            System.out.println("║                   Ievadiet vēlāmās preces numuru                  ║");
            System.out.println("║                      Atpakaļ uz menu (ENTER)                      ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
        }
    }

    public static void productCountListFooter(String language){
        if (language.equalsIgnoreCase("1")){
            System.out.println("╠════╩══════════════╩═════════════════════════════════════╩═════════╣");  
            System.out.println("║                          How many to buy?                         ║");
            System.out.println("║                        Back to menu (ENTER)                       ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
        } else{
            System.out.println("╠════╩══════════════╩═════════════════════════════════════╩═════════╣");  
            System.out.println("║                       Cik vēlaties nopirkt?                       ║");
            System.out.println("║                      Atpakaļ uz menu (ENTER)                      ║");
            System.out.println("╚═══════════════════════════════════════════════════════════════════╝");
        }
    }

    public static void noAvailableProducts(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                      NO AVAILABLE PRODUCTS                   ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                      Back to menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                      NAV PIEEJAMU PREČU                      ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                    Atpakaļ uz menu (ENTER)                   ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void outOfStock(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                      INVALID QUANTITY OR                     ║");
            System.out.println("║                         OUT OF STOCK                         ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                     Back to menu (ENTER)                     ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                     NEPAREIZS DAUDZUMS VAI                   ║");
            System.out.println("║                      NEPIETIEKAMI KRĀJUMI                    ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                    Atpakaļ uz menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void invalidInput(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                        INVALID NUMBER                        ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                      Back to menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                      NEPAREIZS SKAITLIS                      ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                    Atpakaļ uz menu (ENTER)                   ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void productBought(String language, String name, int count, double price){
        Console.clear();

        String line1 = String.format("YOU BOUGHT %d x %s", count, name);
        String line2 = String.format("FOR €%.2f", price);
        int padding1 = (62 - line1.length()) / 2;
        int padding2 = (62 - line2.length()) / 2;

        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.printf("║%" + padding1 + "s%s%" + (62 - padding1 - line1.length()) + "s║\n", "", line1, "");
            System.out.printf("║%" + padding2 + "s%s%" + (62 - padding2 - line2.length()) + "s║\n", "", line2, "");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                     Back to menu (ENTER)                     ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            String line3 = String.format("JŪS NOPIRKĀT %d x %s", count, name);
            String line4 = String.format("PAR €%.2f", price);
            int padding3 = (62 - line1.length()) / 2;
            int padding4 = (62 - line2.length()) / 2;
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.printf("║%" + padding3 + "s%s%" + (62 - padding3 - line3.length()) + "s║\n", "", line3, "");
            System.out.printf("║%" + padding4 + "s%s%" + (62 - padding4 - line4.length()) + "s║\n", "", line4, "");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                      Back to menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void appointmentDeleted(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║               APPOINTMENT SUCCESSFULLY DELETED               ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                      Back to menu (ENTER)                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                 PIERAKSTS VEIKSMĪGI IZDZĒSTS                 ║");
            System.out.println("║                                                              ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                    Atpakaļ uz menu (ENTER)                   ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }

    public static void exit(String language){
        Console.clear();
        if(language.equalsIgnoreCase("1")){
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                     THANKS FOR USING!                        ║");
            System.out.println("║                            BYE!                              ║");
            System.out.println("║                                                              ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        } else{
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║\u001B[36m             _   _                 _ _        _               \u001B[0m║");
            System.out.println("║\u001B[36m            | | | |               (_) |      | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | |_| | ___  ___ _ __  _| |_ __ _| |              \u001B[0m║");
            System.out.println("║\u001B[36m            |  _  |/ _ \\/ __| '_ \\| | __/ _` | |              \u001B[0m║");
            System.out.println("║\u001B[36m            | | | | (_) \\__ \\ |_) | | || (_| | |              \u001B[0m║");
            System.out.println("║\u001B[36m            |_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|              \u001B[0m║");
            System.out.println("║\u001B[36m                            | |                               \u001B[0m║");
            System.out.println("║\u001B[36m                            |_|                               \u001B[0m║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");
            System.out.println("║                                                              ║");
            System.out.println("║                  PALDIES PAR IZMANTOŠANU!                    ║");
            System.out.println("║                         VISU LABU!                           ║");
            System.out.println("║                                                              ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
            System.out.println();
        }
    }
}