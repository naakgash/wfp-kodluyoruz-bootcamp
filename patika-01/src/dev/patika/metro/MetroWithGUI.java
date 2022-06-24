package dev.patika.metro;
// GitHub Test
import javax.swing.*;
// .jar(java artifacts), .ear(enterprise artifacts), .war(web artifacts)
public class MetroWithGUI {
    // instance variable define in class, and it automatically initializes as default.
    private static int test;
    // things defined as static communicate with things defined as static.
    private static double balance;

    public static void main( String[] args ) {
        int choose = 0; // local variable define in the method, and it must initialize.

        do {

            String input = JOptionPane.showInputDialog( "1- Show card balance: \n"
            + "2- Load money on the card: \n"
            + "3- Take the metro: \n"
            + "4- Exit the system: " );

            switch ( Integer.valueOf( input ) ) {
                case 1 -> getBalance();
                case 2 -> loadMoney();
                case 3 -> takeMetro();
                case 4 -> exitSystem();
                default -> JOptionPane.showMessageDialog( null,"You made the wrong choice. Please try again.");
            }

        } while ( choose != 4 );
    }

    private static void exitSystem() {
        JOptionPane.showMessageDialog( null, "By By :)" );
        System.exit(0);
    }

    private static void takeMetro() {
        String ticketType = JOptionPane.showInputDialog("Select the passenger " +
                "type: \n\t1- Full ticket \n\t2- Discount ticket \n\t3- Free ticket");

        if ( Integer.valueOf( ticketType ) == 1 ) {

            if ( balance > 6.5 ){
                balance -= 6.5;
                JOptionPane.showMessageDialog( null,"Full ticket! Have a good journey :)" );
            } else {
                JOptionPane.showMessageDialog( null,"Insufficient balance." );
            }

        } else if ( Integer.valueOf(ticketType ) == 2) {

            if ( balance > 3 ) {
                balance -= 3;
                JOptionPane.showMessageDialog( null,"Discount ticket! Have a good journey :)" );
            } else {
                JOptionPane.showMessageDialog( null,"Insufficient balance." );
                getBalance();
            }

        } else if ( Integer.valueOf(ticketType) == 3 ) {
            JOptionPane.showMessageDialog( null,"Free ticket! Have a good journey :)");
        } else {
            JOptionPane.showMessageDialog( null,"You made the wrong choice. Please try again.");
            takeMetro();
        }
        getBalance();
    }

    private static void loadMoney() {
        String loadedMoney = JOptionPane.showInputDialog( "Enter the amount of money to be loaded: " );
        if ( Double.valueOf( loadedMoney ) >= 5 ) {
            balance += Double.valueOf( loadedMoney );
            getBalance();
        } else {
            JOptionPane.showMessageDialog( null,"You can load up to 5 TL or more.");
        }
    }


    private static void getBalance() { // method signature
        JOptionPane.showMessageDialog( null, "Your Card Balance: " + balance + "TL." );
    }
}
