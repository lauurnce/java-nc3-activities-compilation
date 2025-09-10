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
public class Bird extends Animal {
    @Override
    public void animalDiet(String diet) {
       System.out.printf("%-12s | %s%n", "Bird", diet);
    }

    @Override
    public void temperature() {
        System.out.printf("%-12s | %s%n", "Bird", "I am warm-blooded!");
    }
}
