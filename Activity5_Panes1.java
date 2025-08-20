
package com.joysistvi.activity5.nestedforloop;
import java.util.Scanner; 
public class Activity5_Panes1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter number you want to display: ");
            int number = scanner.nextInt();

            System.out.println("Multiplication Table of " + number);

            for (int i = 1; i <= 10; i++) {
                int product = number * i;
                System.out.println("\t" + number + " x " + i + " = " + product);
            }

            System.out.print("Do you want to display another number? (Y/N): ");
            choice = scanner.next();

            System.out.println();

        } while (choice.equalsIgnoreCase("Y")); //"IgnoreCase" to consider both upper and lowercase inputs

        System.out.println("Thank you for using the program!");
        scanner.close();
       
    }
}
