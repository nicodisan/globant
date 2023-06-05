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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Ingrese euros a convertir:");
        double euro = scan.nextDouble();
      
        cambio(euro);
        
    }
    
    
    public static void cambio(double euro) {
        
        System.out.println(euro + " euros son " + (euro*0.86) + " libras.");
        System.out.println(euro + " euros son " + (euro*1.28611) + " dolares.");
        System.out.println(euro + " euros son " + (euro*129.852) + " yenes.");
    }
    
    
}
