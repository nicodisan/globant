package guiaintrojava;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        int tipoMotor = scan.nextInt();
        
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es de agua");
                break;
            case 2:
                System.out.println("La bomba es de gasoilina");
                break;
            case 3:
                System.out.println("La bomba es de hormigon");
                break;
            case 4:
                System.out.println("La bomba es de pasta");
                break;
            default:
                System.out.println("No hay valor valido para esa bomba rey");
            
        }
        
        
        
        
    }
    
}
