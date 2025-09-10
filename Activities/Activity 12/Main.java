/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.polymorphismactivity.day27;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        Animal mm = new Mammal();
        Animal rp = new Reptile();
        Animal bd = new Bird();
        Animal ap = new Amphibian();
        Animal fs = new Fish();

        System.out.println("======ANIMALS INFORMATION====");
        System.out.printf("%-12s | %s%n", "Animal", "Diet");
        System.out.println("-----------------------------");
        mm.animalDiet("plants and meat");
        rp.animalDiet("insects");
        bd.animalDiet("seeds and worms");
        ap.animalDiet("small insects");
        fs.animalDiet("plankton");

        System.out.println("\n=============================");
        System.out.printf("%-12s | %s%n", "Animal", "Temperature");
        System.out.println("-----------------------------");
        bd.temperature();
        ap.temperature();
        fs.temperature();

        System.out.println("\nQUESTION/S: ");
        System.out.println("Is Human considered a mammal? " + Mammal.isHumanClass(true));
    }
}
