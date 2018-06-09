/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main;

import java.io.InputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import fr.bg.main.controleurs.AdminViewController;
import fr.bg.main.controleurs.LoginController;
import fr.bg.main.controleurs.SplashScreenController;
import fr.bg.main.modele.Adresses;
import fr.bg.main.modele.Affectations;
import fr.bg.main.modele.Directeur;
import fr.bg.main.modele.Individus;
import fr.bg.main.modele.plandetri.Parc;

import org.hibernate.SessionFactory;

/**
 *
 * @author Ouadie
 */
public class Launch extends Application {

    public  Stage stage = null;
    public  String test = "valid";
    
    private Individus loggedUser;

    private final double MINIMUM_WINDOW_WIDTH = 390.0;
    private final double MINIMUM_WINDOW_HEIGHT = 500.0;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root;
        
         FXMLLoader loader = new FXMLLoader(getClass().getResource("vues/SplashScreen.fxml"));
         root = (Parent) loader.load();
         SplashScreenController ctrl = loader.getController();
         ctrl.setApp(this);
          
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        this.stage = stage;
        stage.show();
      
        
          Individus indii = new Directeur("AOUALI","Salim","H",new Date(),"Bizerte","L3MIAGE","Informatique","Etudiant",new Adresses(),"Arabe","FR","..\\assets\\image\\salim.jpg","","","0638441611","ben.aissa.ouadie@gmail.com");
         Affectations afff = new Affectations(3,"CDI","directeur","pass",new Date(),new Date(),"Prof","c://",indii);
       
       
     
          //gotoLogin();
         
           
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
        public Individus getLoggedUser() {
        return loggedUser;
    }
        
    public boolean userLogging(String userId, String password){
        if (Affectations.validate(userId, password)) {
           loggedUser =Affectations.of(userId);
           System.out.println(loggedUser.getClass());
           if(loggedUser.getClass().toString().endsWith("Directeur")) gotoAdminView();
    
           else userLogout();
            return true;
        } else {
            return false;
        }
    }
   public void userLogout(){
        loggedUser = null;
        gotoLogin();
    }
    public void gotoAdminView() {
        try {
            AdminViewController adminView;
            adminView = (AdminViewController) replaceSceneContent("vues/AdminView.fxml");
          
            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public void gotoLogin() {
        try {
            LoginController login = (LoginController) replaceSceneContent("/main/vues/login.fxml");
            login.setApp( this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
       public void gotoLogin(Launch app ) {
        try {
            LoginController login = (LoginController) replaceSceneContent("vues/login.fxml");
            login.setApp( app);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
     public Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Launch.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Launch.class.getResource(fxml));
       
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
           System.out.println("test2"+fxml+"**"+Launch.class.getResource(fxml));
             in.close();
            
        } 
        
        
        Scene scene = new Scene(page, 1024, 743);
        scene = new Scene(page);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        this.stage = stage;
        return (Initializable) loader.getController();
    }
}
