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
public class Sortie {
    
    private String idSortie;
    private int qteSortie;
    private Date dateSortie;
    private Article sortieArticle;
    
    
    public Collection<Sortie> listeSortie;
    
    public Collection<Sortie> listeSortieAAjouter;
    public Collection<Sortie> listeSortieAModifier;
    public Collection<Sortie> listeSortieASupprimer;

    public Sortie( int qteSortie, Date dateSortie, Article sortieArticle) {
        
        this.qteSortie = qteSortie;
        this.dateSortie = dateSortie;
        this.sortieArticle = sortieArticle;
    }

    public String getIdSortie() {
        return idSortie;
    }

    public void setIdSortie(String idSortie) {
        this.idSortie = idSortie;
    }

    public int getQteSortie() {
        return qteSortie;
    }

    public void setQteSortie(int qteSortie) {
        this.qteSortie = qteSortie;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Article getSortieArticle() {
        return sortieArticle;
    }

    public void setSortieArticle(Article sortieArticle) {
        this.sortieArticle = sortieArticle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idSortie);
        hash = 53 * hash + this.qteSortie;
        hash = 53 * hash + Objects.hashCode(this.dateSortie);
        hash = 53 * hash + Objects.hashCode(this.sortieArticle);
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
        final Sortie other = (Sortie) obj;
        if (this.qteSortie != other.qteSortie) {
            return false;
        }
        if (!Objects.equals(this.idSortie, other.idSortie)) {
            return false;
        }
        if (!Objects.equals(this.dateSortie, other.dateSortie)) {
            return false;
        }
        if (!Objects.equals(this.sortieArticle, other.sortieArticle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sortie{" + "idSortie=" + idSortie + ", qteSortie=" + qteSortie + ", dateSortie=" + dateSortie + ", sortieArticle=" + sortieArticle + '}';
    }
    
    
    //Methode ajouter sortie
    
    public Sortie ajouterSortie(int qteSortie, Date dateSortie, Article sortieArticle){
        
        Sortie S = new Sortie( qteSortie, dateSortie, sortieArticle);
        return S;
        
    }
    

    
    //Methode modifier sortie
    
    public void modifierSortie(int qteSortie, Date dateSortie, Article sortieArticle){
        
        this.qteSortie = qteSortie;
        this.dateSortie = dateSortie;
        this.sortieArticle = sortieArticle;
         
    }
    
    //Methode supprimer sortie
    
    public void supprimerSortie(Sortie s){
        
        
    }
    
}
