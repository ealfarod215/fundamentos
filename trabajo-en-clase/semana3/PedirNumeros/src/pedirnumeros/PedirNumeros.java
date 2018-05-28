
package pedirnumeros;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class PedirNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numero = scanner.nextInt();
        int i = 0;
        int t = 0;
        
        while (numero != 0){
            i = i + 1;
            t = t + numero;
            System.out.println("ingrese un numero");
            numero = scanner.nextInt();
        }
        int total = t / i;
        System.out.println("El promedio de los numeros es: "+ total);
    }
    
}
