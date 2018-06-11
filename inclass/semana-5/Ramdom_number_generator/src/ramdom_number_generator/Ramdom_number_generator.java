/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramdom_number_generator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Ramdom_number_generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new java.util.Random();
        int rnumber = random.nextInt(101);
        /*System.out.print("ingrese un numero");
        int usernum = scanner.nextInt();*/
        boolean out = false;
        String outword = "";
        while (out != true){
            System.out.print("ingrese un numero");
            int usernum = scanner.nextInt();
            if (rnumber > usernum){
            System.out.println("su numero es menor");
            
        }else if (rnumber < usernum){
            System.out.println("Su numero es mayor");
            
        }else if (rnumber == usernum){
            System.out.println("Felicidades adivino");
            
        }System.out.println("desea salir: ");
            outword = scanner.next();
            if (outword.contains("si")){
                out = true;
            }
        }
        
    }
}
          


