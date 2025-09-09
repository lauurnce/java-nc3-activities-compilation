package com.joysistvi.activity6.multidimensionalarray;

import java.util.Scanner;

public class Activity6_Panes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("\t\tAverage Calculator");
        System.out.println("=================================================");

        System.out.print("Enter number of students: ");
        int noOfStudents = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int noOfSubjects = scanner.nextInt();
        scanner.nextLine();
        
        String[] core0 = new String[noOfSubjects];
        String[] core1 = new String[noOfStudents];
        int[][] core2 = new int[noOfStudents][noOfSubjects];

        System.out.println("\nEnter subject names: ");
        for (int i = 0; i < core0.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            core0[i] = scanner.nextLine();

        }

        for (int i = 0; i < noOfStudents; i++) {
            System.out.print("\nName of Student " + (i + 1) + ": ");
            core1[i] = scanner.nextLine();
            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < noOfSubjects; j++) {
                System.out.print(core0[j] + ": ");
                core2[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        System.out.println("=================================================");
        System.out.println("\t\tGrades Report");
        System.out.println("=================================================");

        System.out.print("Students\t");
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("\t" + core0[i] + "\t");
        }
        System.out.println("Average");

        for (int i = 0; i < noOfStudents; i++) {
            System.out.print(core1[i] + "\t");
            int sum = 0;
            for (int j = 0; j < noOfSubjects; j++) {
                System.out.print("%-10s"+core2[i][j] + "\t");
                sum += core2[i][j];
            }
            double average = sum / noOfSubjects;
            System.out.println("\t" + average);
        }

    }
}
