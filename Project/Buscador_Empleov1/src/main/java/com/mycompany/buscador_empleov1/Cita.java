/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.buscador_empleov1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Cita {

public void get_cita() {
   Scanner scanner = new Scanner(System.in);
    Calendar fecha;
    String out_w = "no";
    while (out_w.contains("no")) {
        Random aleatorio;
        aleatorio = new Random();

        fecha = Calendar.getInstance();
        fecha.set (/*aleatorio.nextInt(10)+*/2018, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        System.out.println("La fecha de su cita es:  " + sdf.format(fecha.getTime()));
        System.out.println("Esta de acuerdo con el dia de su cita si // no? ");
        out_w = scanner.next();
        if (out_w.contains("si")) {
            String [] cita = {sdf.format(fecha.getTime())};
            System.out.println("Cita asignada para el: " + 
                    cita[0]);
        }
    }
    
}    
    
}
