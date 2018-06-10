package fr.bg.main.controleurs;

import fr.bg.main.Launch;
import fr.bg.main.modele.AnimationGenerator;
import fr.bg.main.modele.Individus;
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
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Benny In
 */
public class MainController implements Initializable {

     private Individus loggedUser;

    //Notre variable d'application
    private Launch application;
    private Label success;
   
    
    private double xOffset = 0;
    private double yOffset = 0;
    AnimationGenerator animationGenerator = null;
    @FXML
    private AnchorPane parent;

    @FXML
    private BorderPane border_pane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeStageDrageable();
        try {
            Parent contentarea = FXMLLoader.load(getClass().getResource("/app/views/ContentArea.fxml"));
            border_pane.setCenter(contentarea);
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   public void makeStageDrageable() {
        parent.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        parent.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                application.stage.setX(event.getScreenX() - xOffset);
                application.stage.setY(event.getScreenY() - yOffset);
                application.stage.setOpacity(0.7f);
            }
        });
        parent.setOnDragDone((e) -> {
            application.stage.setOpacity(1.0f);
        });
        parent.setOnMouseReleased((e) -> {
            application.stage.setOpacity(1.0f);
        });
    }

}
