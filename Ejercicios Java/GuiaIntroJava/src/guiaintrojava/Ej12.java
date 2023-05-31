
package guiaintrojava;

import java.util.Scanner;


public class Ej12 {

    public static void main(String[] args) {
   
       Scanner scan = new Scanner(System.in);
       
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       
       
       esMultiplo(num1,num2);
       
    }
    
    public static void esMultiplo(int num1, int num2){
        
        if(num2 % num1 == 0){
            System.out.println("Es multiplo");
        
        } else {
            System.out.println("No es multiplo");
            
        }
        
        
    }
    
    
    
    
}
