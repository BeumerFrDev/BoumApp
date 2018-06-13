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
import fr.bg.main.controleurs.DashBoardController;
import fr.bg.main.controleurs.GestionInterventionController;
import fr.bg.main.controleurs.GestionParcController;
import fr.bg.main.controleurs.GestionPlannigController;
import fr.bg.main.controleurs.GestionSearchController;
import fr.bg.main.controleurs.GestionStockController;
import fr.bg.main.controleurs.GestionUtilisateurController;
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
        stage.initStyle(StageStyle.UNDECORATED);
        this.stage = stage;
        stage.show();

        Individus indii = new Directeur("fARID", "eeee", "H", new Date(), "Bizerte", "L3MIAGE", "Informatique", "Etudiant", new Adresses(), "Arabe", "FR", "..\\assets\\image\\salim.jpg", "", "", "0638441611", "ben.aissa.ouadie@gmail.com");
        Affectations afff = new Affectations(3, "CDI", "", "", new Date(), new Date(), "Prof", "c://", indii);

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
        if (Affectations.validate(userId, password)) {
            loggedUser = Affectations.of(userId);
            System.out.println(loggedUser.getClass());
            if (loggedUser.getClass().toString().endsWith("Directeur")) {
                gotoGestionParc();
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

    public void gotoAdminView() {
        try {
            AdminViewController adminView;
            adminView = (AdminViewController) replaceSceneContent("vues/AdminView.fxml", 1);

            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void gotoDashbord() {
        try {
            DashBoardController adminView;
            adminView = (DashBoardController) replaceSceneContent("vues/dashBoard.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void gotoGestionIntervention() {
        try {
            GestionInterventionController adminView;
            adminView = (GestionInterventionController) replaceSceneContent("vues/GestionIntervention.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void gotoGestionPlanning() {
        try {
            GestionPlannigController adminView;
            adminView = (GestionPlannigController) replaceSceneContent("vues/GestionPlanning.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void gotoGestionSearch() {
        try {
            GestionSearchController adminView;
            adminView = (GestionSearchController) replaceSceneContent("vues/GestionPlanning.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
              public void gotoGestionStock() {
        try {
            GestionStockController adminView;
            adminView = (GestionStockController) replaceSceneContent("vues/GestionStock.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void gotoGestionUtilisateur() {
        try {
            GestionUtilisateurController adminView;
            adminView = (GestionUtilisateurController) replaceSceneContent("vues/GestionUtilisateur.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void gotoDocuments() {
        try {
            GestionUtilisateurController adminView;
            adminView = (GestionUtilisateurController) replaceSceneContent("vues/Documents.fxml", 0);

            adminView.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void gotoGestionParc() {
        try {
            GestionParcController gestionParc;
            gestionParc = (GestionParcController) replaceSceneContent("vues/gestionParc.fxml", 0);

            gestionParc.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void gotoLogin() {
        try {
            LoginController login = (LoginController) replaceSceneContent("vues/Login.fxml", 0);
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Launch.class.getName()).log(Level.SEVERE, null, ex);
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
            System.out.println("test2" + fxml + "**" + Launch.class.getResource(fxml));
            in.close();

        }

        if (a == 1) {
            Scene scene = new Scene(page, 1366, 768);
            Stage stage1;
            stage1 = new Stage();
            stage1.setScene(scene);
            stage1.initStyle(StageStyle.DECORATED);
            stage.hide();
            stage1.show();
            stage = stage1;
        } else {
            Scene scene = new Scene(page, 1024, 600);
            Stage stage1;
            stage1 = new Stage();
            stage1.setScene(scene);
            stage1.initStyle(StageStyle.UNDECORATED);
            stage.hide();
            stage1.show();
            stage = stage1;

        }
        return (Initializable) loader.getController();
    }
}
