package com.joysistvi.methods.loadregistration;

import java.util.Scanner;

public class LoadRegistrationSystem {

    public static void main(String[] args) {
        
        mainMenu();   
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dial *143# to proceed to Load Registration");
        System.out.print("Enter numbers: ");
        String dial = scanner.nextLine();
        if (dial.equals("*143#")) {
            System.out.println("\n\tLoad Registration");
            System.out.println("[1] NEW ALLSURF99");
            System.out.println("[2] NEW PawerSURF");
            System.out.println("[3] EasySURF");
            System.out.println("[0] Exit");
            System.out.print("Enter your chosen number:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ALLSURF99();
                    break;
                case 2:
                    PawerSURF();
                    break;
                case 3:
                    EasySURF();
                    break;
                case 0:
                    stop();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } else {
            System.out.println("Invalid USSD Code");
        }
    }

    public static void ALLSURF99() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n\t9GB data + 7GB(1GB/day) for FUNALIW apps");
        System.out.println("(FB, YouTube, ML, TikTok, atbp.) + unli all-net  texts.");
        System.out.println("\t[1] Register");
        System.out.println("\t[2] Stop");
        System.out.println("\t[3] Back");
        System.out.print("Enter your chosen number:");
        int NEWALLSURF99 = scanner.nextInt();

        switch (NEWALLSURF99) {
            case 1:
                register();
                break;
            case 2:
                stop();
                break;
            case 3:
                mainMenu();
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }

    public static void PawerSURF() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n*\t[1] NEW PawerSURF 30");
        System.out.println("\t[2] NEW PawerSURF 20");
        System.out.println("\t[3] PawerSURF99");
        System.out.println("\t[4] Back");
        System.out.print("Enter your chosen number:");
        int NEWPawerSURF = scanner.nextInt();

        switch (NEWPawerSURF) {
            case 1:
                subscribe1(3, 30, 3);
                break;
            case 2:
                subscribe1(2, 20, 2);
                break;
            case 3:
                subscribe1(6, 99, 7);
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void subscribe1(int gb, int cost, int days) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println(gb + "GB data  at UNLI calls & texts to all networks,+" + cost + "php for " + days + "days!");

        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Back");
        System.out.println("    [3] Exit");
        System.out.print("Enter a choice: ");
        int choiceGoPlus = scanner.nextInt();

        if (choiceGoPlus == 1) {
            register();
        } else if (choiceGoPlus == 2) {
            PawerSURF();
        } else {
            stop();
        }
    }

    public static void EasySURF() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\nMobile data + your choice of freebie!");
        System.out.println("\t[1] EasySURF50");
        System.out.println("\t[2] EZ75 w/ All-Net");
        System.out.println("\t[3] EZ90");
        System.out.println("\t[4] EZ99 (16GB)");
        System.out.println("\t[5] EZ110 (18GB)");
        System.out.println("\t[6] Back");
        System.out.println("\t[7] Exit");
        System.out.print("Enter your chosen number:");
        int EasySURF = scanner.nextInt();

        switch (EasySURF) {
            case 1:
                EZ50();
                break;
            case 2:
                EZ75();
                break;
            case 3:
                EZ90();
                break;
            case 4:
                EZ99();
                break;
            case 5:
                EZ110();
                break;
            case 6:
                mainMenu();
                break;
            case 7:
                stop();
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }

    public static void EZ50() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n6GB+Unli ALLNET texts, 3days");
        System.out.println("\t[1] EZ50 FunALIW");
        System.out.println("\t[2] EZ50 FunACHIEVE");
        System.out.println("\t[3] FREE EXTEND");
        System.out.println("\t[4] Back");
        System.out.print("Enter your chosen number: ");
        int EasySURF1 = scanner.nextInt();

        switch (EasySURF1) {
            case 1:
                FunALIW(3, 3, 1);
                break;
            case 2:
                FunACHIEVE(3, 3, 1);
                break;
            case 3:
                extend();
                break;
            case 4:
                EasySURF();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void EZ75() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n2GB data, 6GB apps, unli ALLNET calls&texts, P75/3days");
        System.out.println("\t[1] EZ75 FunALIW");
        System.out.println("\t[2] EZ75 FunACHIEVE");
        System.out.println("\t[3] FREE EXTEND");
        System.out.println("\t[4] Back");
        System.out.print("Enter your chosen number:");
        int EasySURF2 = scanner.nextInt();

        switch (EasySURF2) {
            case 1:
                FunALIW(6, 6, 2);
                break;
            case 2:
                FunACHIEVE(6, 6, 2);
                break;
            case 3:
                extend();
                break;
            case 4:
                EasySURF();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void EZ90() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n2GB data, 7GB apps, unli ALLNET texts, P90/7days");
        System.out.println("\t[1] EZ90 FunALIW");
        System.out.println("\t[2] EZ90 FunACHIEVE");
        System.out.println("\t[3] FREE EXTEND");
        System.out.println("\t[3] Back");
        System.out.print("Enter your chosen number:");
        int EasySURF3 = scanner.nextInt();

        switch (EasySURF3) {
            case 1:
                FunALIW(2, 7, 1);
                break;
            case 2:
                FunACHIEVE(2, 7, 1);
                break;
            case 3:
                extend();
                break;
            case 4:
                EasySURF();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void EZ99() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n2GB data, 14GB apps (2GB/day), P99/7 days");
        System.out.println("\t[1] EZ99 FunALIW");
        System.out.println("\t[2] EZ99 FunACHIEVE");
        System.out.println("\t[3] FREE EXTEND");
        System.out.println("\t[4] Back");
        System.out.print("Enter your chosen number:");
        int EasySURF4 = scanner.nextInt();

        switch (EasySURF4) {
            case 1:
                FunALIW(2, 14, 2);
                break;
            case 2:
                FunACHIEVE(2, 14, 2);
                break;
            case 3:
                extend();
                break;
            case 4:
                EasySURF();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void EZ110() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n4GB data, 14GB apps(2GB/day), Unli ALLNET texts, P110/7days");
        System.out.println("\t[1] EZ110 FunALIW");
        System.out.println("\t[2] EZ110 FunACHIEVE");
        System.out.println("\t[3] EZ110 w/ 5G Access");
        System.out.println("\t[4] Back");
        System.out.print("Enter your chosen number:");
        int EasySURF5 = scanner.nextInt();

        switch (EasySURF5) {
            case 1:
                FunALIW(4, 14, 2);
                break;
            case 2:
                FunACHIEVE(4, 14, 2);
                break;
            case 3:
                extend();
                break;
            case 4:
                EasySURF();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void FunALIW(int gb, int free, int gbPerDay) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n" + gb + "GB data+" + free + "GB (" + gbPerDay + "GB/day) for FunALIW apps");
        System.out.println("(FB, YT, ML, TikTok, atbp.)");

        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Exit");
        System.out.print("Enter a choice: ");
        int choiceGoPlus = scanner.nextInt();

        if (choiceGoPlus == 1) {
            register();
        } else if (choiceGoPlus == 2) {
            stop();
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void FunACHIEVE(int gb, int free, int gbPerDay) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\n" + gb + "GB data+" + free + "GB (" + gbPerDay + "GB/day) for FunACHIEVE apps");
        System.out.println("(Google Meet, MS Teams, Zoom, Instagram, atbp.");

        System.out.println("    [1] Subscribe");
        System.out.println("    [2] Exit");
        System.out.print("Enter a choice: ");
        int choiceGoPlus = scanner.nextInt();

        if (choiceGoPlus == 1) {
            register();
        } else if (choiceGoPlus == 2) {
            stop();
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void stop() {
        System.out.println("Salamat sa pagtangkilik sa TM!");
    }

    public static void register() {
        System.out.println("\nSalamat sa pagtangkilik sa TM! Antayin na lamang po ang reply");
        System.out.println("makalipas ang ilang sandali.");
    }


    public static void extend() {
        System.out.println("\nExtra 1 day validty para sa iyong active registration");
    }
}
