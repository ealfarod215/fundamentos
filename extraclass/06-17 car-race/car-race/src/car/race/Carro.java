/*
Profe por alguna razon el programa solo muestra dos o uno de los carros que
llegan a la meta y la verdad no he podido encontrar el error, despues de que
muestra los primeros en llegar pareciera que se queda pegado,
pero no estoy seguro
 */
package car.race;
import java.util.Random;
/**
 *
 * @author Edison
 */
public class Carro {
private final String brand;
private int year;
private final int hpm;

public Carro(int hp, String name){
    hpm = hp;
    brand = name;
}


public void  movement (){
    int distance = 0;
    Random random = new java.util.Random();
    int rnum = random.nextInt(2);
    int total;
    while (distance != 1000){
        total = rnum*hpm;
        distance = distance+total;
    }
    System.out.println("listo "+brand+" llego a la meta");
}


        
}
