
package RectanguloService;

import Rectangulo.Rectangulo;
import java.util.Scanner;

public class RectanguloService {
    
    
    public Rectangulo crearRectangulo(){
        
        
        Scanner sc = new Scanner(System.in);
        Rectangulo rect = new Rectangulo();
        
        System.out.println("Ingrese Base del rectangulo:");
        rect.setBase(sc.nextDouble());
        System.out.println("Ingrese Altura del rectangulo");
        rect.setAltura(sc.nextDouble());
        return rect;
        
    }
    
    public void sup(Rectangulo rect){
        System.out.println("La superficie es de: " + (rect.getBase()*rect.getAltura()));
    }
    
    public void per(Rectangulo rect){
        System.out.println("El perimetro es de: " + (rect.getBase()+rect.getAltura())* 2);
    }
    
    public void dibujar(Rectangulo rect){
        
        for (int i=0;i<rect.getAltura();i++){
            for (int j=0;j<rect.getBase();j++){
                
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
