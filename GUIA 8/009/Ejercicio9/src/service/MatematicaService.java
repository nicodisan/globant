
package service;

import entities.Matematica;

public class MatematicaService {
    
    public void devolverMayor(Matematica num){
        
        System.out.println("El numero mayor es: " + Math.max(num.getNum1(),num.getNum2()));
        
    }
    
    public void calcularPotencia(Matematica num){
        
        double num1 = Math.round(num.getNum1());
        double num2 = Math.round(num.getNum2());
        System.out.println(num1 + " "+num2 );
        System.out.println("La potencia del mayor numero redondeado es: "+ Math.pow(Math.max(num1,num2),Math.min(num1,num2)));
        
    }
    
    public void calcularRaiz(Matematica num){
        
        double abs = Math.abs(Math.max(num.getNum1(), num.getNum2()));
        
        System.out.println("La raiz del menor numero redondeado es: "+ Math.sqrt(abs));
        
    }

}
