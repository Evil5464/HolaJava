
package holajava;

import java.util.Scanner;

public class HolaJava {
    
    
    public static void main(String[] args) {
        String nombre;
        Scanner lee = new Scanner(System.in);
        //hacemos una modificación
        //relizamos entonces una mejora del sludo.
        //Edición directa para ver como se actualizan los cambios
        System.out.println("Ingresa tu nombre...\n");
        nombre =lee.nextLine();
        System.out.println("Hola %s ", nombre);
    }
    
}
