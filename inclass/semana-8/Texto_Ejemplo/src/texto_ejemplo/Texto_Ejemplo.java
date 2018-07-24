
package texto_ejemplo;

import java.util.Scanner;


public class Texto_Ejemplo {


    public static void main(String[] args) {
        String [] arregloA = new String [10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una plabra: ");
        String palabra = scanner.next();
        for(int i = 0; i < arregloA.length; i++){
            arregloA[i]= palabra.split(" ");
        }
   
    }
    
}
