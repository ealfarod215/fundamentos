/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.extraclass.palindrome;

import java.util.Scanner;
/**
 *
 * @author Edison
 */
public class FundamentosExtraclassPalindrome {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String word = "";
      String revword = "";
      boolean out = false;
      String outword = "";        
      Scanner scanner = new Scanner(System.in);
      while (out  != true){
            System.out.print("Ingrese una palabra: ");
            word = scanner.nextLine();

            int length = word.length();

            for ( int i = length - 1; i >= 0; i-- ){
               revword = revword + word.charAt(i);
            }
            if (word.equals(revword)){
                System.out.println("La palabra: "+word+" es un palindrome.");
            }else{
                System.out.println("La palabra: "+word+" no es un palindrome.");
            }
        System.out.print("desea salir: ");
        outword = scanner.nextLine();
        if (outword.contains("si")){
            out = true;
        }
      }
      
    }    
}