/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Square {
    
    public static void imprimirlineavacia (int lado){
        System.out.print("*");
        for ( int j = 0; j < lado-2; j++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
    public static void imprimirlineacompleta (int lado){
        System.out.print("*");
        for ( int j = 0; j < lado-2; j++){
            System.out.print("*");
        }
        System.out.print("*");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++){
            if (i == 0 || i == size-1){
                imprimirlineacompleta(size);
            }else{
                imprimirlineavacia(size);
            }
            System.out.print("\n");
        }
                
    }
    
}
