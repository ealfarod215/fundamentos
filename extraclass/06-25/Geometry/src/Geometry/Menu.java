/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Menu {
     public void menu () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para Perimetro"+"\n"+"Digite 2 para Área");
        int op = scanner.nextInt();
        
        if (op == 1){
            System.out.println("Digite 1 Cuadrado, 2 Rectangulo, 3 Circulo, 4 Triangulo Equilatero, 5 Triangulo Isoseles o 6 Pentagono Regular");
            int op2 = scanner.nextInt();
            if (op2 == 1){
                System.out.println("digite la medida del lado");
                int side = scanner.nextInt();
                Square cuadrado = new Square(1,side);
                cuadrado.Operation();
            } else if (op2 == 2) {    
                System.out.println("digite la medida del largo");
                int side = scanner.nextInt();
                System.out.println("digite la medida del ancho");
                int side2 = scanner.nextInt();
                Rectangle rectangle = new Rectangle (1,side, side2);
                rectangle.Operation();
            } else if (op2 == 3) {            
                System.out.println("digite la medida del radio");
                int side = scanner.nextInt();
                Circle circle = new Circle (1,side);
                circle.Operation();
            } else if (op2 == 4) {
                System.out.println("digite la medida del uno de los lados: ");
                int side = scanner.nextInt();
                Triangle_E triangle = new Triangle_E(1,side);
                triangle.Operation();   
            } else if (op2 == 5) {
                System.out.println("digite la medida de uno de los dos lados mas largos: ");
                int side = scanner.nextInt();
                System.out.println("digite la medida del lado mas pequeño: ");
                int side2 = scanner.nextInt();
                Triangle_I triangle = new Triangle_I(1, side, side2);
                triangle.Operation();
            } else if (op2 == 6) {
                System.out.println("digite la medida de uno de los lados: ");
                int side = scanner.nextInt();
                Pentagon pentagon = new Pentagon(1, side);
                pentagon.Operation();
            }
        } else if (op == 2){
            System.out.println("Digite 1 Cuadrado, 2 Rectangulo, 3 Circulo, 4 Triangulo Equilatero, 5 Triangulo Isoseles o 6 Pentagono Regular");
            int op2 = scanner.nextInt();
            if (op2 == 1) {
                System.out.println("digite la medida del lado");
                int side = scanner.nextInt();
                Square cuadrado = new Square(2,side);
                cuadrado.Operation();
            } else if (op2 == 2) {
                System.out.println("digite la medida del largo");
                int side = scanner.nextInt();
                System.out.println("digite la medida del ancho");
                int side2 = scanner.nextInt();
                Rectangle rectangle = new Rectangle (2,side, side2);
                rectangle.Operation();
            } else if (op2 == 3) {
                System.out.println("digite la medida del lado");
                int side = scanner.nextInt();
                Circle circle = new Circle (2,side);
                circle.Operation();
            } else if (op2 == 4) {
                System.out.println("digite la medida del uno de los lados: ");
                int side = scanner.nextInt();
                Triangle_E triangle = new Triangle_E(2,side);
                triangle.Operation();
            } else if (op2 == 5) {
                System.out.println("digite la medida de uno de los dos lados mas largos: ");
                int side = scanner.nextInt();
                System.out.println("digite la medida del lado mas pequeño: ");
                int side2 = scanner.nextInt();
                Triangle_I triangle = new Triangle_I(2, side, side2);
                triangle.Operation();
            } else if (op2 == 6) {
                System.out.println("digite la medida del radio: ");
                int side = scanner.nextInt();
                Pentagon pentagon = new Pentagon(2, side);
                pentagon.Operation();
            }
        }
    }
    
}
