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
public class Neptune extends OuterPlanet {
     public void displayNeptune(){ 
        Neptune np = new Neptune(); 
        
        np.name = "Neptune"; 
        np.sizeInDiameter = 49244; 
        np.numberOfMoons = 14; 
        
        System.out.println("\tPlanet: " + np.name);
        System.out.println("Size (Diamete): " + np.sizeInDiameter + "km");
        System.out.println("Number of moons: " + np.numberOfMoons);
    }
}

