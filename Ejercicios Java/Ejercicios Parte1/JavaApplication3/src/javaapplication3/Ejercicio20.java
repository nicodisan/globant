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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        int suma1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int suma2 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        int suma3 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        
        
        if (suma1 == suma2 && suma1 == suma3){
            
            System.out.println("Es cuadrado magico");
            
        } else {
            System.out.println("No es cuadrado magico");
        }
        
        
        
    }
    
    
   
    
    
}
