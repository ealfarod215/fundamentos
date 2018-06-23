
package Geometry;

import java.util.Scanner;



public class Geometry {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        String exit = "no";
        while (exit.contains("no")){
            menu.menu();
            System.out.println("Desea finalizar el programa si / no ?");
            exit = scanner.next();
        }
    }
    
}
