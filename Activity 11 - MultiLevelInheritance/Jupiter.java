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
public class Jupiter extends OuterPlanet {
    public void displayJupiter(){ 
        Jupiter jp = new Jupiter(); 
        
        jp.name = "Jupiter"; 
        jp.sizeInDiameter = 139820; 
        jp.numberOfMoons = 79; 
        
        System.out.println("\tPlanet: " + jp.name);
        System.out.println("Size (Diamete): " + jp.sizeInDiameter + "km");
        System.out.println("Number of moons: " + jp.numberOfMoons);
    }
}
