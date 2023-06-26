
package service;

import entities.Cadena;
import java.util.Scanner;

public class CadenaService {
    
    
    public Cadena ingresarFrase(){
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Cadena fr = new Cadena();
        
        System.out.println("Ingrese frase:");
        fr.setFrase(sc.next());
        fr.setLongitud(fr.getFrase().length());
        
        return fr;
        
    }
    
    public void mostrarVocales(Cadena fr){
        
        
        int count=0;
        for (int i=0; i<fr.getLongitud(); i++){
            String frase = fr.getFrase().substring(i,i+1);
            //System.out.println(frase);
            if (frase.equals("a") || frase.equals("e")||
                    frase.equals("i")||frase.equals("o")||frase.equals("u")){
                count = count+1;
            } 
        }
        System.out.println("Vocales: " + count );
        
    }
    
    public void invertirFrase(Cadena fr){
        String invertido = "";
        for (int i = fr.getLongitud()-1; i>=0; i--){
            invertido += fr.getFrase().charAt(i);
            
        }
        System.out.println("Frase invertida: " + invertido);
        
    }
    
    public void vecesRepetido(Cadena fr){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una letra a buscar");
        String letra = sc.next();
        int count=0;
        
        for (int i=0; i<fr.getLongitud(); i++){
            String frase = fr.getFrase().substring(i,i+1);
            //System.out.println(frase);
            if (frase.equals(letra)) {
                count = count+1;
            } 
        }
        System.out.println("La letra " + letra + " está " + count + " veces." );
        
        
    }
    
    public void compararLongitud(Cadena fr){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese ahora una nueva frase: ");
        fr.setFraseNueva(sc.next());
        
        
        int diferencia = (fr.getFraseNueva().length() - fr.getFrase().length());
        //System.out.println(diferencia);
        if (diferencia == 0){
            System.out.println("Las frases tienen la misma longitud.");
        } else if (diferencia > 0) {
            System.out.println("La frase nueva tiene " + diferencia + " caracteres MAS que la anterior." );
        } else {
            System.out.println("La frase nueva tiene " + Math.abs(diferencia) + " caracteres MENOS que la anterior.");
        }
        
        
    }
    
    public void unirFrases(Cadena fr){
        
        fr.setFraseFinal(fr.getFrase() + " " + fr.getFraseNueva());
        System.out.println(fr.getFraseFinal());
        
    }
    
    public void reemplazar(Cadena fr){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un caracter a reemplazar por la letra a:");
        String letra = sc.next();
        String fraseReemplazada= "";
        
        for (int i=0; i<fr.getFraseFinal().length(); i++){
            if (!fr.getFraseFinal().substring(i,i+1).equals("a")){
                fraseReemplazada += fr.getFraseFinal().charAt(i);
            } else {
                fraseReemplazada += letra;
            }
        
        }
        System.out.println(fraseReemplazada);
        
    }
    
    public void contiene(Cadena fr){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una letra a verificar:");
        String letra = sc.next();
        boolean resultado = false;
        
        for (int i=0; i<fr.getFraseFinal().length(); i++){
            if (fr.getFraseFinal().substring(i,i+1).equals(letra)){
                resultado = true;
            }
        
        }
        System.out.println(resultado);
        
    }

}
