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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño de vector:");
        int N = scan.nextInt();
        int [] vector = new int[N];
        
        System.out.println("Ingrese un numero a buscar");
        int buscar = scan.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++){
            
            vector[i] = (int) (Math.random() * 10);
            //System.out.println(vector[i]);
            if (vector[i] == buscar) {
                
                System.out.println("El numero " + buscar + " se encuentra en la posicion " + i);
                count = count + 1;
                
            }
        }
        
    
        
        
        
        
    }
    
}
