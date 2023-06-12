
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    
    public Libro altaLibro(){
        
        Libro lib1 = new Libro();
        //Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de ISBN");
        lib1.setISBN(sc.nextInt());
        System.out.println("Ingrese Titulo");
        lib1.setTitulo(sc.next());
        System.out.println("Ingrese Autor");
        lib1.setAutor(sc.next());
        System.out.println("Ingrese num de paginas");
        lib1.setNumPag(sc.nextInt());
        
        return lib1;

    }
    
    public void mostrarDatos(Libro lib1){
        
        System.out.println("Numero de ISBM: " + lib1.getISBN());
        System.out.println("Nombre del Titulo: " + lib1.getTitulo());
        System.out.println("Autor: " + lib1.getAutor());
        System.out.println("Numero de paginas: " + lib1.getNumPag());
        
        
        
    }

    
    

}
