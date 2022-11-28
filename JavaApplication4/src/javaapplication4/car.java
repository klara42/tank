/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author user
 */
public class car {
  public String modell; 
  public int tank;   

    public car(String modell, int tank) {
        this.modell = modell;
        this.tank = tank;
    }

    
 public int calculate (distance s){
    int strecke; 
    strecke = (tank*100)/s.laenge; 
    return strecke;
    
 }   
    
}
