
package com.joysistvi.activity3.ifdecisionmaking;

import java.util.Scanner;
public class Activity3_Panes {
 
    public static void main(String[] args) {
        
       /* 
        Age: 0 - 2 Category: Baby+
        Age: 3 - 12 Category: Child
        Age: 13 - 19 Category: Teenager
        Age: 20 - 29 Category: Young Adult
        Age: 30 - 59 Category: Adult
        Age: 60 - 100 Category: Senior
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Categories:  Baby |  Child  | Teenager | Young Adult |   Adult   |  Senior");
        System.out.println("  Age:      0 - 2 |  3 - 12 | 13 - 19  |   20 - 29   |  30 - 59  |  60 - 100 ");
        System.out.println("");
        System.out.println("Input your Age: "); 
        int age = scanner.nextInt();
        
        System.out.println("Category: ");
        if (age >= 0 && age <=2) {
            System.out.println("Baby");
        }  else if (age >= 3 && age <= 12) {
            System.out.println("Child");
        }  else if (age >= 13 && age <=19) {
            System.out.println("Teenager");
        }  else if (age >= 20 && age <= 29) {
            System.out.println("Young Adult");
        }  else if (age >= 30 && age <= 59) {
            System.out.println("Adult");
        }  else if (age >= 60 && age <= 100 || age > 100) {
            System.out.println("Senior");
        }  else {
            System.out.println("Invalid input");
        }
        
        
        
    }
}
