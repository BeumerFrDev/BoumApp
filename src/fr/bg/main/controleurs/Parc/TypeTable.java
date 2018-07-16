/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.controleurs.Parc;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.shape.Rectangle;
import javax.imageio.ImageIO;

/**
 *
 * @author Ouadie
 */
public class TypeTable {

    private final SimpleStringProperty typeTCClasse;
    private final SimpleIntegerProperty typeTCDDV;
    private final SimpleStringProperty typeCLibelle;
    private final SimpleStringProperty typeTCReference;

    private final ImageView typeTCImage;

    public TypeTable(String typeTCClasse, int typeTCDDV, String typeCLibelle, String typeTCReference, String typeTCImaged) {
        this.typeTCClasse = new SimpleStringProperty(typeTCClasse);
        this.typeTCDDV = new SimpleIntegerProperty(typeTCDDV);
        this.typeCLibelle = new SimpleStringProperty(typeCLibelle);
        this.typeTCReference = new SimpleStringProperty(typeTCReference);

        File file = new File(typeTCImaged);
        Image image = null ;
                            try {
            BufferedImage imgType = ImageIO.read(file);

             image = SwingFXUtils.toFXImage(imgType, null);
                            } catch (IOException e) {
                            }
        this.typeTCImage = new ImageView(image);
          Rectangle r = new Rectangle();

        r.setWidth(250);
        r.setHeight(40);
        r.setArcWidth(10);
        r.setArcHeight(10);
        this.typeTCImage .setClip(r);
        this.typeTCImage .setPreserveRatio(true);
        this.typeTCImage .setSmooth(true);
        this.typeTCImage .setCache(true);
    }



    public String getTypeTCClasse() {
        return typeTCClasse.get();
    }

    public void setEquipementTDID(String equipementTDID) {
        this.typeTCClasse.set(equipementTDID);
    }

    public Integer getTypeTCDDV() {
        return typeTCDDV.get();
    }


    public String getTypeCLibelle() {
        return typeCLibelle.get();
    }
    
    public void setEquipementTDLibelle(String libel) {
        typeCLibelle.set(libel);
    }

    public String getTypeTCReference() {
        return typeTCReference.get();
    }





    public ImageView getTypeTCImage() {
        return typeTCImage;
    }
 

 
}
