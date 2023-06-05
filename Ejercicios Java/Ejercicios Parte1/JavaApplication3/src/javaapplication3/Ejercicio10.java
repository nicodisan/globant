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
public class Ejercicio10 {


    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese num");
        int num = scan.nextInt();
        int suma = 0;
        
        
        do {
            System.out.println("Ingrese otro:");
            int num2 = scan.nextInt();
            suma = suma + num2;
            
                    
        } while (suma <= num);
        
        System.out.println("Terminado");
       
        
    }
    
}
