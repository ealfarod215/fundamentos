
package prime_number;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Prime_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int number = scanner.nextInt();
        boolean isprime = true;
        
        for (int i = 2;i<number;i++){
            if (number % i == 0){
                isprime = false;
                break;
            }
        }
        System.out.println("El numero "+ (isprime ? "si" : "no")+ " es primo");
    }
    
}
