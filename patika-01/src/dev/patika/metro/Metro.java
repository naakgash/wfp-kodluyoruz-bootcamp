package dev.patika.metro;

import java.util.Scanner;

public class Metro {
    // instance variable define in class, and it automatically initializes as default.
    private static int test;
    // things defined as static communicate with things defined as static.
    private static Scanner scn = new Scanner(System.in);
    private static double balance;

    public static void main(String[] args) {
        int choose = 0; // local variable define in the method, and it must initialize.

        do {
            System.out.println("1- Show card balance: ");
            System.out.println("2- Load money on the card: ");
            System.out.println("3- Take the metro: ");
            System.out.println("4- Exit the system.");

            System.out.print("Choose: ");
            choose = scn.nextInt();

            switch (choose) {
                case 1:
                    getBalance();
                    break;
                case 2:
                    loadMoney();
                    break;
                case 3:
                    takeMetro();
                    break;
                case 4:
                default:
                    exitSystem();
                    break;

            }
        } while (choose != 4);



    }

    private static void exitSystem() {
        System.out.println("By By :)");
        System.exit(0);
    }

    private static void takeMetro() {
        System.out.println("Select the passenger " +
                "type: \n\t1- Full ticket \n\t2- Discount ticket \n\t3- Free ticket.");
        System.out.print("Choose: ");
        int ticketType = scn.nextInt();

        if (ticketType == 1) {

            if (balance > 6.5){
                balance -= 6.5;
                System.out.println("Full ticket! Have a good journey :)");
            } else {
                System.out.print("Insufficient balance. ");
            }

        } else if (ticketType == 2) {

            if (balance > 3) {
                balance -= 3;
                System.out.println("Discount ticket! Have a good journey :)");
            } else {
                System.out.print("Insufficient balance. Your balance is ");
                getBalance();
            }

        } else if (ticketType == 3) {
            System.out.println("Free ticket! Have a good journey :)");
        }else {
            System.out.println("You made the wrong choice. Please try again.");
            takeMetro();
        }
        getBalance();
    }

    private static void loadMoney() {
        System.out.print("Enter the amount of money to be loaded: ");
        double loadedMoney = scn.nextDouble();
        balance += loadedMoney;
        getBalance();
    }

    private static void getBalance() { // method signature
        System.out.println("Your Card Balance: " + balance + "TL.");
    }
}
