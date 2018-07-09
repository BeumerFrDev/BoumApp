package fr.bg.main.controleurs.Parc;

import fr.bg.main.controleurs.utilisateurs.*;
import fr.bg.main.controleurs.*;
import fr.bg.main.Launch;
import fr.bg.main.Utils.DAO.Parc.BlocksDAO;
import fr.bg.main.Utils.DAO.Parc.TypesDAO;
import fr.bg.main.modele.AnimationGenerator;
import fr.bg.main.modele.Individus;
import fr.bg.main.modele.Parc.Blocks;
import fr.bg.main.modele.Parc.Types;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.out;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import static javafx.application.Platform.exit;
import javafx.beans.value.ChangeListener;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
import fr.bg.main.Utils.AlertMaker;

/**
 * FXML Controller class
 *
 *
 * @author Ouadie
 */
public class TabPanParcController implements Initializable {

    private Individus loggedUser;
    @FXML
    private VBox content_area;
    @FXML
    private HBox menubar;

    private boolean flag = true;
    private boolean isSetEquipementAddNewButtonClick;
    private boolean isSetEquipementEditButtonClick;

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
    private DatePicker equipementDPDateMiseEnPlace;
    @FXML
    private Button equipementAddNewButtonClick;

    @FXML
    private Button equipementEditButtonClick;

    @FXML
    private Button equipementDeleteButtonClick;

    @FXML
    private TextField equipementTFID;
    @FXML
    private TextField equipementTFNumero;

    @FXML
    private ChoiceBox<String> equipementCBType;

    @FXML
    private TextField equipementTFTypeReference;

    @FXML
    private TextField equipementTFTypeLibelle;

    @FXML
    private TextField EquipementTFTypeDDV;

    @FXML
    private ImageView EquipementImageViewImage;

    @FXML
    private Button equipementClearButtonClick;

    @FXML
    private Button equipementSaveButtonClick;

    @FXML
    private TextField adminTFSearch;

    @FXML
    private Button equipementViewButtonClick;

    @FXML
    private Button equipementRefreshButtonClick;

    @FXML
    private TableView<EquipementTable> equipementTableView;

    @FXML
    private TableColumn<EquipementTable, String> equipementTCID;

    @FXML
    private TableColumn<EquipementTable, Integer> equipementTCNumero;

    @FXML
    private TableColumn<EquipementTable, String> equipementTCLibelle;

    @FXML
    private TableColumn<EquipementTable, String> equipementTCDateDeMiseEnPlace;

    @FXML
    private TableColumn<EquipementTable, String> equipementTCReference;

    @FXML
    private TableColumn<EquipementTable, Integer> equipementTCDDV;

    @FXML
    private TableColumn<EquipementTable, String> equipementTCImage;
    private TypesDAO typesDao = new TypesDAO();
    private BlocksDAO blocksDao = new BlocksDAO();
    private List<Blocks> blocks;
    private List<Types> typesL;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        equipementTCImage.setCellValueFactory(new PropertyValueFactory<EquipementTable, String>("equipementTDImage"));
        equipementTCDDV.setCellValueFactory(new PropertyValueFactory<EquipementTable, Integer>("equipementTDDDV"));
        equipementTCReference.setCellValueFactory(new PropertyValueFactory<EquipementTable, String>("equipementTDReference"));
        equipementTCLibelle.setCellValueFactory(new PropertyValueFactory<EquipementTable, String>("equipementTDLibelle"));
        equipementTCID.setCellValueFactory(new PropertyValueFactory<EquipementTable, String>("equipementTDID"));
        equipementTCDateDeMiseEnPlace.setCellValueFactory(new PropertyValueFactory<EquipementTable, String>("equipementTDDateDeMiseEnPlace"));
        equipementTCNumero.setCellValueFactory(new PropertyValueFactory<EquipementTable, Integer>("equipementTDNumero"));
       
    }

    @FXML
    private void close_app() {
        exit();

    }

    private ObservableList getDataAndAddToEquipementTable() {
        ObservableList<EquipementTable> tableData = FXCollections.observableArrayList();
        blocks = blocksDao.findAll();
        blocks = blocksDao.findAll();

        for (Blocks block : blocks) {
            Types type = typesDao.findByReference(block.getReferenceType());
            System.out.println();
            tableData.add(new EquipementTable(
                    block.getIdBlock() == null ? "" : block.getIdBlock(),
                    block.getNumeroBlock() == null ? 0 : block.getNumeroBlock(),
                    type.getLibelleType() == null ? "Sans Libelle" : type.getLibelleType(),
                    type.getReferenceType() == null ? "Sans reference" : type.getReferenceType(),
                    type.getDureDeVieType() == null ? 0 : type.getDureDeVieType(),
                    block.getDateDeMiseEnPlace() == null ? "" : block.getDateDeMiseEnPlace().toString(),
                    type.getImageType()));

        }

        return tableData;
    }

    public void setApp(Launch application) throws FileNotFoundException {
        this.application = application;
        makeStageDrageable();
        loggedUser = application.getLoggedUser();
        out.println(loggedUser.getNomIndividu() + "test5logguedUserAdminViewsetApp");
        menuButon.getItems().add(0, new MenuItem(loggedUser.getNomIndividu() + " " + loggedUser.getPrenomIndividu()));
        affichePhotoLoggedUser();
        makeStageDrageable();

        equipementDPDateMiseEnPlace.setValue(LocalDate.now());
 equipementTableView.setItems(getDataAndAddToEquipementTable());

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

            return;
        }

        application.userLogout();
    }

    public void saveAdminView(ActionEvent event) {
        if (application == null) {

            animateMessage();
            return;
        }
        Individus loggedUser = application.getLoggedUser();

        animateMessage();
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
    public void gotoGestionRessources() {
        application.gotoGestionRessources();
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
    private void handleMenuFullScreen(ActionEvent event) {
        Stage stage = application.stage;
        out.println("Full Screen");
        stage.setFullScreen(!stage.isFullScreen());
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

    /*
        Une fonction pour Ajouter un nouveau equipement
     */
    @FXML
    private void setEquipementAddNewButtonClick(Event event) {
        equipementSetAllEnable();
        isSetEquipementAddNewButtonClick = true;
        typesL = typesDao.findAll();
        ArrayList libelTypeList = new ArrayList();
        for (Types type : typesL) {

            libelTypeList.add(type.getLibelleType());
        }
        equipementCBType.setItems(FXCollections.observableArrayList(libelTypeList));

        ChangeListener<String> changeListener = new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observable, //
                    String oldValue, String newValue) {
                if (newValue != null) {
                    for (Types type : typesL) {
                        if (type.getLibelleType() == newValue) {
                            equipementTFTypeReference.setText(type.getReferenceType());
                            equipementTFTypeLibelle.setText(type.getLibelleType());
                            EquipementTFTypeDDV.setText(type.getDureDeVieType() + "");
                        }
                    }

                }
            }
        };
        // Selected Item Changed.
        equipementCBType.getSelectionModel().selectedItemProperty().addListener(changeListener);

    }

    /*
       Pour desactiver tout les champs de saisie
     */
    private void equipementSetAllEnable() {
        equipementTFID.setDisable(false);
        equipementTFNumero.setDisable(false);
        //equipementTFTypeReference.setDisable(false);
        //equipementTFTypeLibelle.setDisable(false);
        //EquipementTFTypeDDV.setDisable(false);
        equipementCBType.setDisable(false);
        equipementDPDateMiseEnPlace.setDisable(false);
        equipementSaveButtonClick.setDisable(false);
        equipementClearButtonClick.setDisable(false);

    }

    /*
       Pour activer tout les champs de saisie
     */
    private void equipementSetAllDisable() {
        equipementTFID.setDisable(true);
        equipementTFNumero.setDisable(true);
        equipementTFTypeReference.setDisable(true);
        equipementTFTypeLibelle.setDisable(true);
        EquipementTFTypeDDV.setDisable(true);
        equipementCBType.setDisable(true);
        equipementDPDateMiseEnPlace.setDisable(true);
        equipementSaveButtonClick.setDisable(true);
        equipementClearButtonClick.setDisable(true);

    }

    private void equipementSetAllClear() {
        equipementTFID.clear();
        equipementTFNumero.clear();
        equipementTFTypeReference.clear();
        EquipementTFTypeDDV.clear();
        equipementTFTypeLibelle.clear();
        equipementDPDateMiseEnPlace.setValue(LocalDate.now());
    }

    @FXML
    private void setEquipementClearButtonClick(Event event) {
        equipementSetAllClear();
        equipementSetAllDisable();
        isSetEquipementAddNewButtonClick = false;
        isSetEquipementEditButtonClick = false;

    }

    @FXML
    private void setEquipementSaveButtonClick(Event event) {

        System.out.println("test block creation");

        if (isSetEquipementAddNewButtonClick) {

            BlocksDAO blocksDao = new BlocksDAO();
            System.out.println("Add new Block");
            Blocks block = new Blocks();
            block.setIdBlock(equipementTFID.getText());
            block.setNumeroBlock(Integer.parseInt(equipementTFNumero.getText()));
            block.setReferenceType("LF");

            System.out.println(equipementDPDateMiseEnPlace.getValue());
            Date date1 = Date.from(equipementDPDateMiseEnPlace.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
            block.setDateDeMiseEnPlace(date1);
            System.out.println(blocksDao.create(block));
            AlertMaker.showSimpleAlert("Ajout", "L'equipement ajouté avec sucées ");

        } else if (isSetEquipementEditButtonClick) {

        }

        equipementSetAllClear();
        equipementSetAllDisable();
         isSetEquipementEditButtonClick = false;
        isSetEquipementAddNewButtonClick = false;
        equipementTableView.setItems(getDataAndAddToEquipementTable());
    }

}
