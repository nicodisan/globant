
package OperacionService;

import Operacion.Operacion;
import java.util.Scanner;

public class OperacionService {
    
    
    public Operacion crearOperacion(){
        Scanner sc = new Scanner(System.in);
        
        Operacion num = new Operacion();
        
        
        System.out.println("Ingrese numero 1:");
        num.setNumero1(sc.nextDouble());
        System.out.println("Ingrese numero 2");
        num.setNumero2(sc.nextDouble());
        
        return num;
        
        
    }
    
    
    public void sumar(Operacion num){
        
        System.out.println("La suma de los numeros es: " + (num.getNumero1() + num.getNumero2()));

    }
    
    public void restar(Operacion num){
        System.out.println("La resta de los unmeros es: " + (num.getNumero1() - num.getNumero2()));
    }
    
    public void multiplicar(Operacion num){
        
        if (num.getNumero1() == 0 || num.getNumero2() == 0){
            System.out.println("Error, se está multiplicando por 0");
            
        }else {
            System.out.println("La multiplicacion es: " + (num.getNumero1() * num.getNumero2()));
        }
    }
    
    public void dividir(Operacion num){
        
        if (num.getNumero1() == 0 || num.getNumero2() == 0){
            System.out.println("Error, se está dividiendo por 0");
            
        }else {
            System.out.println("La division es: " + (num.getNumero1() / num.getNumero2()));
        }
    }
    

}
