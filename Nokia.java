import java.util.Scanner;
public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mainMenu(input);
    }

    // MAIN MENU
    public static void mainMenu(Scanner input) {
        System.out.println("--- NOKIA 3310 MAIN MENU ---");
        System.out.println("1. Phonebook");
        System.out.println("2. Messages");
        System.out.println("3. Chat");
        System.out.println("4. Call Register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call Divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM Services");
        System.out.println("0. Exit");
        System.out.print("Select: ");

        int choice = input.nextInt();

        switch (choice) {
            case 1: phonebookMenu(input); break;
            case 2: messagesMenu(input); break;
            case 3: chatMenu(input); break;
            case 4: callRegisterMenu(input); break;
            case 5: tonesMenu(input); break;
            case 6: settingsMenu(input); break;
            case 7: callDivertMenu(input); break;
            case 8: gamesMenu(input); break;
            case 9: calculatorMenu(input); break;
            case 10: remindersMenu(input); break;
            case 11: clockMenu(input); break;
            case 12: profilesMenu(input); break;
            case 13: simServicesMenu(input); break;

            case 0:
                System.out.println("Exiting phone...");
                return;

            default:
                System.out.println("Invalid choice!");
                mainMenu(input);
        }
    }

    // PHONEBOOK
    public static void phonebookMenu(Scanner input) {
        System.out.println("\n--- Phonebook ---");
        System.out.println("1. Search");
        System.out.println("2. Add Name");
        System.out.println("0. Back");
        System.out.print("Select: ");

        int c = input.nextInt();

        switch (c) {
            case 1: 
                System.out.println("Searching (not implemented)...");
                phonebookMenu(input); 
                break;

            case 2: 
                System.out.println("Adding Name (not implemented)...");
                phonebookMenu(input);  
                break;

            case 0: 
                mainMenu(input);
                break;

            default:
                System.out.println("Invalid choice!");
                phonebookMenu(input);
        }
    }

    // MESSAGES 
    public static void messagesMenu(Scanner input) {
        System.out.println("\n--- Messages ---");
        System.out.println("1. Write Message");
        System.out.println("2. Inbox");
        System.out.println("0. Back");
        System.out.print("Select: ");

        int c = input.nextInt();

        switch (c) {
            case 1:
                System.out.println("Writing Message...");
                messagesMenu(input);
                break;

            case 2:
                System.out.println("Inbox Opened...");
                messagesMenu(input);
                break;

            case 0:
                mainMenu(input);
                break;

            default:
                System.out.println("Invalid!");
                messagesMenu(input);
        }
    }

    // CHAT
    public static void chatMenu(Scanner input) {
        System.out.println("\n--- Chat ---");
        System.out.println("Chat not available.");
        System.out.println("0. Back");
        System.out.print("Select: ");
        int c = input.nextInt();

        switch (c) {
            case 0: mainMenu(input); break;
            default: chatMenu(input);
        }
    }

    // CALL REGISTER
    public static void callRegisterMenu(Scanner input) {
        System.out.println("\n--- Call Register ---");
        System.out.println("1. Missed Calls");
        System.out.println("2. Received Calls");
        System.out.println("0. Back");
        System.out.print("Select: ");

        int c = input.nextInt();

        switch (c) {
            case 1:
                System.out.println("Missed Calls...");
                callRegisterMenu(input);
                break;

            case 2:
                System.out.println("Received Calls...");
                callRegisterMenu(input);
                break;

            case 0:
                mainMenu(input);
                break;

            default:
                callRegisterMenu(input);
        }
    }

    // TONES
    public static void tonesMenu(Scanner input) {
        System.out.println("\n--- Tones ---");
        System.out.println("1. Ringing Tone");
        System.out.println("0. Back");
        System.out.print("Select: ");

        int c = input.nextInt();

        switch (c) {
            case 1:
                System.out.println("Tone selected.");
                tonesMenu(input);
                break;

            case 0:
                mainMenu(input);
                break;

            default:
                tonesMenu(input);
        }
    }

    // SETTINGS
    public static void settingsMenu(Scanner input) {
        System.out.println("\n--- Settings ---");
        System.out.println("1. Phone Settings");
        System.out.println("0. Back");
        System.out.print("Select: ");

        int c = input.nextInt();

        switch (c) {
            case 1:
                System.out.println("Phone settings...");
                settingsMenu(input);
                break;

            case 0:
                mainMenu(input);
                break;

            default:
                settingsMenu(input);
        }
    }

    // CALL DIVERT
    public static void callDivertMenu(Scanner input) {
        System.out.println("\n--- Call Divert ---");
        System.out.println("Feature not available.");
        System.out.println("0. Back");
        int c = input.nextInt();

        switch (c) {
            case 0: mainMenu(input); break;
            default: callDivertMenu(input);
        }
    }

    // GAMES
    public static void gamesMenu(Scanner input) {
        System.out.println("\n--- Games ---");
        System.out.println("1. Snake");
        System.out.println("0. Back");
        int c = input.nextInt();

        switch (c) {
            case 1:
                System.out.println("Launching Snake...");
                gamesMenu(input);
                break;

            case 0:
                mainMenu(input);
                break;

            default:
                gamesMenu(input);
        }
    }

    // CALCULATOR
    public static void calculatorMenu(Scanner input) {
        System.out.println("\n--- Calculator ---");
        System.out.println("Not implemented.");
        System.out.println("0. Back");
        int c = input.nextInt();

        switch (c) {
            case 0: mainMenu(input); break;
            default: calculatorMenu(input);
        }
    }

    // REMINDERS
    public static void remindersMenu(Scanner input) {
        System.out.println("\n--- Reminders ---");
        System.out.println("No reminders.");
        System.out.println("0. Back");
        int c = input.nextInt();

        switch (c) {
            case 0: mainMenu(input); break;
            default: remindersMenu(input);
        }
    }

    // CLOCK
    public static void clockMenu(Scanner input) {
        System.out.println("\n--- Clock ---");
        System.out.println("1. Alarm");
        System.out.println("0. Back");
        int c = input.nextInt();

        switch (c) {
            case 1:
                System.out.println("Alarm selected.");
                clockMenu(input);
                break;

            case 0:
                mainMenu(input);
                break;

            default:
                clockMenu(input);
        }
    }

    // PROFILES
    public static void profilesMenu(Scanner input) {
        System.out.println("\n--- Profiles ---");
        System.out.println("Normal / Silent / Vibrate");
        System.out.println("0. Back");
        int c = input.nextInt();

        switch (c) {
            case 0: mainMenu(input); break;
            default: profilesMenu(input);
        }
    }

    // SIM SERVICES
    public static void simServicesMenu(Scanner input) {
        System.out.println("\n--- SIM Services ---");
        System.out.println("Not available.");
        System.out.println("0. Back");
        int c = input.nextInt();

        switch (c) {
            case 0: mainMenu(input); break;
            default: simServicesMenu(input);
        }
    }
}
