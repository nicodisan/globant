
package ejercicio8;

import entities.Cadena;
import java.util.Scanner;
import service.CadenaService;


public class Ejercicio8 {

    public static void main(String[] args) {
     
        
        CadenaService cs = new CadenaService();
        Cadena fr = cs.ingresarFrase();
        
        
        System.out.println(fr.toString());
        System.out.println("---------------");
        cs.mostrarVocales(fr);
        System.out.println("---------------");
        cs.invertirFrase(fr);
        System.out.println("---------------");
        cs.vecesRepetido(fr);
        System.out.println("---------------");
        cs.compararLongitud(fr);
        System.out.println("---------------");
        cs.unirFrases(fr);
        System.out.println("---------------");
        cs.reemplazar(fr);
        System.out.println("---------------");
        cs.contiene(fr);
        
    }

}
