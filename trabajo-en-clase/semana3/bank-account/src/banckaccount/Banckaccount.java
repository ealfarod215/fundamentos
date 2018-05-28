/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banckaccount;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Banckaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuenta = 0;
        String decision;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introdusca la accion: ");
        decision = scanner.next();
        while (decision.compareTo("s") != 0){
            if (decision.compareTo("d") == 0){
                System.out.println("Introdusca el monto a debitar: ");
                int monto = scanner.nextInt();
                
                int remanente = cuenta - monto;
                if (remanente >= 0) {
                cuenta = cuenta - monto;
                System.out.println("credito listo! quedan : $"+cuenta);                
            }else {
                   System.out.println("no tiene fondos suficientes. Solo tienes $"+cuenta);
                   
                }
        }else if (decision.compareTo("c") == 0){
            System.out.print("Introdusca el monto a acreditar: ");
            int monto = scanner.nextInt();
            cuenta = cuenta + monto;
            System.out.println("credito listo! quedan : $"+cuenta);
        }
            System.out.println("introdusca la accion: ");
            decision = scanner.next();
    }
    System.out.print("al final quedaron: $"+cuenta);
    }
}
    
