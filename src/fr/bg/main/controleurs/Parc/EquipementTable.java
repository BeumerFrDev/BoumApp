/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.controleurs.Parc;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

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
    private final SimpleStringProperty equipementTDImage;

    public EquipementTable(String equipementTDID, int equipementTDNumero, String equipementTDLibelle, String equipementTDReference, int equipementTDDDV, String equipementTDDateDeMiseEnPlace, String equipementTDImage) {
        this.equipementTDID = new SimpleStringProperty(equipementTDID);
        this.equipementTDNumero = new SimpleIntegerProperty(equipementTDNumero);
        this.equipementTDLibelle = new SimpleStringProperty(equipementTDLibelle);
        this.equipementTDReference = new SimpleStringProperty(equipementTDReference);
        this.equipementTDDDV = new SimpleIntegerProperty(equipementTDDDV);
        this.equipementTDDateDeMiseEnPlace = new SimpleStringProperty(equipementTDDateDeMiseEnPlace);
        this.equipementTDImage = new SimpleStringProperty(equipementTDImage);
    }

    public SimpleStringProperty getEquipementTDID() {
        return equipementTDID;
    }

    public void setEquipementTDID(String equipementTDID) {
        this.equipementTDID.set(equipementTDID);
    }

    public SimpleIntegerProperty getEquipementTDNumero() {
        return equipementTDNumero;
    }

    public void setEquipementTDNumero(int num) {
        equipementTDNumero.set(num);
    }

    public SimpleStringProperty getEquipementTDLibelle() {
        return equipementTDLibelle;
    }
    
    public void setEquipementTDLibelle(String libel) {
        equipementTDLibelle.set(libel);
    }

    public SimpleStringProperty getEquipementTDReference() {
        return equipementTDReference;
    }
    
    public void setEquipementTDReference(String ref) {
         equipementTDReference.set(ref);
    }

    public SimpleIntegerProperty getEquipementTDDDV() {
        return equipementTDDDV;
    }
    
    public void setEquipementTDDDV(int ddv) {
         equipementTDDDV.set(ddv);
    }

    public SimpleStringProperty getEquipementTDDateDeMiseEnPlace() {
        return equipementTDDateDeMiseEnPlace;
    }
    
     public void setEquipementTDDateDeMiseEnPlace(String date) {
         equipementTDDateDeMiseEnPlace.set(date);
    }

    public SimpleStringProperty getEquipementTDImage() {
        return equipementTDImage;
    }
    
     public void setEquipementTDImage(String image) {
         equipementTDImage.set(image);
    }

}
