package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class Mascotapp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Mascota m1 = new Mascota("El loco dinamita", sc.next(), "Perro");
        
        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo);
        
    }

}
