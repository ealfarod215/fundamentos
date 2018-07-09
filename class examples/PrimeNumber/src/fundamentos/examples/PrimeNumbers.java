
package fundamentos.examples;

import java.util.Scanner;

/**
 * Write a program that tells you if a number is prime.
 * A prime number can be divided, without a remainder, only by itself and by 1.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int number = scanner.nextInt();
        
        // At first, we assume the number isPrime
        boolean isPrime = true;
        
        // We go from 2 to the number.
        // If the remainder of any of thos
        for (int i = 2; i < number; i++) {
            System.out.print("Probando con " + i + ". ");
            if (number % i == 0 ) {
                System.out.print("El " + i + " funcionó. ");
                System.out.println("El residuo de la división de " + number + " / " + i + " es igual a 0.");
                isPrime = false;
                break;
            } else {
                 System.out.println("El " + i + " no funcionó. Seguimos...");
            }
        }
        // Line blank before showing the answer
        System.out.println("");
        
        String isPrimeOutput = isPrime ? "si" : "no";
        System.out.println("El número " + isPrimeOutput + " es primo.");
    }
}
