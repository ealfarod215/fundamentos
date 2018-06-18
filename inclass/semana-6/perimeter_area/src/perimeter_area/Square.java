/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeter_area;

/**
 *
 * @author ulacit
 */
public class Square {
    int option;
    private int perimeter;
    private int area;
    private int mside;
    public Square(int number, int side){
       option = number;
       mside = side;
    }
    
    public int Operation(){
        int t = 0;
        if (option == 1){
            perimeter = mside+mside+mside+mside;
            t = perimeter;
        }else if(option == 2){
            area = mside*mside;
            t = area;
        }
        return t;
    }
}
