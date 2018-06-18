/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.race;

/**
 *
 * @author Edison
 */
public class CarRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro(150,"Toyota");
        Carro carro2 = new Carro(200,"Nisan");
        Carro carro3 = new Carro(100,"Mazda");
        
        carro1.movement();
        carro2.movement();
        carro3.movement();
                
    }
    
}
