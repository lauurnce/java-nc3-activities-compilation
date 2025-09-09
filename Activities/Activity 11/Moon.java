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
public class Moon extends Earth {
    
    public void displayMoonProperties(){
        Moon mn = new Moon (); 
        
        mn.distanceFromEarth = 384400; 
        mn.temperature = -20; 
        mn.name = "Moon";
        
        System.out.println("\tName: " + mn.name);
        System.out.println("Distance from Earth: " + mn.distanceFromEarth +" km");
        System.out.println("Surface temperature: " + mn.temperature +" °C");
          
 
    }
}
