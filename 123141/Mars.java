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
public class Mars extends InnerPlanet {
    public void displayMarsProperties(){
        Mars ms = new Mars(); 
        ms.type = "Inner Planet";
        ms.name = "Mars"; 
        ms.distanceFromSun = 227.9;
        ms.surfaceTemperature = -65; 
        
        
        System.out.println("\tPlanet: " + ms.name);
        System.out.println("Distance from sun: " + ms.distanceFromSun + " million km");
        System.out.println("Surface Temperature: " + ms.surfaceTemperature + " °C");
    }
}
