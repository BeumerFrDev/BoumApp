/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lyess
 */


@Entity
public class Fournisseur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    // Liste des attribus
    
    private Long id;
    private String nomFournisseur;
    private String adresseFournisseur;
    private int codePFournisseur;
    private String villeFournisseur;
    private String payeFournisseur;
    private String telFournisseur;
    private String emailFournisseur;
    private String faxFournisseur;
    private String imageFournisseur;

   
    
   

   
    // liste des constructeurs
    
    public Fournisseur() {
    }
    
    public Fournisseur(Long id) {
        this.id = id;
    }

    
    
    public Fournisseur(String nomFournisseur, String payeFournisseur, String telFournisseur, String emailFournisseur) {
        this.nomFournisseur = nomFournisseur;
        this.payeFournisseur = payeFournisseur;
        this.telFournisseur = telFournisseur;
        this.emailFournisseur = emailFournisseur;
    }

    public Fournisseur(Long id, String nomFournisseur, String adresseFournisseur, int codePFournisseur, String villeFournisseur, 
            String payeFournisseur, String telFournisseur, String emailFournisseur, String faxFournisseur, String imageFournisseur) {
        this.id = id;
        this.nomFournisseur = nomFournisseur;
        this.adresseFournisseur = adresseFournisseur;
        this.codePFournisseur = codePFournisseur;
        this.villeFournisseur = villeFournisseur;
        this.payeFournisseur = payeFournisseur;
        this.telFournisseur = telFournisseur;
        this.emailFournisseur = emailFournisseur;
        this.faxFournisseur = faxFournisseur;
        this.imageFournisseur = imageFournisseur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public String getAdresseFournisseur() {
        return adresseFournisseur;
    }

    public void setAdresseFournisseur(String adresseFournisseur) {
        this.adresseFournisseur = adresseFournisseur;
    }

    public int getCodePFournisseur() {
        return codePFournisseur;
    }

    public void setCodePFournisseur(int codePFournisseur) {
        this.codePFournisseur = codePFournisseur;
    }

    public String getVilleFournisseur() {
        return villeFournisseur;
    }

    public void setVilleFournisseur(String villeFournisseur) {
        this.villeFournisseur = villeFournisseur;
    }

    public String getPayeFournisseur() {
        return payeFournisseur;
    }

    public void setPayeFournisseur(String payeFournisseur) {
        this.payeFournisseur = payeFournisseur;
    }

    public String getTelFournisseur() {
        return telFournisseur;
    }

    public void setTelFournisseur(String telFournisseur) {
        this.telFournisseur = telFournisseur;
    }

    public String getEmailFournisseur() {
        return emailFournisseur;
    }

    public void setEmailFournisseur(String emailFournisseur) {
        this.emailFournisseur = emailFournisseur;
    }

    public String getFaxFournisseur() {
        return faxFournisseur;
    }

    public void setFaxFournisseur(String faxFournisseur) {
        this.faxFournisseur = faxFournisseur;
    }

    public String getImageFournisseur() {
        return imageFournisseur;
    }

    public void setImageFournisseur(String imageFournisseur) {
        this.imageFournisseur = imageFournisseur;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.nomFournisseur);
        hash = 29 * hash + Objects.hashCode(this.adresseFournisseur);
        hash = 29 * hash + this.codePFournisseur;
        hash = 29 * hash + Objects.hashCode(this.villeFournisseur);
        hash = 29 * hash + Objects.hashCode(this.payeFournisseur);
        hash = 29 * hash + Objects.hashCode(this.telFournisseur);
        hash = 29 * hash + Objects.hashCode(this.emailFournisseur);
        hash = 29 * hash + Objects.hashCode(this.faxFournisseur);
        hash = 29 * hash + Objects.hashCode(this.imageFournisseur);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fournisseur other = (Fournisseur) obj;
        if (this.codePFournisseur != other.codePFournisseur) {
            return false;
        }
        if (!Objects.equals(this.nomFournisseur, other.nomFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.adresseFournisseur, other.adresseFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.villeFournisseur, other.villeFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.payeFournisseur, other.payeFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.telFournisseur, other.telFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.emailFournisseur, other.emailFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.faxFournisseur, other.faxFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.imageFournisseur, other.imageFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "id=" + id + ", nomFournisseur=" + nomFournisseur + ", adresseFournisseur=" + adresseFournisseur +
                ", codePFournisseur=" + codePFournisseur + ", villeFournisseur=" + villeFournisseur + ", payeFournisseur=" + payeFournisseur + 
                ", telFournisseur=" + telFournisseur + ", emailFournisseur=" + emailFournisseur + ", faxFournisseur=" + faxFournisseur + ", imageFournisseur=" + imageFournisseur + '}';
    }
    
    
    
   
    
    
    
}
