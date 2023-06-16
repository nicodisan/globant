
package com.mycompany.ejercicio7.service;

import com.mycompany.ejercicio7.entities.Persona;
import java.util.Scanner;

public class PersonaService {
    
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre persona:");
        p1.setNombre(sc.next());
        System.out.println("Ingrese Edad:");
        p1.setEdad(sc.nextInt());
        System.out.println("Ingrese sexo: M/F/O");
        p1.setSexo(sc.next());
        System.out.println("Ingrese peso:");
        p1.setPeso(sc.nextDouble());
        System.out.println("Ingrese Altura:");
        p1.setAltura(sc.nextDouble());
        
        return p1;
    }
    
    
    public int calcularIMC(Persona p1){
        
        double imc = p1.getPeso()/(p1.getAltura()*p1.getAltura());
        System.out.println(imc);
        if (imc <20){
            return -1;
        } else if (imc > 20 && imc < 25){
            return 0;
        } else{
            return 1;
        }
    }
    
    public boolean mayorEdad(Persona p1){
        
        boolean edad;
        if (p1.getEdad()>18){
            return true;
            
        }else {
            return false;
        }
    }
    

}
