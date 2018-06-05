/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.controleurs;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.MenuItem;
import main.Launch;
import main.modele.Individus;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
/**
 *
 * @author Ouadie
 */
public class AdminViewController implements Initializable {
    
    private Individus loggedUser;
    
    //Notre variable d'application
    private Launch application;
  private Label success;
    @FXML   private  MenuButton menuButon; 
    @FXML private ImageView imageView;

        @FXML PieChart pieChart;
    @FXML private HBox GrandFenetreHbox;
    @FXML Tab reporting;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public void setApp(Launch application) throws FileNotFoundException{
        this.application = application;
        loggedUser = application.getLoggedUser();
        System.out.println(loggedUser.getNomIndividu()+"test5logguedUserAdminViewsetApp");
       menuButon.getItems().add(0,new MenuItem(loggedUser.getNomIndividu()+" "+loggedUser.getPrenomIndividu()));
       affichePhotoLoggedUser();   
 
        
     
      
    }
        private void affichePhotoLoggedUser() throws FileNotFoundException
    {Image image=null;
        Exception exception = null;
        try{
             image = new Image(getClass().getResource(loggedUser.getPhotoIndividu()).toString()) ;
        }catch(Exception e){
            
        }
        if(loggedUser.getPhotoIndividu()==null ||loggedUser.getPhotoIndividu()==""){
            image = new Image(getClass().getResource("..\\assets\\image\\admin.png").toString());
        }
             imageView.setImage(image);
  
         imageView.setFitWidth(45);
         imageView.setFitHeight(45);
         Circle circle = new Circle();
        
        circle.setRadius(20.0f);
        circle.setCenterX(40.0f/2);
        circle.setCenterY(40.0f/2);
       imageView.setClip(circle);
         imageView.setPreserveRatio(true);
         imageView.setSmooth(true);
         imageView.setCache(true);
    }

}
