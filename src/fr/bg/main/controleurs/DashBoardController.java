package fr.bg.main.controleurs;

import fr.bg.main.Launch;
import fr.bg.main.modele.AnimationGenerator;
import fr.bg.main.modele.Individus;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.out;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import javafx.animation.FadeTransition;
import static javafx.application.Platform.exit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;

import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import static javafx.util.Duration.millis;

/**
 * FXML Controller class
 *
 *
 * @author Ouadie
 */
public class DashBoardController implements Initializable {

    private Individus loggedUser;
    @FXML
    private VBox content_area;
    @FXML
    private HBox menubar;

    boolean flag = true;
    //Notre variable d'application
    private Launch application;
    private Label success;
    @FXML
    private MenuButton menuButon;
    @FXML
    private ImageView imageView;
    private double xOffset = 0;
    private double yOffset = 0;
    AnimationGenerator animationGenerator = null;
    @FXML
    private AnchorPane parent;
    private VBox gestionVBox;
 @FXML
    private AnchorPane p2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        out.println("fff");
        
    }

    @FXML
    private void close_app() {
        exit();

    }

    public void setApp(Launch application) throws FileNotFoundException {
        this.application = application;
        makeStageDrageable();
       gotoDashBoardInit();
      
        makeStageDrageable();
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
            out.println("hhhhhhhhhhhhhhhhhhhh"+fxml+"**"+Launch.class.getResource(fxml));
             in.close();
            
        } 
        
        
       if(!p2.getChildren().isEmpty()){
           
            p2.getChildren().clear();
        }
         p2.getChildren().removeAll();
        p2.getChildren().addAll(page.getChildren());
       
       
       
       
        
      //  application.init();
        return (Initializable) loader.getController();
    }
    /*
    public Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Launch.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Launch.class.getResource(fxml));

        AnchorPane page;

        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            System.out.println("hhhhhhhhhhhhhhhhhhhh" + fxml + "**" + Launch.class.getResource(fxml));
            in.close();

        }

        if (!GrandFenetreHbox.getChildren().isEmpty()) {

            GrandFenetreHbox.getChildren().removeAll();
        }

        GrandFenetreHbox.getChildren().add(page);

        application.init();
        return (Initializable) loader.getController();
    }
     */
    @FXML
    public void processLogout(ActionEvent event) {
        if (application == null) {
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            return;
        }

        application.userLogout();
    }

    @FXML
    public void gotoDashbord() {
        application.gotoDashbord();
    }

    @FXML
    public void gotoDocuments() {
        try {
            DocumentsController documents = (DocumentsController) replaceSceneContent("vues/Documents.fxml");
            documents.setApp(application);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }
      @FXML
    public void gotoDashBoardInit() {
        try {
            GestionDashBoardInitController dashInit = (GestionDashBoardInitController) replaceSceneContent("vues/DashBoardInit.fxml");
            dashInit.setApp(application);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }

    @FXML
    public void gotoGestionIntervention() {
            try {
            GestionInterventionController controleur = (GestionInterventionController) replaceSceneContent("vues/GestionIntervention.fxml");
            controleur.setApp(application);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }

    @FXML
    public void gotoGestionParc() {
             try {
            GestionParcController controleur = (GestionParcController) replaceSceneContent("vues/gestionParc.fxml");
            controleur.setApp(application);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }

    @FXML
    public void gotoGestionRessources() {
                 try {
            GestionRessourcesController controleur = (GestionRessourcesController) replaceSceneContent("vues/GestionRessources.fxml");
            controleur.setApp(application);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }

    @FXML
    public void gotoGestionSearch() {
               try {
            GestionSearchController controleur = (GestionSearchController) replaceSceneContent("vues/Search.fxml");
            controleur.setApp(application);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }

    @FXML
    public void gotoGestionStock() {
                 try {
            GestionStockController controleur = (GestionStockController) replaceSceneContent("vues/GestionStock.fxml");
            controleur.setApp(application);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }

    @FXML
    public void gotoGestionUtilisateur() {
                try {
            GestionUtilisateurController controleur = (GestionUtilisateurController) replaceSceneContent("vues/GestionUtilisateur.fxml");
            controleur.setApp(application);
        } catch (Exception ex) {
            getLogger(Launch.class.getName()).log(SEVERE, null, ex);
        }
    }

    public void saveAdminView(ActionEvent event) {
        if (application == null) {
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
            animateMessage();
            return;
        }
        Individus loggedUser = application.getLoggedUser();

        animateMessage();
    }

    @FXML
    private void handleMenuFullScreen(ActionEvent event) {
        Stage stage = application.stage;
        out.println("Full Screen");
        stage.setFullScreen(!stage.isFullScreen());
    }

  
    private void animateMessage() {
        FadeTransition ft = new FadeTransition(millis(1000), success);
        ft.setFromValue(0.0);
        ft.setToValue(1);
        ft.play();
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
