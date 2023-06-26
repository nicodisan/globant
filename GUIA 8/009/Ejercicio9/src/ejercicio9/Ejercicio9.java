
package ejercicio9;

import entities.Matematica;
import service.MatematicaService;


public class Ejercicio9 {

    public static void main(String[] args) {
        
        MatematicaService mt = new MatematicaService();
        
        Matematica num = new Matematica();
        Matematica num2 = new Matematica();
        
        
        num.setNum1(Math.random()*10);
        num.setNum2(Math.random()*10);
        
        System.out.println(num.getNum1());
        System.out.println(num.getNum2());
        
        mt.devolverMayor(num);
        mt.calcularPotencia(num);
        mt.calcularRaiz(num);
        
        
        
        
    }

}
