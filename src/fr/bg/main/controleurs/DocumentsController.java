package fr.bg.main.controleurs;

import fr.bg.main.Launch;
import fr.bg.main.modele.AnimationGenerator;
import fr.bg.main.modele.Individus;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import static javafx.application.Platform.exit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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

/**
 * FXML Controller class
 *
 *
 * @author Ouadie
 */
public class DocumentsController implements Initializable {

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
    private VBox gestionVBox ;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("fff");
    }
 @FXML  private void close_app() {
        exit();
        
    }
    public void setApp(Launch application) throws FileNotFoundException {
        this.application = application;
        makeStageDrageable();
        loggedUser = application.getLoggedUser();
        System.out.println(loggedUser.getNomIndividu() + "test5logguedUserAdminViewsetApp");
        menuButon.getItems().add(0, new MenuItem(loggedUser.getNomIndividu() + " " + loggedUser.getPrenomIndividu()));
        affichePhotoLoggedUser();
        makeStageDrageable();
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
    private void handleMenuFullScreen(ActionEvent  event) {
        Stage stage = application.stage;
        System.out.println("Full Screen");
       stage.setFullScreen(!stage.isFullScreen());
    }
@FXML
    public void gotoDashbord() {
        application.gotoDashbord();
    }

    @FXML
    public void gotoDocuments() {
        application.gotoDocuments();
    }

    @FXML
    public void gotoGestionIntervention() {
        application.gotoGestionIntervention();
    }

    @FXML
    public void gotoGestionParc() {
        application.gotoGestionParc();
    }

    @FXML
    public void gotoGestionPlanning() {
        application.gotoGestionPlanning();
    }

    @FXML
    public void gotoGestionSearch() {
        application.gotoGestionSearch();
    }

    @FXML
    public void gotoGestionStock() {
        application.gotoGestionStock();
    }

    @FXML
    public void gotoGestionUtilisateur() {
        application.gotoGestionUtilisateur();
    }
    private void affichePhotoLoggedUser() throws FileNotFoundException {
        
      
      //  if (loggedUser.getPhotoIndividu() == null || loggedUser.getPhotoIndividu() == "") {
       // image = new Image(getClass().getResource("/main/assets/images/admin.png").toString());
          //image = new Image("../assets/images/admin.png".toString(), true);
        
//    }
//imageView= new ImageView(getClass().getResource("url:https://avatars0.githubusercontent.com/u/15785708?s=460&v=4").toExternalForm());

        imageView.setFitWidth(45);
        imageView.setFitHeight(45);
        Circle circle = new Circle();

        circle.setRadius(20.0f);
        circle.setCenterX(40.0f / 2);
        circle.setCenterY(40.0f / 2);
        imageView.setClip(circle);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);

    }

    private void animateMessage() {
        FadeTransition ft = new FadeTransition(Duration.millis(1000), success);
        ft.setFromValue(0.0);
        ft.setToValue(1);
        ft.play();
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
