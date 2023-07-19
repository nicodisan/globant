
package ejercicio11;

import java.util.Date;
import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese dia");
        int dia = sc.nextInt();
        System.out.println("Ingrese mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese anio");
        int anio = sc.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println(fecha);
        
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        System.out.println(fechaActual.getYear() - fecha.getYear());
        
        
    }

}
