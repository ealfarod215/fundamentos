/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author ulacit
 */
public class Rectangle {
    int option;
    private int perimeter;
    private int area;
    private int mside;
    private int mside2;
    public Rectangle(int number, int side, int side2){
       option = number;
       mside = side;
       mside2 = side2;
    }
    
    public int Operation(){
        int t = 0;
        if (option == 1){
            perimeter = mside+mside2+mside+mside2;
            t = perimeter;
            System.out.println("El perimetro corresponde a: "+ t );
        }else if(option == 2){
            area = mside*mside2;
            t = area;
            System.out.println("El area corresponde a: "+ t );
        }
        return t;
    }
}
