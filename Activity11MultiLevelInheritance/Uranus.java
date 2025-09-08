/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joysistvi.oopactivity.day25;

/**
 *
 * @author Admin
 */
public class Uranus extends OuterPlanet {
    public void displayUranus(){ 
        Uranus us = new Uranus(); 
        
        us.name = "Uranus"; 
        us.sizeInDiameter = 50724; 
        us.numberOfMoons = 27; 
        
        System.out.println("\tPlanet: " + us.name);
        System.out.println("Size (Diamete): " + us.sizeInDiameter + "km");
        System.out.println("Number of moons: " + us.numberOfMoons);
    }
}
