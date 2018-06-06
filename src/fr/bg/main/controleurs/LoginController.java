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

public class LoginController implements Initializable {

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
  
}
