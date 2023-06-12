
package ejercicio1;

import Entidades.Libro;
import Servicio.LibroServicio;


public class Ejercicio1 {


    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        Libro lib1 = ls.altaLibro();
        ls.mostrarDatos(lib1);
        
        
        
        
        
    }
    
}
