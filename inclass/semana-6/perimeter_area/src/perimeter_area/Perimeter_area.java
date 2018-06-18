/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeter_area;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Perimeter_area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para Perimetro"+"\n"+"Digite 2 para Área");
        int op = scanner.nextInt();
        
        if (op == 1){
            System.out.println("Digite 1 Cuadrado, 2 Rectangulo o 3 Circulo");
            int op2 = scanner.nextInt();
            if (op2 == 1){
                System.out.println("digite la medida del lado");
                int side = scanner.nextInt();
                Square cuadrado = new Square(1,side);
            }
        }
    }
    
}
