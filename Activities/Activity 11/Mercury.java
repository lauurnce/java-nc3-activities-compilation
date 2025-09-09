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
public class Mercury extends InnerPlanet {
    
    public void displayMercuryProperties(){
        Mercury mc = new Mercury(); 
        mc.type = "Inner Planet";
        mc.name = "Mercury"; 
        mc.distanceFromSun = 57.9;
        mc.surfaceTemperature = 167; 
        
        
        System.out.println("\tPlanet: " + mc.name);
        System.out.println("Distance from sun: "+mc.distanceFromSun + " million km");
        System.out.println("Surface Temperature: "+ mc.surfaceTemperature + " °C");
    }
}
