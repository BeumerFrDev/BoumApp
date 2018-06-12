/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.util.Objects;

/**
 *
 * @author lyess
 */
public class Fournisseur {
    
 private String idFournisseur;
 private String nomFournisseur;
 private String adresseFournisseur;
 private String codePFournisseur;
 private String villeFournisseur;
 private String payeFournisseur;
 private String telFournisseur;
 private String faxeFournisseur;
 private String emailFournisseur;

    public Fournisseur(String idFournisseur, String nomFournisseur, String adresseFournisseur, String codePFournisseur, String villeFournisseur, String payeFournisseur, String telFournisseur, String faxeFournisseur, String emailFournisseur) {
        this.idFournisseur = idFournisseur;
        this.nomFournisseur = nomFournisseur;
        this.adresseFournisseur = adresseFournisseur;
        this.codePFournisseur = codePFournisseur;
        this.villeFournisseur = villeFournisseur;
        this.payeFournisseur = payeFournisseur;
        this.telFournisseur = telFournisseur;
        this.faxeFournisseur = faxeFournisseur;
        this.emailFournisseur = emailFournisseur;
    }

    public String getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(String idFournisseur) {
        this.idFournisseur = idFournisseur;
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

    public String getCodePFournisseur() {
        return codePFournisseur;
    }

    public void setCodePFournisseur(String codePFournisseur) {
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

    public String getFaxeFournisseur() {
        return faxeFournisseur;
    }

    public void setFaxeFournisseur(String faxeFournisseur) {
        this.faxeFournisseur = faxeFournisseur;
    }

    public String getEmailFournisseur() {
        return emailFournisseur;
    }

    public void setEmailFournisseur(String emailFournisseur) {
        this.emailFournisseur = emailFournisseur;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idFournisseur);
        hash = 97 * hash + Objects.hashCode(this.nomFournisseur);
        hash = 97 * hash + Objects.hashCode(this.adresseFournisseur);
        hash = 97 * hash + Objects.hashCode(this.codePFournisseur);
        hash = 97 * hash + Objects.hashCode(this.villeFournisseur);
        hash = 97 * hash + Objects.hashCode(this.payeFournisseur);
        hash = 97 * hash + Objects.hashCode(this.telFournisseur);
        hash = 97 * hash + Objects.hashCode(this.faxeFournisseur);
        hash = 97 * hash + Objects.hashCode(this.emailFournisseur);
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
        if (!Objects.equals(this.idFournisseur, other.idFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.nomFournisseur, other.nomFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.adresseFournisseur, other.adresseFournisseur)) {
            return false;
        }
        if (!Objects.equals(this.codePFournisseur, other.codePFournisseur)) {
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
        if (!Objects.equals(this.faxeFournisseur, other.faxeFournisseur)) {
            return false;
        }
        return Objects.equals(this.emailFournisseur, other.emailFournisseur);
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "idFournisseur=" + idFournisseur + ", nomFournisseur=" + nomFournisseur + ", adresseFournisseur=" + adresseFournisseur + ", codePFournisseur=" + codePFournisseur + ", villeFournisseur=" + villeFournisseur + ", payeFournisseur=" + payeFournisseur + ", telFournisseur=" + telFournisseur + ", faxeFournisseur=" + faxeFournisseur + ", emailFournisseur=" + emailFournisseur + '}';
    }
 
 
 
 
 
 
 
}
