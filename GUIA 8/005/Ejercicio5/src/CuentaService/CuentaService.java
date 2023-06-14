
package CuentaService;

import Cuenta.Cuenta;
import static java.awt.SystemColor.info;
import java.util.Scanner;

public class CuentaService {
    
    
    public Cuenta ingreso(){
        
        Scanner sc = new Scanner(System.in);
        Cuenta info = new Cuenta();
        
        System.out.println("Ingrese num cuenta:");
        info.setNumCuenta(sc.nextInt());
        System.out.println("Ingrese DNI:");
        info.setDni(sc.nextInt());
        System.out.println("Ingrese saldo actual:");
        info.setSaldo(sc.nextInt());
        
        return info;
    }
    
    public void deposito(Cuenta info){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese deposito:");
        info.setSaldo(info.getSaldo() + sc.nextInt());
    
    }
    
    public void retiro(Cuenta info){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese retiro:");
        info.setSaldo(info.getSaldo() - sc.nextInt());
        
        if (info.getSaldo() <= 0){
            System.out.println("No cuenta con esos fondos, su saldo es 0");
            info.setSaldo(0);
            
        }else{
        }
    }
    
    public void extraccionRapida(Cuenta info){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese monto a sacar:");
        int aux = sc.nextInt();
        
        if (aux == (info.getSaldo()*0.2)){
            info.setSaldo(info.getSaldo() - aux);
            
        }else
            System.out.println("Imposible, la extraccion supera el 20%");
    }   
    public void consultarSaldo(Cuenta info){
        
        System.out.println("El saldo es de: " + info.getSaldo());
        
    }   
    
    public void consultarDatos(Cuenta info){
        
        System.out.println("El num de cuenta es: " + info.getNumCuenta());
        System.out.println("El DNI: " + info.getDni());
        System.out.println("El saldo es de: " + info.getSaldo());
        
    }       
    

}
