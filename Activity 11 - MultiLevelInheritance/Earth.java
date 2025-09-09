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
public class Earth extends InnerPlanet {
    
    float distanceFromEarth; 
    int temperature; 
    String name;
    
   
    public void displayEarthProperties(){
        Earth ea = new Earth(); 
        ea.type = "Inner Planet";
        ea.name = "Earth"; 
        ea.distanceFromSun = 149.6;
        ea.surfaceTemperature = 15; 
        
        
        System.out.println("\tPlanet: " + ea.name);
        System.out.println("Distance from sun: " + ea.distanceFromSun + " million km");
        System.out.println("Surface Temperature: " + ea.surfaceTemperature + " °C");
    }
}
