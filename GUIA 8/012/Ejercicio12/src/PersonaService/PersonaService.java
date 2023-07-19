
package PersonaService;

import Persona.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    
    public Persona crearPersona(){
        
        Scanner sc = new Scanner(System.in);
        Persona pers = new Persona();
        
        
        
        
        System.out.println("Ingresar nombre");
        pers.setNombre(sc.next());
        System.out.println("Ingresa Año");
        int anio = sc.nextInt();
        System.out.println("Ingresa mes");
        int mes = sc.nextInt();
        System.out.println("Ingresa dia");
        int dia = sc.nextInt();
        pers.setBorn(new Date(anio-1900,mes-1,dia)); 
       // System.out.println(pers.getNombre());
        //System.out.println(pers.getBorn());
        
       
      
        
        return pers;
        
        
    }
    
    
    public void calcularEdad(Persona pers){
        
        Date fechaActual = new Date();
        System.out.println("La edad es: " + (fechaActual.getYear() - pers.getBorn().getYear()));
        
        
        
    }
    
    public void menorQue(Persona pers){
        
        Scanner sc = new Scanner(System.in);
        int nuevaEdad = sc.nextInt();
        boolean menor;
        if (pers.getBorn().getYear() < nuevaEdad){
            menor = true;
        } else {
            menor = false;
        }
        
        System.out.println(menor);
    }
    
    public void mostrarPersona(Persona pers){
        
        System.out.println(pers.getNombre());
        System.out.println(pers.getBorn());
        
    }

}
