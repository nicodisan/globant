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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        
        
        if (num %2 == 0) {
            System.out.println("El numero es PAR");
        
        } else {
            System.out.println("El numero es IMPAR");
        }
        
        
        
    }
    
}
