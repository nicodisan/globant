
package ejercicio3;

import Operacion.Operacion;
import OperacionService.OperacionService;


public class Ejercicio3 {

    public static void main(String[] args) {
        
        
        OperacionService ops = new OperacionService();
        Operacion num = ops.crearOperacion();
        ops.sumar(num);
        ops.multiplicar(num);
        ops.dividir(num);
        
        
    }

}
