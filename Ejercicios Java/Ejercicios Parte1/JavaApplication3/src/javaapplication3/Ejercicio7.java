/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Nicolas Disandro
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
    Scanner scan = new Scanner(System.in);

       String frase = scan.next();
       String eureka = "eureka";
       
       
       if (frase.equals(eureka)){
           System.out.println("Son iguales");
           
       } else {
           System.out.println("No son iguales");
       }
    
    
        
        
    }
    
}
