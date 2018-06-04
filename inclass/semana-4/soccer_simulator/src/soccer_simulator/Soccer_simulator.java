/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer_simulator;

import java.util.Random;

/**
 *
 * @author ulacit
 */
public class Soccer_simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++){
            Random random = new java.util.Random();
            int a = random.nextInt(5);
            int b = random.nextInt(5);
            int c = random.nextInt(5);
            int d = random.nextInt(5);
            System.out.println("group: "+i+" partido: A contra B "+a+"-"+b);
            System.out.println("group: "+i+" partido: C contra D "+c+"-"+d);
        }
        
        
    }
    
}
