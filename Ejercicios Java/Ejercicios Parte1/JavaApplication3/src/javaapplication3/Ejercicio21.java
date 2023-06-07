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
public class Ejercicio21 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[][] matrizM = new int[4][4];
        int[][] matrizP = new int[3][3];
        
        //Carga matriz M
        System.out.println("Ingrese la matriz M (25 num)");
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrizM[i][j] = scan.nextInt();
            }
        }
        //CArga matriz p
        System.out.println("Ingrese la matriz P (25 num)");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizP[i][j] = scan.nextInt();
            }
        }
        //Escribir M
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }
        //Escribir M
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                
                if (matrizM[i][j] == matrizP[0][0]){
                     int fila = i;
                     int columna = j;
                }
            }
    }
        
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            
            if (matrizM[fila + i][columna + j] == matrizP[i][j])
        }
    }
        
        
        
        
        
        
    }
    
}
