package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Nicolas Disandro
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
    Scanner scan = new Scanner(System.in);

       String frase = scan.next();
       
       
       
       if (frase.length() == 8){
           System.out.println("Correcto");
           
       } else {
           System.out.println("Incorrecto");
       }
    
    
    }
    
}
