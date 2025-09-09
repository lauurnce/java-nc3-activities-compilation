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
        // Polymorphism in action
        Animal a1 = new Mammal();
        Animal a2 = new Reptile();
        Animal a3 = new Bird();
        Animal a4 = new Amphibian();
        Animal a5 = new Fish();

        // Diets
        a1.animalDiet("plants and meat");
        a2.animalDiet("insects");
        a3.animalDiet("seeds and worms");
        a4.animalDiet("small insects");
        a5.animalDiet("plankton");

        System.out.println();

        // Temperatures
        a1.temperature(); // Mammal inherits default
        a2.temperature(); // Reptile inherits default
        a3.temperature(); // Bird override
        a4.temperature(); // Amphibian override
        a5.temperature(); // Fish override

        System.out.println();

        // Mammal static method
        System.out.println("Is Human Class? " + Mammal.isHumanClass(true));
    }
}
 