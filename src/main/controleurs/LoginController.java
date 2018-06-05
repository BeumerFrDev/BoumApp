package main.controleurs;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable {

    @FXML
    private AnchorPane parent;
     @FXML private JFXButton exit;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML  private void close_app(MouseEvent event) {
        exit();
        
       
    }

}
