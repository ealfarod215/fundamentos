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
public class Pentagon {
    int option;
    private int perimeter;
    private int area;
    private int mside;
    public Pentagon(int number, int side){
       option = number;
       mside = side;
    }
    
    public int Operation(){
        int t = 0;
        if (option == 1){
            perimeter = 5*mside;
            t = perimeter;
            System.out.println("El perimetro corresponde a: "+ t );
        }else if(option == 2){
            area = (int) ((5/2)*(mside*mside)*Math.sin(72));
            t = area;
            System.out.println("El area corresponde a: "+ t );
        }
        return t;
    }
}
