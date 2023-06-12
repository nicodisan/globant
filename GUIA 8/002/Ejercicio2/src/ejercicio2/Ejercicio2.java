
package ejercicio2;

import Circunferencia.Circunferencia;
import Service.CircunferenciaService;


public class Ejercicio2 {

    public static void main(String[] args) {
        
        CircunferenciaService cr = new CircunferenciaService();
        Circunferencia circ = cr.crearCircunferencia();
        cr.area(circ);
        cr.perimetro(circ);
        
    }

}
