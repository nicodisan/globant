
package entities;

public class Cadena {
    
    
    private String frase;
    private int longitud;
    private String fraseNueva;
    private String fraseFinal;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
        this.fraseNueva = fraseNueva;
        this.fraseFinal = fraseFinal;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFraseNueva() {
        return fraseNueva;
    }

    public void setFraseNueva(String fraseNueva) {
        this.fraseNueva = fraseNueva;
    }

    public String getFraseFinal() {
        return fraseFinal;
    }

    public void setFraseFinal(String fraseFinal) {
        this.fraseFinal = fraseFinal;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + ", fraseNueva=" + fraseNueva + ", fraseFinal=" + fraseFinal + '}';
    }

    
    
    

    
    
    
    
    
    
    
}
