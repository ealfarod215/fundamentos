/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_account_objetos;

/**
 *
 * @author ulacit
 */
public class Operaciones {
    private String operacion;
    private int cuenta;
    public Operaciones (){
        cuenta = 0;
    }
    
    public int Debitar (int monto){
     if (operacion.compareTo("d") == 0){
                int remanente = cuenta - monto;
                if (remanente >= 0) {
                cuenta = cuenta - monto;
                System.out.println("credito listo! quedan : $"+cuenta);                
            }else{
                    System.out.println("no tiene fondos suficientes. Solo tienes $"+cuenta);
                }
        }return cuenta;
    }
    
    private int acreditar (int monto){
        if (operacion.compareTo("c") == 0){
            cuenta = cuenta + monto;
            System.out.println("credito listo! quedan : $"+cuenta);
        }
        return cuenta;
    }
}
