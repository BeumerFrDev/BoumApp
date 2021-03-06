package fr.bg.main.controleurs;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import fr.bg.main.modele.AnimationGenerator;
import fr.bg.main.Launch;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;

/**
 * FXML Controller class
 *
 * 
 * @author Ouadie
 */

public class SplashScreenController extends AnchorPane implements Initializable {

    private double xOffset = 0;
    private double yOffset = 0;
    AnimationGenerator animationGenerator = null;
    @FXML
    private AnchorPane parent;
    private Launch application;
    
    
    public void setApp(Launch application){
        this.application = application;
        makeStageDrageable();
          try {
            
              
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/fr/bg/main/vues/Login.fxml"));
         Parent fxml = (Parent) loader.load();
         LoginController ctrl = loader.getController();
         ctrl.setApp(application);
          
            
         
            animationGenerator = new AnimationGenerator();
            animationGenerator.applyFadeAnimationOn01(parent, 2000, 1, 0.2, 1, (e) -> {
                animationGenerator.applyFadeAnimationOn02(parent, 2000, 0.2, 1, 1, (e2) -> {
                    parent.getChildren().removeAll();
                    parent.getChildren().setAll(fxml);
                });
            });
           
        } catch (IOException ex) {
            getLogger(SplashScreenController.class.getName()).log(SEVERE, null, ex);
        }
       
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    }

    public void makeStageDrageable() {
        parent.setOnMousePressed((MouseEvent event) -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        parent.setOnMouseDragged((MouseEvent event) -> {
            application.stage.setX(event.getScreenX() - xOffset);
            application.stage.setY(event.getScreenY() - yOffset);
            application.stage.setOpacity(0.7f);
        });
        parent.setOnDragDone((e) -> {
            application.stage.setOpacity(1.0f);
        });
        parent.setOnMouseReleased((e) -> {
            application.stage.setOpacity(1.0f);
        });
    }

}
