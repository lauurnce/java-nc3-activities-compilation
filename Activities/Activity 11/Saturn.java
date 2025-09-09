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
public class Saturn extends OuterPlanet{
     public void displaySaturn(){ 
        Saturn st = new Saturn(); 
        
        st.name = "Saturn"; 
        st.sizeInDiameter = 116460; 
        st.numberOfMoons = 83; 
        
        System.out.println("\tPlanet: " + st.name);
        System.out.println("Size (Diamete): " + st.sizeInDiameter + "km");
        System.out.println("Number of moons: " + st.numberOfMoons);
    }
}
