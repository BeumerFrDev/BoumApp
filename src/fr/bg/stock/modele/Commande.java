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
    private Reception receptionCommande;
    
    public Collection<Commande> listeCommande;
    
    public Collection<Commande> listeCommandeAAjouter;
    public Collection<Commande> listeCommandeAModifier;
    public Collection<Commande> listeCommandeASupprimer;

    public Commande( Date dateCommande, Etat etatCommande, Reception receptionCommande) {
       
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
        this.receptionCommande = receptionCommande;
        
       
    }

    public int getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(int numCommande) {
        this.numCommande = numCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Etat getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(Etat etatCommande) {
        this.etatCommande = etatCommande;
    }

    public Reception getReceptionCommande() {
        return receptionCommande;
    }

    public void setReceptionCommande(Reception receptionCommande) {
        this.receptionCommande = receptionCommande;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.numCommande;
        hash = 67 * hash + Objects.hashCode(this.dateCommande);
        hash = 67 * hash + Objects.hashCode(this.etatCommande);
        hash = 67 * hash + Objects.hashCode(this.receptionCommande);
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
        if (!Objects.equals(this.etatCommande, other.etatCommande)) {
            return false;
        }
        if (!Objects.equals(this.receptionCommande, other.receptionCommande)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commande{" + "numCommande=" + numCommande + ", dateCommande=" + dateCommande + ", etatCommande=" + etatCommande + ", receptionCommande=" + receptionCommande + '}';
    }
    
   
    //Methode ajouter une commande
    
    
    public void ajouterCommande(Date dateCommande, Etat etatCommande, Reception receptionCommande){
     
        Commande C = new Commande(dateCommande,etatCommande,receptionCommande);
        
        listeCommandeAAjouter.add(C);
    }
    
    //Methode modifier Commande
    
    public void modifierCommande(Date dateCommande, Etat etatCommande, Reception receptionCommande){
        
        this.dateCommande= dateCommande;
        this.etatCommande= etatCommande;
        this.receptionCommande = receptionCommande;
        
        listeCommandeAModifier.add(this);
        
        
    }
    
    //Methode supprimer commande
    
    public void supprimerCommande(Commande c){
        
        listeCommandeASupprimer.add(c);
        
        
    }

   
    }
    
    
