
package maze;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Maze {

    
    public static void main(String[] args) {
        boolean itFinish = true;
        Scanner scanner = new Scanner(System.in);
        metodos m = new metodos();
        Random number = new Random();
        int [][] maze = new int [6][6];
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    maze[i][j] = number.nextInt(2);
                }
            }
            int num = number.nextInt(5);
            int num1 = number.nextInt(5);
            maze[num][num] = 2;
            maze[num1][num1] = 3;
            m.print(maze);
            m.move(maze);
 
    }
}
