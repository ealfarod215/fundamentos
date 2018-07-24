/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador_empleo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Cita {

public void get_cita() {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int cita_day = random.nextInt(6);
    int cita_week = random.nextInt(5);
    int cita_month = random.nextInt(13);
    String out_w = "no";
    while (out_w.contains("no")) {
        System.out.println("La Fecha de su cita ha sido asiganada para el: " + 
            "día: " + cita_day+ " de la semana: " + cita_week + 
            " del mes: " + cita_month);
        System.out.println("Esta de acuerdo con el dia de su cita si // no? ");
        out_w = scanner.next();    
    }
    
}    
    
}
