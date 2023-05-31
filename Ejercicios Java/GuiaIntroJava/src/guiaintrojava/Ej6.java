package guiaintrojava;

import java.util.Scanner;

public class Ej6 {
 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros enteros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos son Mayores de 25");
        } else if (num1 > 25 || num2 > 25){
            System.out.println("Al menos un nume es mayor de 25");
        } else {
        System.out.println("Ningun num es mayor de 25");
        
    }
        
        
        
        
        
    }
  
}
