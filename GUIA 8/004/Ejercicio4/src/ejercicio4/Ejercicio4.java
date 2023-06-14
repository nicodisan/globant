
package ejercicio4;

import Rectangulo.Rectangulo;
import RectanguloService.RectanguloService;


public class Ejercicio4 {

    public static void main(String[] args) {
        
        
        RectanguloService rs = new RectanguloService();
        Rectangulo rect = rs.crearRectangulo();
        
        rs.sup(rect);
        rs.per(rect);
        rs.dibujar(rect);
        
        
        
        
    }

}
