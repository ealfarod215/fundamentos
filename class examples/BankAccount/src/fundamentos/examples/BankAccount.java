
package fundamentos.examples;

import java.util.Scanner;

/**
* Escriba un programa para una cuenta bancaria.
* El programa debe solicitar al usuario que tipo de operación desea realizar:
*  - c: crédito
*  - d: débito
*  - s: salir
* 
* Si es un débito, debe asegurarse que tenga suficiente dinero.
*/

public class BankAccount {

    public static void main(String[] args) {
        // Variable para mantener el dinero de la cuenta
        double money = 0.0;
        
        // Variable para solicitar datos al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza la acción a realizar (c, d, s): ");
        String action = scanner.next();
        
        // Mientras la acción sea diferente de s
        while (action.compareTo("s") != 0) {
            if (action.compareTo("c") == 0) {
                // Si la acción es una "c", ingresa aquí
                System.out.print("Introduza el monto a acreditar: $");
                double amountToCredit = scanner.nextDouble();
                money = money + amountToCredit;
            } else if (action.compareTo("d") == 0) {
                // Si la acción es una "d", ingresa aquī
                System.out.print("Introduza el monto a debitar: $");
                double amountToDebit = scanner.nextDouble();
                
                // Si el monto a debitar es mayor que el dinero en la cuenta
                if (amountToDebit > money) {
                    // Muestro fondos insuficientes
                    System.out.println("Fondos insuficientes.");
                } else {
                    // Hago el débito normalmente
                    money = money - amountToDebit;
                }
            }
            
            // Siempre al final muestro la información de cuanto dinero queda
            System.out.println("Monto total en la cuenta: $" + money);
            
            // Y vuelvo a solicitar una acción
            System.out.print("Introduza la acción a realizar (c, d, s): ");
            action = scanner.next();
        }
        
        // Muestro el monto total que quedó en la cuenta una vez más
        System.out.println("Monto total en la cuenta: $" + money);
    }
    
}

