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
public class Circle {
    int option;
    private int perimeter;
    private int area;
    private int radio;
    public Circle(int number, int r){
       option = number;
       radio = r;
    }
    
    public int Operation(){
        int t = 0;
        if (option == 1){
            perimeter = (int) (2*Math.PI*radio);
            t = perimeter;
        }else if(option == 2){
            area = (int) (Math.PI*radio*radio);
            t = area;
        }
        return t;
    }
}
