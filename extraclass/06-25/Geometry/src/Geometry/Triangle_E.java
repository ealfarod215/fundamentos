/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author Edison
 */
public class Triangle_E {
    int option;
    private int perimeter;
    private int area;
    private int mside;
    public Triangle_E(int number, int side){
       option = number;
       mside = side;
       
    }
    
    public int Operation(){
        int t = 0;
        if (option == 1){
            perimeter = mside*3;
            t = perimeter;
            System.out.println("El perimetro corresponde a: "+ t );
        }else if(option == 2){
            area = (int) ((Math.sqrt(3)/4)*(mside*mside));
            t = area;
            System.out.println("El area corresponde a: "+ t );
        }
        return t;
    }
}
