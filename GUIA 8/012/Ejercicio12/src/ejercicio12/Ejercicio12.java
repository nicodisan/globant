
package ejercicio12;

import Persona.Persona;
import PersonaService.PersonaService;


public class Ejercicio12 {

    public static void main(String[] args) {
        
        
        PersonaService ps = new PersonaService();
        Persona pers = ps.crearPersona();
        
               
        
        
        ps.calcularEdad(pers);
        ps.menorQue(pers);
        
       
        
        
        
        
        
        
        
    }

}
