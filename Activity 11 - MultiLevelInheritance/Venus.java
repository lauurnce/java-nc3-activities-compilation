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
public class Venus extends InnerPlanet {
    public void displayVenusProperties(){
        Venus vn = new Venus(); 
        vn.type = "Inner Planet";
        vn.name = "Venus"; 
        vn.distanceFromSun = 108.2;
        vn.surfaceTemperature = 465; 
        
        
        System.out.println("\tPlanet: " + vn.name);
        System.out.println("Distance from sun: " + vn.distanceFromSun + " million km");
        System.out.println("Surface Temperature: " + vn.surfaceTemperature+ " °C");
    }
}
