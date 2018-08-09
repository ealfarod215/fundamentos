/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.storage.Acl.User;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.mycompany.buscador_empleov1.Empresa;
import com.mycompany.buscador_empleov1.Formulario_Company;
import com.mycompany.buscador_empleov1.Usuario;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edison
 */
public class FirestoreData {
    private String fileKey = "C:\\Users\\Edison\\Documents\\NetBeansProjects\\Buscador_Empleov1\\src\\main\\java\\datos\\key.json";
    private Firestore db;
    public FirestoreData() {
        try {
            InputStream serviceAccount = new FileInputStream(fileKey);
            GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
            FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(credentials)
                .build();
            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();
        } catch (Exception ex) {
            System.out.println("Error revise coneccion");
        }
    }
    
    public String guardarEmpresa(Empresa empresa) {
        try {
            ApiFuture<DocumentReference> refU1 = db.collection("empresas").add(empresa);
            // Obtenemos el ID del usuario guardado
            // Puede ir a la consola de Firebase y revisar en Database que se haya creado una colecciÃ³n User.
            // Ademas, dentro de User, debe existir un documento con el id que se imprima y los campos name, lastName y age.

            return refU1.get().getId();
        } catch (Exception ex) {
            System.out.println("No se pudo guardar los datos.");
        }
        return null;
    }
    
    public String guardarUsuario(Usuario persona) {
        try {
            ApiFuture<DocumentReference> refU1 = db.collection("Usuarios").add(persona);
            // Obtenemos el ID del usuario guardado
            // Puede ir a la consola de Firebase y revisar en Database que se haya creado una colecciÃ³n User.
            // Ademas, dentro de User, debe existir un documento con el id que se imprima y los campos name, lastName y age.

            return refU1.get().getId();
        } catch (Exception ex) {
            System.out.println("No se pudo guardar los datos.");
        }
        return null;
    }
    
    public List<Empresa> mostrarEmpresa() {
        CollectionReference empresasCollection = db.collection("empresas");
        ApiFuture<QuerySnapshot> querySnapshot = empresasCollection.get();
        List<Empresa> empresas = new ArrayList<Empresa>();
        try {
            for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
              Empresa e1 = document.toObject(Empresa.class);
              empresas.add(e1);
            }
        } catch (Exception ex) {}
            
        return empresas;
    }
    
    public List<Usuario> mostrarPersona() {
        CollectionReference empresasCollection = db.collection("Usuarios");
        ApiFuture<QuerySnapshot> querySnapshot = empresasCollection.get();
        List<Usuario> persona = new ArrayList<Usuario>();
        try {
            for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
              Usuario e1 = document.toObject(Usuario.class);
              persona.add(e1);
            }
        } catch (Exception ex) {}
            
        return persona;
    }
    
    public static void main(String[] args) {
        FirestoreData fd = new FirestoreData();
        fd.mostrarEmpresa();
    }
}
