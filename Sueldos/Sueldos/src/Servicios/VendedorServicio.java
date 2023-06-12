
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {
    
    public Vendedor altaVendedor() {
        
        Vendedor v1 = new Vendedor();
        //llenado atributos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del Vendedor:");
        v1.setNombre(sc.next());
        System.out.println("Ingrese dni del Vendedor:");
        v1.setDni(sc.nextInt());
        System.out.println("Ingrese Sueldo Basico:");
        v1.setSueldoBasico(sc.nextDouble());
        System.out.println("Ingrese dia Inicio:");
        int dia = sc.nextInt();
        System.out.println("Ingrese mes inicio:");
        int mes = sc.nextInt();
        System.out.println("Ingrese año inicio:");
        int anio = sc.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;
    }
    
    public void SueldoMensual(Vendedor v1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las ventas totales del vendedor");
        Double ventas = sc.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: " + v1.getNombre() + " es de $" + v1.getSueldoMensual());
    }
    
    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones");
        } else if ( antiguedad < 10) {
            System.out.println("Le corresponden 21 dias de vacaciones");
        } else if (antiguedad < 20){
            System.out.println("Le corresponden 28 dias de vacaciones");
        } else if (antiguedad > 20){
            System.out.println("Le corresponden 35 dias de vacaciones");
        } else {
            System.out.println("No tiene vacaciones, vaya a laburar vago!");
        }
        
    }

}
