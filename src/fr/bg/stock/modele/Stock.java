/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import fr.bg.main.modele.plandetri.Type;

/**
 *
 * @author lyess
 */
public class Stock {
    
   private Type typeArticle;
   private Entree listeEntree[];
   private Sortie listeSortie[];

    public Stock(Type typeArticle, Entree[] listeEntree, Sortie[] listeSortie) {
        this.typeArticle = typeArticle;
        this.listeEntree = listeEntree;
        this.listeSortie = listeSortie;
    }

    public Type getTypeArticle() {
        return typeArticle;
    }

    public Entree[] getListeEntree() {
        return listeEntree;
    }

    public Sortie[] getListeSortie() {
        return listeSortie;
    }

    public void setTypeArticle(Type typeArticle) {
        this.typeArticle = typeArticle;
    }

    public void setListeEntree(Entree[] listeEntree) {
        this.listeEntree = listeEntree;
    }

    public void setListeSortie(Sortie[] listeSortie) {
        this.listeSortie = listeSortie;
    }
    
    
   
   
    
}
