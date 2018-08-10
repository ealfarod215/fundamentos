/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import user_login.User_Login;

/**
 *
 * @author Edison
 */
public class Data {
 private String Usuario;
 private String Contraseña;
public Data() {
    File file = new File("Usuarios.csv");
    System.out.println(file.exists());
    try {

    FileReader fr = new FileReader("C:\\Users\\ediso\\Documents\\NetBeansProjects\\User_Login\\Usuarios.txt");
    BufferedReader bf = new BufferedReader(fr);
    String sCadena;
    User_Login U = new User_Login();
    
    int i = 0;
    while ((sCadena = bf.readLine())!=null) {
        i++;
        if (i == 1) {
            U.setUser(sCadena);
            
        }else if (i == 2) {
            U.setPassword(sCadena);
            
        }
        
       /*System.out.println(sCadena);*/
    }
    Usuario = U.getUser();
    Contraseña = U.getPassword();

   } catch (Exception ex){
    System.out.println("Error al consultar datos");
   }
}


    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

}