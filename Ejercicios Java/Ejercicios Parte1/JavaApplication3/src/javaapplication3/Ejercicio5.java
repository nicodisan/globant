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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        double num = scan.nextDouble();
        
        
        System.out.println("El numero es: " + num);
        System.out.println("El doble del numero es: " + (num * 2));
        System.out.println("El triple del numero es: " + (num*3));
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(num));
        
        
        
    }
    
}
