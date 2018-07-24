/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;
/**
 *
 * @author ulacit
 */
public class Wheels {

    private int wheels;
    
    public Wheels(int wheelsSize) {
        wheels = wheelsSize;
    }
    
    
    public float getfactor(){
        /*Random random = new Random();
        wheels = random.nextInt(21);
        return wheels;*/
        return wheels / 20f;
    }
    
}
