
package ejercicio5;

import Cuenta.Cuenta;
import CuentaService.CuentaService;
import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CuentaService cs = new CuentaService();
        Cuenta info = cs.ingreso();
        
        
        // to string
        System.out.println(info.toString());
        
        // deposito
        cs.deposito(info);
        
        // to string
        System.out.println(info.toString());
        
        // retiro
        cs.retiro(info);
        
        // to string
        System.out.println(info.toString());
        
        // retirorapido20
        cs.extraccionRapida(info);
        
        // to string
        System.out.println(info.toString());
        
        cs.consultarSaldo(info);
        
        cs.consultarDatos(info);
    }

}
