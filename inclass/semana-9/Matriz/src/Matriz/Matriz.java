/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz;

/**
 *
 * @author ulacit
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int [] matriz = {1,2,3,4}forma de crear un arreglo con valores*/
       int contador = 1;     
       /*int [][] matriz = new int [5][5];/*crear una matriz */
       int [][] matriz = {
           {1,2,3},
           {3,1,2},
           {2,3,1}
       };
       int nDiagonal = 0;
       boolean hasAssignedNDiagonal = false;
       boolean diagonalok = true;
       
       for (int i = 0; i < matriz.length; i++){
           for (int j = 0; j < matriz[i].length; j++) {
               if (i == j) {
                   if (!hasAssignedNDiagonal) {
                       hasAssignedNDiagonal = true;
                       nDiagonal = matriz[i][j];
                   } else if (nDiagonal != matriz[i][j]) {
                       diagonalok = false;
                   }      
               }
           }
       }
       System.out.println("Diagonal: " +(diagonalok ? "ok" : "mal" ) );
    }
   
}
