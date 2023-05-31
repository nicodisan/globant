/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaintrojava;

import java.util.Scanner;

/**
 *
 * @author Nicolas Disandro
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese 4 num:");
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        String ast1 = "*";
        
       for (int i = 1; i < num1; i++){
           ast1 = ast1 + "*";
       }
       System.out.println(num1 + ast1);
       
       
    }
    
}
