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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        double num1 = scan.nextInt();
        System.out.println("Ingrese otro numero");
        double num2 = scan.nextInt();
        String salir = "";
        
        
        
        do {
            
            
            System.out.println("Ingresar opcion menú:");
            int opcion = scan.nextInt();
            
            switch (opcion) {
                
                case 1:
                    System.out.println("La suma de los num es: " + (num1+num2));
                    continue;
                case 2:
                    System.out.println("La resta de los num es: " + (num1-num2));
                    continue;
                case 3:
                    System.out.println("La multip de los num es: " + (num1*num2));
                    continue;
                case 4:
                    System.out.println("La suma de los num es: " + (num1/num2));
                    continue;
                case 5:
                    System.out.println("Desea salir? S/N");
                    salir = scan.nextLine();
                    
            }
            
        } while ("N".equals(salir));
        
        
        
    }
    
}
