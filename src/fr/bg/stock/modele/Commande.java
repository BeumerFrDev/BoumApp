/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.util.Date;

/**
 *
 * @author lyess
 */
public class Commande {
    
    private final int numCommande;
    private final Date dateCommande;
    private final Etat etatCommande;

    public Commande(int numCommande, Date dateCommande, Etat etatCommande) {
        this.numCommande = numCommande;
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
    
    
    
    
    
    
}
