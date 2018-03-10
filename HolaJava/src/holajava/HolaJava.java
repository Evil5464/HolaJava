
package holajava;

import java.util.Scanner;

public class HolaJava {
    
    
    public static void main(String[] args) {
        String nombre;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingresa tu nombre...\n");
        nombre =lee.nextLine();
        System.out.println("Hola " + nombre);
    }
    
}
