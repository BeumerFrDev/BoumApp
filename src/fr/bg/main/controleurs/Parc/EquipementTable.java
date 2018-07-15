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
public class EquipementTable {

    private final SimpleStringProperty equipementTDID;
    private final SimpleIntegerProperty equipementTDNumero;
    private final SimpleStringProperty equipementTDLibelle;
    private final SimpleStringProperty equipementTDReference;
    private final SimpleIntegerProperty equipementTDDDV;
    private final SimpleStringProperty equipementTDDateDeMiseEnPlace;
    private final ImageView equipementTDImage;

    public EquipementTable(String equipementTDID, int equipementTDNumero, String equipementTDLibelle, String equipementTDReference, int equipementTDDDV, String equipementTDDateDeMiseEnPlace, String equipementTDImage) {
        this.equipementTDID = new SimpleStringProperty(equipementTDID);
        this.equipementTDNumero = new SimpleIntegerProperty(equipementTDNumero);
        this.equipementTDLibelle = new SimpleStringProperty(equipementTDLibelle);
        this.equipementTDReference = new SimpleStringProperty(equipementTDReference);
        this.equipementTDDDV = new SimpleIntegerProperty(equipementTDDDV);
        this.equipementTDDateDeMiseEnPlace = new SimpleStringProperty(equipementTDDateDeMiseEnPlace);
        
        File file = new File(equipementTDImage);
        Image image = null ;
                            try {
            BufferedImage imgType = ImageIO.read(file);

             image = SwingFXUtils.toFXImage(imgType, null);
                            } catch (IOException e) {
                            }
        this.equipementTDImage = new ImageView(image);
          Rectangle r = new Rectangle();

      
    }

    public String getEquipementTDID() {
        return equipementTDID.get();
    }

    public void setEquipementTDID(String equipementTDID) {
        this.equipementTDID.set(equipementTDID);
    }

    public Integer getEquipementTDNumero() {
        return equipementTDNumero.get();
    }

    public void setEquipementTDNumero(int num) {
        equipementTDNumero.set(num);
    }

    public String getEquipementTDLibelle() {
        return equipementTDLibelle.get();
    }
    
    public void setEquipementTDLibelle(String libel) {
        equipementTDLibelle.set(libel);
    }

    public String getEquipementTDReference() {
        return equipementTDReference.get();
    }
    
    public void setEquipementTDReference(String ref) {
         equipementTDReference.set(ref);
    }

    public Integer getEquipementTDDDV() {
        return equipementTDDDV.get();
    }
    
    public void setEquipementTDDDV(int ddv) {
         equipementTDDDV.set(ddv);
    }

    public String getEquipementTDDateDeMiseEnPlace() {
        return equipementTDDateDeMiseEnPlace.get();
    }
    
     public void setEquipementTDDateDeMiseEnPlace(String date) {
         equipementTDDateDeMiseEnPlace.set(date);
    }

    public ImageView getEquipementTDImage() {
        return equipementTDImage;
    }
 

 
}
