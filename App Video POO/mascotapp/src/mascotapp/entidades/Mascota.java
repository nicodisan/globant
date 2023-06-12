package mascotapp.entidades;

public class Mascota {

    public String nombre;
    public String apodo;
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
    
    public Mascota(){
        
    }
    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

}
