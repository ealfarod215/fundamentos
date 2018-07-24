
package oo;

/**
 *
 * @author ulacit
 */
public class Carro {
    private boolean estaEncendido;
    
    /**
     * Constructor. Inicializa
     */
    public Carro() {
        System.out.println("Creando un nuevo carro...");
        estaEncendido = false;
    }
    
    public void encender() {
        if (estaEncendido) {
            System.out.println("Ya esta encendido");
        } else {
            estaEncendido = true;
            System.out.println("OK. Encendido!");
        }
    }
    
    public void apagar() {
        if (estaEncendido) {
            estaEncendido = true;
            System.out.println("OK. Apagado");
        } else {
            System.out.println("Ya esta apagado!");
        }
    }
}
