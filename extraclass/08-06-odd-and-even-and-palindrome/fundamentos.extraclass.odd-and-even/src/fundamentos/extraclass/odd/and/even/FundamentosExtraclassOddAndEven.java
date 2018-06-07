/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.extraclass.odd.and.even;

import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class FundamentosExtraclassOddAndEven {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();
        int even = 0;
        int odd = 0;
        while (num != 0){
            if (num % 2 == 0){
                even = even + 1; 
            }else{
                odd = odd + 1;
            }
            System.out.print("Ingrese un numero: ");
            num = scanner.nextInt();
        }
        System.out.print("El total de numeros pares fue de: "+even+"\n"+
                "El total de numeros impares fue de: "+odd+"\n");
    }
    
}
