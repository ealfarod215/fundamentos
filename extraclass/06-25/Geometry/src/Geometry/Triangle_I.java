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
public class Triangle_I {
    int option;
    private int perimeter;
    private int area;
    private int mside;
    private int mside2;
    public Triangle_I(int number, int side, int side2){
       option = number;
       mside = side;
       mside2 = side2;
    }
    
    public int Operation(){
        int t = 0;
        if (option == 1){
            perimeter = (2*mside)+mside2;
            t = perimeter;
            System.out.println("El perimetro corresponde a: "+ t );
        }else if(option == 2){
            area = (int) (mside2*Math.sqrt((mside*mside)-((mside2*mside2)/4))/2);
            t = area;
            System.out.println("El area corresponde a: "+ t );
        }
        return t;
    }
}
