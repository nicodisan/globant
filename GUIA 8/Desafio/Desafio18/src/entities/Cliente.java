
package entities;

public class Cliente {
    
    private int id;
    private String nombre;
    private int edad;
    private Double peso;
    private String objetivo;

    public Cliente() {
    }

    public Cliente(int id, String nombre, int edad, Double peso, String objetivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", objetivo=" + objetivo + '}';
    }

   
    
    
    

}
