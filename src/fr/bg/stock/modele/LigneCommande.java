/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author lyess
 */
@Entity
public class LigneCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    //liste des attribus
    
    
    private Long id;
    @OneToOne
    private Article articleLigneCommande;
    private int qteCommande;
    private double prixU;
    private double montant;
    @OneToOne
    private Commande commandeLigneCommande;
    @OneToOne
    private Fournisseur fournisseur;
    
    
    public static Collection<LigneCommande> listeLigneCommande;
    
    public static Collection<LigneCommande> ligneCommandeAAjouter;
    public static Collection<LigneCommande> ligneCommandeAModifier;
    public static Collection<LigneCommande> ligneCommandeASupprimer;
    
    
    //liste des constructeurs
    
    public LigneCommande(){
        
    }

    public LigneCommande(Long id) {
        this.id = id;
    }

    public LigneCommande(Long id, Article articleLigneCommande, int qteCommande, double prixU, double montant,
            Commande commandeLigneCommande, Fournisseur fournisseur) {
        this.id = id;
        this.articleLigneCommande = articleLigneCommande;
        this.qteCommande = qteCommande;
        this.prixU = prixU;
        this.montant = montant;
        this.commandeLigneCommande = commandeLigneCommande;
        this.fournisseur = fournisseur;
    }
    
    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticleLigneCommande() {
        return articleLigneCommande;
    }

    public void setArticleLigneCommande(Article articleLigneCommande) {
        this.articleLigneCommande = articleLigneCommande;
    }

    public int getQteCommande() {
        return qteCommande;
    }

    public void setQteCommande(int qteCommande) {
        this.qteCommande = qteCommande;
    }

    public double getPrixU() {
        return prixU;
    }

    public void setPrixU(double prixU) {
        this.prixU = prixU;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Commande getCommandeLigneCommande() {
        return commandeLigneCommande;
    }

    public void setCommandeLigneCommande(Commande commandeLigneCommande) {
        this.commandeLigneCommande = commandeLigneCommande;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.articleLigneCommande);
        hash = 19 * hash + this.qteCommande;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.prixU) ^ (Double.doubleToLongBits(this.prixU) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.montant) ^ (Double.doubleToLongBits(this.montant) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.commandeLigneCommande);
        hash = 19 * hash + Objects.hashCode(this.fournisseur);
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
        if (this.qteCommande != other.qteCommande) {
            return false;
        }
        if (Double.doubleToLongBits(this.prixU) != Double.doubleToLongBits(other.prixU)) {
            return false;
        }
        if (Double.doubleToLongBits(this.montant) != Double.doubleToLongBits(other.montant)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.articleLigneCommande, other.articleLigneCommande)) {
            return false;
        }
        if (!Objects.equals(this.commandeLigneCommande, other.commandeLigneCommande)) {
            return false;
        }
        if (!Objects.equals(this.fournisseur, other.fournisseur)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LigneCommande{" + "id=" + id + ", articleLigneCommande=" + articleLigneCommande + ", qteCommande=" + qteCommande + 
                ", prixU=" + prixU + ", montant=" + montant + ", commandeLigneCommande=" + commandeLigneCommande + ", fournisseur=" + fournisseur + '}';
    }
    
    
    

   
    
}
