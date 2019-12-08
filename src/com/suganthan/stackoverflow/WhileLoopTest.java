package com.suganthan.stackoverflow;

import java.util.Scanner;

/**
 * Created by msuganthan on 18/5/19.
 */
public class WhileLoopTest {
    public static void main(String[] args) {
        boolean main_menu = true;
        int ticket_option = 0;
        int confirm_purchase = 0;
        Scanner input = new Scanner(System.in);
        while (main_menu) {
            System.out.println("       Welcome to Zoos Victoria          ");
            System.out.println("        M A I N        M E N U           ");
            System.out.println(" Zoo has the following ticketing options:");
            System.out.println("         1 = Child (4-5 yrs)             ");
            System.out.println("         2 = Adult (18+ yrs)             ");
            System.out.println("      3 = Senior (60+ yrs) "  +  "\n"     );

            do {
                // select ticket option
                System.out.println(" Please enter your option:"     );
                ticket_option = input.nextInt();

                switch (ticket_option) {

                    // Child_ticket
                    case 1:
                        System.out.println(" Child tickets");
                        break;

                    // adult ticket
                    case 2:
                        System.out.println(" Adult tickets");
                        break;

                    //senior ticket
                    case 3:
                        System.out.println(" Senior tickets");
                        break;
                    default:
                        System.out.println("Invalid entry!");
                }

            } while( ticket_option > 3); //end of do while loop

            System.out.println(" Press 1 to confirm purchase");
            confirm_purchase = input.nextInt();

            if (confirm_purchase == 1) {
                System.out.println("Total amount payable: "+ "$");
                main_menu = false;
            } else {
                System.out.println("invalid key!");
            }
        } // end while loop
    }
}
