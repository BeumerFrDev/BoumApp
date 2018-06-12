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
public class LingneCommande {
    
    private final String index;
    private final String qteCommande;
    private final Double prix;
    private final Double montant;

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
    
    
    
    
    
    
}
