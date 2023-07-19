
package Persona;

import java.util.Date;

public class Persona {
    
    
    
    private String nombre;
    private Date born;

    public Persona() {
    }

    public Persona(String nombre, Date born) {
        this.nombre = nombre;
        this.born = born;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }
    
    
    
    

}
