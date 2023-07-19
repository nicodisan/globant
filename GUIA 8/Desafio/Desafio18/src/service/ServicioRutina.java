
package service;

import entities.Cliente;
import entities.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioRutina {
    
    
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Rutina crearRutina() {

        Rutina rutina = new Rutina();

        System.out.println("Ingrese ID");
        rutina.setId(sc.nextInt());
        System.out.println("Ingrese Nombre Rutina");
        rutina.setNombre(sc.next());
        System.out.println("Ingrese Duracion");
        rutina.setDuracion(sc.nextInt());
        System.out.println("Ingrese Dificultad");
        rutina.setNivelDificultad(sc.next());
        System.out.println("Ingrese Descripcion");
        rutina.setDescripcion(sc.next());

        return rutina;
        
        

    }

    public void obtenerRutina(ArrayList<Rutina> listaRutinas) {

        for (int i = 0; i < listaRutinas.size(); i++) {
            System.out.println(listaRutinas.get(i));

        }
    }
    
       
    public void actualizarCliente(ArrayList<Rutina> listaRutinas){
        
        
        System.out.println("Cual ID Actualizar?");
        int idMod = sc.nextInt();
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Duracion:");
        int duracion = sc.nextInt();
        System.out.println("Dificulatad:");
        String nivelDificultad = sc.next();
        System.out.println("Descripcion:");
        String descripcion = sc.next();
        listaRutinas.set(idMod-1, new Rutina(idMod, nombre, duracion, nivelDificultad, descripcion));
        
    }
    
    
    public void eliminarRutina(ArrayList<Rutina> listaRutinas) {

        System.out.println("Cual ID borrar?");
        int ingreso = sc.nextInt();
        listaRutinas.remove(ingreso - 1);

    }
    
    
    
    

}
