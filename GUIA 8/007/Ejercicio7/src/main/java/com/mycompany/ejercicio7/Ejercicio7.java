
package com.mycompany.ejercicio7;

import com.mycompany.ejercicio7.entities.Persona;
import com.mycompany.ejercicio7.service.PersonaService;
import java.util.Scanner;

public class Ejercicio7 {
    
    private static Scanner sc;

    public static void main(String[] args) {
        
        sc = new Scanner(System.in).useDelimiter("\n");
                
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        Persona p2 = new Persona("Tibi", 25, "m", 58, 1.62);
        Persona p3 = new Persona("Julia", 6, "m", 25, 1.12);
        Persona p4 = new Persona("Vito", 84, "m", 152, 1.45);
        
        //calcula IMC para todos
        int imc = ps.calcularIMC(p1);
        int imc2 = ps.calcularIMC(p2);
        int imc3 = ps.calcularIMC(p3);
        int imc4 = ps.calcularIMC(p4);
        
        //Calcula edad
        boolean edad = ps.mayorEdad(p1);
        boolean edad2 = ps.mayorEdad(p2);
        boolean edad3 = ps.mayorEdad(p3);
        boolean edad4 = ps.mayorEdad(p4);
        
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);        
        System.out.println(p4);
        
        System.out.println("Persona 1");
        System.out.println(imc);
        System.out.println(edad);
        
        System.out.println("Persona 2");
        System.out.println(imc2);
        System.out.println(edad2);
        
        System.out.println("Persona 3");
        System.out.println(imc3);
        System.out.println(edad3);
        
        System.out.println("Persona 4");
        System.out.println(imc4);
        System.out.println(edad4);
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        
        
    
    
    
    }
    
    
    
}
