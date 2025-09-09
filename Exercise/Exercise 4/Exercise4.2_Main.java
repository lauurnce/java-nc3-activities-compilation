package com.joysistvi.encapsulation.model;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Repository[] f1 = new Repository[3];

        System.out.println("|==========Formula 1 Grand Prix 2025==========|");
        System.out.println("\tDriver Registration System");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDriver no. " + (i+1));
            f1 [i]= new Repository(); 
            
            System.out.print("Driver's Name: ");
            String name = sc.nextLine(); 
            f1[i].setDriver(name);
            
            System.out.print("Team: ");
            String team = sc.nextLine(); 
            f1[i].setTeam(team);
            
            System.out.print("Car Number: ");
            int number = sc.nextInt(); 
            f1[i].setNumber(number);
            
            System.out.print("Number of trophy/trophies: ");
            int trophy = sc.nextInt(); 
            f1[i].setTrophy(trophy);
            sc.nextLine();

            System.out.print("Nationality: ");
            String nationality = sc.nextLine(); 
            f1[i].setNationality(nationality);
        }
        
        System.out.println("|==========Driver's Information==========|");
        for (int i = 0; i < 3; i++) {
            System.out.println("Driver" + (i+1) + ": " + f1[i].getDriver());
            System.out.println("\t Team:" + f1[i].getTeam());
            System.out.println("\tCar Number: " + f1[i].getNumber());
            System.out.println("\tNo. of Trophy: " + f1[i].getTrophy());
            System.out.println("\tNationality: " + f1[i].getNationality());
        }
        
    }

}
