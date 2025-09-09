
package com.joysistvi.encapsulation.model;


public class Repository {
    
   private String driver; 
   private String team; 
   private int number; 
   private int trophy; 
   private String nationality;
   
   public void setDriver(String driver){
       this.driver=driver;
   }
   
   public String getDriver(){
       return driver;
   }
   
   public void setTeam(String team){
       this.team=team;
   }
   
   public String getTeam(){
       return team;
   }
   
   public void setNumber(int number){
       this.number=number;
   }
   
   public int getNumber(){
       return number;
   }
   
   public void setTrophy(int trophy){
       this.trophy=trophy;
   }
   
   public int getTrophy(){
       return trophy;
   }
   
   public void setNationality(String nationality){
       this.nationality=nationality;
   }
   
   public String getNationality(){
       return nationality;
   }
}
