/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lyess
 */
public class Commande {
    
    private  int numCommande;
    private  Date dateCommande;
    private Etat etatCommande;
    
    public Collection<Commande> listeCommande;
    
    public Collection<Commande> listeCommandeAAjouter;
    public Collection<Commande> listeCommandeAModifier;
    public Collection<Commande> listeCommandeASupprimer;
    

    public Commande( Date dateCommande, Etat etatCommande) {
        
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
        
    }

    public int getNumCommande() {
        return numCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public Etat getEtatCommande() {
        return etatCommande;
    }

    public void setNumCommande(int numCommande) {
        this.numCommande = numCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setEtatCommande(Etat etatCommande) {
        this.etatCommande = etatCommande;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.numCommande;
        hash = 47 * hash + Objects.hashCode(this.dateCommande);
        hash = 47 * hash + Objects.hashCode(this.etatCommande);
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
        final Commande other = (Commande) obj;
        if (this.numCommande != other.numCommande) {
            return false;
        }
        if (!Objects.equals(this.dateCommande, other.dateCommande)) {
            return false;
        }
        return Objects.equals(this.etatCommande, other.etatCommande);
    }

    @Override
    public String toString() {
        return "Commande{" + "numCommande=" + numCommande + ", dateCommande=" + dateCommande + ", etatCommande=" + etatCommande + '}';
    }
    
    
    
    //Methode ajouter commande
    
    public Commande ajouterCommande(int numCommande, Date dateCommande, Etat etatCommande){
        
        Commande C = new Commande (dateCommande,etatCommande);
        return C;
        
    }
    
    //Methode modifier commande
    
    public void modifierCommande( Date dateCommande, Etat etatCommande){
        
        
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
              
    }
    
    
    
    // Methode supprimer Commande
    
    
}
