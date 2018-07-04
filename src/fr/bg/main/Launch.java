/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main;

import fr.bg.main.Utils.HibernateUtil;
import fr.bg.main.Utils.TestDAO;
import fr.bg.main.Utils.Test;
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

import fr.bg.main.controleurs.DashBoardController;
import fr.bg.main.controleurs.GestionInterventionController;
import fr.bg.main.controleurs.GestionParcController;
import fr.bg.main.controleurs.GestionRessourcesController;

import fr.bg.main.controleurs.GestionSearchController;
import fr.bg.main.controleurs.GestionStockController;
import fr.bg.main.controleurs.GestionUtilisateurController;
import fr.bg.main.controleurs.LoginController;
import fr.bg.main.controleurs.SplashScreenController;
import fr.bg.main.modele.Adresses;
import fr.bg.main.modele.Affectations;
import static fr.bg.main.modele.Affectations.of;
import static fr.bg.main.modele.Affectations.validate;
import fr.bg.main.modele.Directeur;
import fr.bg.main.modele.Individus;



import static java.lang.System.out;
import java.util.List;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static javafx.stage.StageStyle.DECORATED;
import static javafx.stage.StageStyle.UNDECORATED;
import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ouadie
 */
public class Launch extends Application {

    public Stage stage = null;
    public String test = "valid";

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
        stage.initStyle(UNDECORATED);
        this.stage = stage;
        stage.show();

        Individus indii = new Directeur("BENAISSA", "Ouadie", "H", new Date(), "Bizerte", "L3MIAGE", "Informatique", "Etudiant", new Adresses(), "Arabe", "FR", "..\\assets\\image\\salim.jpg", "", "", "0638441611", "ben.aissa.ouadie@gmail.com");

        Affectations afff = new Affectations(3, "CDI", "", "", new Date(), new Date(), "Prof", "c://", indii);

       TestDAO testDao = new TestDAO();
        System.out.println("Add new test");
       Test test = new Test();
      test.setNom("HHHHHH");
      System.out.println(testDao.create(test));
       

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


    public boolean userLogging(String userId, String password) {
        if (validate(userId, password)) {
            loggedUser = of(userId);
            out.println(loggedUser.getClass());
            if (loggedUser.getClass().toString().endsWith("Directeur")) {
                gotoDashbord();
            } else {
                userLogout();
            }
            return true;
        } else {
            return false;
        }
    }

    public void userLogout() {
        loggedUser = null;
        gotoLogin();
    }

   
  public void gotoDashbord() {
        try {
            DashBoardController adminView;
            adminView = (DashBoardController) replaceSceneContent("vues/DashBoard.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
  public void gotoGestionIntervention() {
        try {
            GestionInterventionController adminView;
            adminView = (GestionInterventionController) replaceSceneContent("vues/GestionIntervention.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
    public void gotoGestionRessources() {
        try {
            GestionRessourcesController adminView;
            adminView = (GestionRessourcesController) replaceSceneContent("vues/GestionPlanning.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
       public void gotoGestionSearch() {
        try {
            GestionSearchController adminView;
            adminView = (GestionSearchController) replaceSceneContent("vues/GestionPlanning.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
              public void gotoGestionStock() {
        try {
            GestionStockController adminView;
            adminView = (GestionStockController) replaceSceneContent("vues/GestionStock.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
       public void gotoGestionUtilisateur() {
        try {
            GestionUtilisateurController adminView;
            adminView = (GestionUtilisateurController) replaceSceneContent("vues/GestionUtilisateur.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
        public void gotoDocuments() {
        try {
            GestionUtilisateurController adminView;
            adminView = (GestionUtilisateurController) replaceSceneContent("vues/Documents.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
    public void gotoGestionParc() {
        try {
            GestionParcController gestionParc;
            gestionParc = (GestionParcController) replaceSceneContent("vues/gestionParc.fxml", 0);

            gestionParc.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
    public void gotoLogin() {
        try {
            LoginController login = (LoginController) replaceSceneContent("vues/Login.fxml", 0);
            login.setApp(this);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }

 

    public Initializable replaceSceneContent(String fxml, int a) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Launch.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Launch.class.getResource(fxml));

        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            out.println("test2" + fxml + "**" + Launch.class.getResource(fxml));
            in.close();

        }

        if (a == 1) {
            Scene scene = new Scene(page, 1366, 768);
            Stage stage1;
            stage1 = new Stage();
            stage1.setScene(scene);
            stage1.initStyle(DECORATED);
            stage.hide();
            stage1.show();
            stage = stage1;
        } else {
            Scene scene = new Scene(page, 1024, 600);
            Stage stage1;
            stage1 = new Stage();
            stage1.setScene(scene);
            stage1.initStyle(UNDECORATED);
            stage.hide();
            stage1.show();
            stage = stage1;

        }
        return (Initializable) loader.getController();
    }
}
