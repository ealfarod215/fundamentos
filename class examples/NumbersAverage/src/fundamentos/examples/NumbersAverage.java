
package fundamentos.examples;

import java.util.Scanner;

/**
 * Write a program that asks for numbers until the number is a 0.
 * At the end, it shows an average of all the entered numbers.
 */

public class NumbersAverage {
    
    public static void main(String[] args) {
        double sum = 0.0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        double newNumber = scanner.nextDouble();
        
        // While the number is not a 0
        while (newNumber != 0) {
            // Adds the new number to sum
            // sum += newNumber is the same as sum = sum + newNumber;
            sum += newNumber;
            
            // Increase the counter
            // counter++ is the same as counter += 1;
            counter++;
            
            // Asks for another number
            System.out.println("Ingrese un número: ");
            newNumber = scanner.nextDouble();
        }
        
        // If counter is greater than 0
        if (counter > 0) {
            // Get the average
            double average = sum / counter;
            // Format the output. We are only showing 1 decimal.
            String formattedAverage = String.format("%.1f", average);
            System.out.println("El promedio de los números ingresados es: " + formattedAverage);
        } else {
            // If there are no numbers, show a message.
            System.out.println("No ingresó ningún número");
        }
    }
}
