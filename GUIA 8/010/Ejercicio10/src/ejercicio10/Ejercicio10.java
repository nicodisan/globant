
package ejercicio10;


import java.util.Arrays;
import java.util.Random;
import service.ArrayService;


public class Ejercicio10 {

    public static void main(String[] args) {
        
        ArrayService as = new ArrayService();
        double array1[] = new double[50];
        double array2[] = new double[20];
        
        Random random = new Random();
        
        as.rellenarArray(array1);
        as.mostrarArray(array1);
        Arrays.sort(array1);
        as.mostrarArray(array1);
        System.arraycopy(array1, 0, array2, 0, 10);
        Arrays.fill(array2, 10, 19, 0.5);
        as.mostrarArray(array2);
        
        
        
        
        
    }

}
