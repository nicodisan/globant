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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        int count = 0;
        int suma = 0;
        
        do {
            count = count + 1;
            System.out.println("Ingrese numeros 20:");
            num = scan.nextInt();
            
            
            if (num == 0){
                System.out.println("Se capturo el numero 0");
                break;
                
            } else if (num >= 0){
                suma = suma + num;
            }       
                                   
            
        } while (count != 20);
        
        
        System.out.println("Listooo");
        
        System.out.println("La suma de los positivos fue: " + suma);
        
        
        
        
        
        
    }
    
}
