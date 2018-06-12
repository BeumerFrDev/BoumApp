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
public class LingneCommande {
    
    private String index;
    private String qteCommande;
    private Double prix;
    private Double montant;

    public LingneCommande(String index, String qteCommande, Double prix, Double montant) {
        this.index = index;
        this.qteCommande = qteCommande;
        this.prix = prix;
        this.montant = montant;
        
    }

    public String getIndex() {
        return index;
    }

    public String getQteCommande() {
        return qteCommande;
    }

    public Double getPrix() {
        return prix;
    }

    public Double getMontant() {
        return montant;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setQteCommande(String qteCommande) {
        this.qteCommande = qteCommande;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.index);
        hash = 97 * hash + Objects.hashCode(this.qteCommande);
        hash = 97 * hash + Objects.hashCode(this.prix);
        hash = 97 * hash + Objects.hashCode(this.montant);
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
        final LingneCommande other = (LingneCommande) obj;
        if (!Objects.equals(this.index, other.index)) {
            return false;
        }
        if (!Objects.equals(this.qteCommande, other.qteCommande)) {
            return false;
        }
        if (!Objects.equals(this.prix, other.prix)) {
            return false;
        }
        return Objects.equals(this.montant, other.montant);
    }

    @Override
    public String toString() {
        return "LingneCommande{" + "index=" + index + ", qteCommande=" + qteCommande + ", prix=" + prix + ", montant=" + montant + '}';
    }
    
    
    
    
    
    
}
