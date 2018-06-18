/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.Parc;

import java.io.Serializable;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;

/**
 *
 * @author Ouadie
 */
@Entity
public class Type implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long referenceType;
    private String libelle;
    private HashMap<Caracteristique,String> listeCaracteristique;
    public Type() {
    }

    public Type(Long referenceType, String libelle, HashMap<Caracteristique, String> listeCaracteristique) {
        this.referenceType = referenceType;
        this.libelle = libelle;
        this.listeCaracteristique = listeCaracteristique;
    }

    
 
    public Long getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(Long referenceType) {
        this.referenceType = referenceType;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public HashMap<Caracteristique, String> getListeCaracteristique() {
        return listeCaracteristique;
    }

    public void setListeCaracteristique(HashMap<Caracteristique, String> listeCaracteristique) {
        this.listeCaracteristique = listeCaracteristique;
    }



    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (referenceType != null ? referenceType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Type)) {
            return false;
        }
        Type other = (Type) object;
        if ((this.referenceType == null && other.referenceType != null) || (this.referenceType != null && !this.referenceType.equals(other.referenceType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.bg.main.modele.plandetri.Type[ referenceType=" + referenceType + " ]";
    }
    
}
