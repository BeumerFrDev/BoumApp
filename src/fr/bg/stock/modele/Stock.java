/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import fr.bg.main.modele.plandetri.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 *
 * @author lyess
 */
public class Stock {
    
   private Type typeArticle;
   private Collection<Entree> listeEntree;
   private Collection<Sortie> listeSortie;
   
   
   
   
   public Collection<Stock> listeStock;
   
   public Collection<Stock> listeStockAAjouter;
   public Collection<Stock> listeStockAModifier;
   public Collection<Stock> listeStockASupprimer;

    public Stock(Type typeArticle, Collection<Entree> listeEntree, Collection<Sortie> listeSortie) {
        this.typeArticle = typeArticle;
        this.listeEntree = listeEntree;
        this.listeSortie = listeSortie;
    }

    public Type getTypeArticle() {
        return typeArticle;
    }

    public void setTypeArticle(Type typeArticle) {
        this.typeArticle = typeArticle;
    }

    public Collection<Entree> getListeEntree() {
        return listeEntree;
    }

    public void setListeEntree(Collection<Entree> listeEntree) {
        this.listeEntree = listeEntree;
    }

    public Collection<Sortie> getListeSortie() {
        return listeSortie;
    }

    public void setListeSortie(Collection<Sortie> listeSortie) {
        this.listeSortie = listeSortie;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.typeArticle);
        hash = 67 * hash + Objects.hashCode(this.listeEntree);
        hash = 67 * hash + Objects.hashCode(this.listeSortie);
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
        final Stock other = (Stock) obj;
        if (!Objects.equals(this.typeArticle, other.typeArticle)) {
            return false;
        }
        if (!Objects.equals(this.listeEntree, other.listeEntree)) {
            return false;
        }
        return Objects.equals(this.listeSortie, other.listeSortie);
    }

    @Override
    public String toString() {
        return "Stock{" + "typeArticle=" + typeArticle + ", listeEntree=" + listeEntree + ", listeSortie=" + listeSortie + '}';
    }

   

   
    
    
    
    
   
   
    
}
