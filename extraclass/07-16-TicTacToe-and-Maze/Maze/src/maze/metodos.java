
package maze;

import java.util.Random;

/**
 *
 * @author Edison
 */
public class metodos {
    
    public void print(int[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void move (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j]== 2) {
                        boolean finPinitial = true;
                        int pInitial = matrix[i][j];
                        String [] movement = {"N","N","E","E","S","O","S"};
                        for (int k = 0; k < movement.length; k++) {
                            if (movement[i].contains("N")){
                               pInitial = matrix[i][j-1];
                              if (pInitial == 3){
                                   System.out.println("Exito");
                               }else if (pInitial == 1) {
                                   System.out.println(":(");
                               }else if (pInitial == 0) {
                                   System.out.println("Moviendo");
                               }
                            }else if (movement[i].contains("S")) {
                                pInitial = matrix[i][j+1];
                               if (pInitial == 3){
                                   System.out.println("Exito");
                               }else if (pInitial == 1) {
                                   System.out.println(":(");
                               }else if (pInitial == 0) {
                                   System.out.println("Moviendo");
                               }
                            }else if (movement[i].contains("E")) {
                                pInitial = matrix[i+1][j];
                               if (pInitial == 3){
                                   System.out.println("Exito");
                               }else if (pInitial == 1) {
                                   System.out.println(":(");
                               }else if (pInitial == 0) {
                                   System.out.println("Moviendo");
                               }
                            }else if (movement[i].contains("O")) {
                                pInitial = matrix[i-1][j];
                               if (pInitial == 3){
                                   System.out.println("Exito");
                               }else if (pInitial == 1) {
                                   System.out.println(":(");
                               }else if (pInitial == 0) {
                                   System.out.println("Moviendo");
                               }
                            }
                        }
                    }
                }
        }
    }
}

