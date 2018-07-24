/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

import java.util.Random;

/**
 *
 * @author davibq
 */
public class Car {
    private Engine engine;
    private double position = 0;
    private String brand;
    
    public Car(String brand, int horsepower) {
        engine = new Engine(brand, horsepower);
        this.brand = brand;
    }
    
    public double move() {
        Random rnd = new Random();
        float factor = rnd.nextFloat();
        double movement = Math.floor(factor * engine.getHorsepower());
        position += movement;
        
        return position;
    }
    
    public double getPosition() {
        return position;
    }
    
    public String getBrand() {
        return brand;
    }
}
