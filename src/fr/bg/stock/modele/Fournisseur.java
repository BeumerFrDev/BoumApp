/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

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
 
 
 
 
 
 
 
}
