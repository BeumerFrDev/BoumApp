/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.controleurs;

import fr.bg.main.Launch;
import fr.bg.main.modele.Individus;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
public class AdminViewController implements Initializable {

    private Individus loggedUser;

    //Notre variable d'application
    private Launch application;
    private Label success;
    @FXML
    private MenuButton menuButon;
    @FXML
    private ImageView imageView;

    @FXML
    PieChart pieChart;
    @FXML
    private HBox GrandFenetreHbox;
    @FXML
    Tab reporting;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    public void setApp(Launch application) throws FileNotFoundException {
        this.application = application;
        loggedUser = application.getLoggedUser();
        System.out.println(loggedUser.getNomIndividu() + "test5logguedUserAdminViewsetApp");
        menuButon.getItems().add(0, new MenuItem(loggedUser.getNomIndividu() + " " + loggedUser.getPrenomIndividu()));
        affichePhotoLoggedUser();

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

    private void affichePhotoLoggedUser() throws FileNotFoundException {
        Image image = null;
        Exception exception = null;
        try {
            image = new Image(getClass().getResource(loggedUser.getPhotoIndividu()).toString());
        } catch (Exception e) {

        }
        if (loggedUser.getPhotoIndividu() == null || loggedUser.getPhotoIndividu() == "") {
            image = new Image(getClass().getResource("..\\assets\\image\\admin.png").toString());
        }
        imageView.setImage(image);

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
}
