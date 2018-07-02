/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysample;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ulacit
 */
public class Arraysample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int [] arregloA = new int[10];
        int [] arregloB = new int[10];
        int [] arregloC = new int [10];
        
        
        for (int i = 0; i < arregloC.length; i++) {
            
            
            for (int s = 0; s < arregloA.length; s++) {
                arregloA[i] = random.nextInt(99);
                for (int o = 0; o < arregloB.length; o++) {
                    arregloB[i] = random.nextInt(99);      
                }
            }int suma = arregloA[i]*arregloB[i];
            arregloC[i] = suma;
        }

        System.out.println(Arrays.toString(arregloC) );
        
    }
    
}
