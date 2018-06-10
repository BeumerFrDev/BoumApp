package fr.bg.main.controleurs;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import fr.bg.main.Launch;
import fr.bg.main.modele.AnimationGenerator;
import javafx.event.EventHandler;

/**
 * FXML Controller class
 *
 * 
 * @author Ouadie
 */
public class LoginController implements Initializable {
    private double xOffset = 0;
    private double yOffset = 0;
    AnimationGenerator animationGenerator = null;
    @FXML
    private AnchorPane parent;
    @FXML
    private JFXButton exit;
    @FXML
    TextField userId;
    @FXML
    PasswordField password;
    @FXML
    Button login;
    @FXML
    Label errorMessage;

    private Launch application;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          errorMessage.setText("");
        userId.setPromptText("demo");
        password.setPromptText("demo");
        
    }

    @FXML  private void close_app() {
        exit();
        
    }
    
     public void setApp(Launch application){
        this.application = application;
    }
     
      @FXML   public void processLogin() {
        if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            errorMessage.setText("Hello " + userId.getText());
        } else {
            if (!application.userLogging(userId.getText(), password.getText())){
                errorMessage.setText("Username/Password is incorrect");
            }
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
