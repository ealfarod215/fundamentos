/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

/**
 *
 * @author ulacit
 */
public class Caracteristicas {
    private int tamano;
    
    public Caracteristicas(int size) {
        tamano = size;
    }
    
    public void cuadrado (){
        for (int i = 0; i < tamano; i++){
            if (i == 0 || i == tamano-1){
                imprimirlineacompleta(tamano);
            }else{
                imprimirlineavacia(tamano);
            }
            System.out.print("\n");
        }   
    }
    
    private  void imprimirlineavacia (int lado){
        System.out.print("*");
        for ( int j = 0; j < lado-2; j++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
    private  void imprimirlineacompleta (int lado){
        System.out.print("*");
        for ( int j = 0; j < lado-2; j++){
            System.out.print("*");
        }
        System.out.print("*");
    }

    /**
     * @param args the command line arguments
     */
    
    
}
