/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print_car;

/**
 *
 * @author ulacit
 */
public class Car {
    Body body;
    Chassis chassis;
    int length;
    int dnum;
    public Car (int carl, int numdoor) {
        length = carl;
        dnum = numdoor;
    }
}
