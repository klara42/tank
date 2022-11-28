/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
   
        
    public static void main(String[] args) {
             
      Scanner input = new Scanner (System.in);
      
      car a1 = new car ("Porsche", 20);
      distance s = new distance (100);
      int t1 = a1.calculate(s);
        System.out.println(t1);
        
    }
    
}
