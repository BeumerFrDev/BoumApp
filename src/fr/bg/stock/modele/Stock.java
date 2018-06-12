/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import fr.bg.main.modele.plandetri.Type;
import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.typeArticle);
        hash = 13 * hash + Arrays.deepHashCode(this.listeEntree);
        hash = 13 * hash + Arrays.deepHashCode(this.listeSortie);
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
        if (!Arrays.deepEquals(this.listeEntree, other.listeEntree)) {
            return false;
        }
        if (!Arrays.deepEquals(this.listeSortie, other.listeSortie)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stock{" + "typeArticle=" + typeArticle + ", listeEntree=" + listeEntree + ", listeSortie=" + listeSortie + '}';
    }
    
    
    
    
   
   
    
}
