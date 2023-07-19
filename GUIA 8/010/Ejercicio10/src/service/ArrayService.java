
package service;


import java.util.Random;

public class ArrayService {
    
    
    public void rellenarArray(double[] array1){
        Random rand = new Random();
        for (int i=0;i < array1.length;i++){
            array1[i] = rand.nextInt();
            
        }
      
    }
    
    public void mostrarArray(double[] array1){
        
        for (int i=0; i<array1.length;i++){
            
            System.out.println(array1[i]);
        }
    }
    

}
