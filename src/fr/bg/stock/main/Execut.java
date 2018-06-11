/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.main;
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
import fr.bg.main.controleurs.DashbordController;
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
 * @author lyess
 */
public class Execut extends Application {
    
    public Stage stage = null;
    public String test = "valid";

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
