
package guiaintrojava;

public class Ej13 {

    public static void main(String[] args) {
       
       String[] vector = new String[6];
       
       for (int i = 0; i < 6 ; i++){
           vector[i] = "Jugador: " + (i+1);
       }
        
       for (int i = 0; i<6;i++){
           System.out.println(vector[i]);
       }
                
        
        
    }
    
}
