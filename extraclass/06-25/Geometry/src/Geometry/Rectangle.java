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
    public Rectangle(int number, int side){
       option = number;
       mside = side;
    }
    
    public int Operation(){
        int t = 0;
        if (option == 1){
            perimeter = mside+mside+mside+mside;
            t = perimeter;
            System.out.println("El perimetro corresponde a: "+ t );
        }else if(option == 2){
            area = mside*mside;
            t = area;
            System.out.println("El area corresponde a: "+ t );
        }
        return t;
    }
}
