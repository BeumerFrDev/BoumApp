/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.util.Collection;
import java.util.Objects;
import java.lang.String;

/**
 *
 * @author lyess
 */
public class LigneCommande {
    
    private String index;
    private String qteCommande;
    private Double prix;
    private Double montant;
    private Commande commandeLigneCommande;
    private Fournisseur fournisseurLigneCommande;
    
    
    public Collection<LigneCommande> listeLigneCommande;
    
    public Collection<LigneCommande> listeLigneCommandeAAjouter;
    public Collection<LigneCommande> listeLigneCommandeAModifier;
    public Collection<LigneCommande> listeLigneCommandeASupprimer;
    
    

    public LigneCommande( String qteCommande, Double prix, Double montant, Commande commandeLigneCommande,
            Fournisseur fournisseurLigneCommande) {
        
        this.qteCommande = qteCommande;
        this.prix = prix;
        this.montant = montant;
        this.commandeLigneCommande = commandeLigneCommande;
        this.fournisseurLigneCommande = fournisseurLigneCommande;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(String qteCommande) {
        this.qteCommande = qteCommande;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Commande getCommandeLigneCommande() {
        return commandeLigneCommande;
    }

    public void setCommandeLigneCommande(Commande commandeLigneCommande) {
        this.commandeLigneCommande = commandeLigneCommande;
    }

    public Fournisseur getFournisseurLigneCommande() {
        return fournisseurLigneCommande;
    }

    public void setFournisseurLigneCommande(Fournisseur fournisseurLigneCommande) {
        this.fournisseurLigneCommande = fournisseurLigneCommande;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.index);
        hash = 97 * hash + Objects.hashCode(this.qteCommande);
        hash = 97 * hash + Objects.hashCode(this.prix);
        hash = 97 * hash + Objects.hashCode(this.montant);
        hash = 97 * hash + Objects.hashCode(this.commandeLigneCommande);
        hash = 97 * hash + Objects.hashCode(this.fournisseurLigneCommande);
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
        final LigneCommande other = (LigneCommande) obj;
        if (!Objects.equals(this.index, other.index)) {
            return false;
        }
        if (!Objects.equals(this.qteCommande, other.qteCommande)) {
            return false;
        }
        if (!Objects.equals(this.prix, other.prix)) {
            return false;
        }
        if (!Objects.equals(this.montant, other.montant)) {
            return false;
        }
        if (!Objects.equals(this.commandeLigneCommande, other.commandeLigneCommande)) {
            return false;
        }
        if (!Objects.equals(this.fournisseurLigneCommande, other.fournisseurLigneCommande)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LigneCommande{" + "index=" + index + ", qteCommande=" + qteCommande + ", prix=" + prix + ", montant=" + montant + ", commandeLigneCommande=" + commandeLigneCommande + ", fournisseurLigneCommande=" + fournisseurLigneCommande + '}';
    }
    
    
   
    
    //Methode ajouter ligne de commande
    
    public LigneCommande ajouterLigneCommande(String qteCommande, Double prix, Double montant, Commande commandeLigneCommande,
            Fournisseur fournisseurLigneCommande){
        
        LigneCommande LC = new LigneCommande(qteCommande, prix, montant, commandeLigneCommande,
             fournisseurLigneCommande);
        
        return LC;
        
        
    }
    
    //Methode modifier ligne de commande
    
    public void modifierLigneCommande(String qteCommande, Double prix, Double montant, Commande commandeLigneCommande,
            Fournisseur fournisseurLigneCommande){
        
        this.qteCommande = qteCommande;
        this.prix = prix;
        this.montant= montant;
        this.commandeLigneCommande = commandeLigneCommande;
        this.fournisseurLigneCommande = fournisseurLigneCommande;
      
    }
 

    //Methode supprimer ligne de commande
    
    public void supprimerLigneCommande(LigneCommande LC){
        
        
        
    }
   
    
    
    
}
