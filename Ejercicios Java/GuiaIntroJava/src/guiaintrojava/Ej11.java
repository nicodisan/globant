package guiaintrojava;
import java.util.Scanner;

public class Ej11 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        System.out.println("Frase original: " + frase);
        System.out.println("Frase modificada: " + trans(frase));
        
        
    }    
     
    public static String trans(String frase){
        String salida = "";
        String fraseFinal = "";
       
        for (int i = 0; i < frase.length(); i++){
            String letraTemp = frase.substring(i,i+1);
           // System.out.println(letraTemp);
            
            switch (letraTemp) {
                case "a":
                     salida = "@";
                     break;
                case "e":
                    salida = "#";
                    break;
                case "i":
                    salida = "$";
                    break;
                case "o":
                    salida = "%";
                    break;
                case "u":
                    salida = "*";
                    break;
                default:
                    salida = letraTemp;
                    break;
               
            }
        
            //System.out.println(salida);
        fraseFinal = fraseFinal + salida;
        }
        
        frase = fraseFinal;
        
        return frase;
        
    }
    
    
    
}


 