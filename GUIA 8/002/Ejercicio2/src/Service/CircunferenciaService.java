
package Service;

import Circunferencia.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {
    
    
    public Circunferencia crearCircunferencia(){
        
        
        Scanner sc = new Scanner(System.in);
        Circunferencia circ = new Circunferencia();
        
        System.out.println("Ingrese el radio:");
        circ.setRadio(sc.nextDouble());
               
        return circ;
        
    }
    
    
    public void area(Circunferencia circ){
        
        System.out.println("El área es: " + (circ.getRadio()*circ.getRadio())*3.14);
    }
    
    public void perimetro(Circunferencia circ){
        
        System.out.println("El área es: " + 2*3.14*circ.getRadio());
    }

}
