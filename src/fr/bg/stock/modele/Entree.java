/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.util.Collection;
import java.util.Objects;

/**
 *
 * @author lyess
 */
class Entree {
    
        private String idEntree;
        private int qteEntree;
        private Double prixEntree;
        private Article entreeArticle;
        
        
        public Collection <Entree> listeEntree;
        public Collection <Entree> listeEntreeAAjouter;
        public Collection <Entree> listeEntreeAModifier;
        public Collection <Entree> listeEntreeASupprimer;

    public Entree(int qteEntree, Double prixEntree, Article entreeArticle) {
       
        this.qteEntree = qteEntree;
        this.prixEntree = prixEntree;
        this.entreeArticle = entreeArticle;
    }

    public String getIdEntree() {
        return idEntree;
    }

    public void setIdEntree(String idEntree) {
        this.idEntree = idEntree;
    }

    public int getQteEntree() {
        return qteEntree;
    }

    public void setQteEntree(int qteEntree) {
        this.qteEntree = qteEntree;
    }

    public Double getPrixEntree() {
        return prixEntree;
    }

    public void setPrixEntree(Double prixEntree) {
        this.prixEntree = prixEntree;
    }

    public Article getEntreeArticle() {
        return entreeArticle;
    }

    public void setEntreeArticle(Article entreeArticle) {
        this.entreeArticle = entreeArticle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idEntree);
        hash = 97 * hash + this.qteEntree;
        hash = 97 * hash + Objects.hashCode(this.prixEntree);
        hash = 97 * hash + Objects.hashCode(this.entreeArticle);
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
        final Entree other = (Entree) obj;
        if (this.qteEntree != other.qteEntree) {
            return false;
        }
        if (!Objects.equals(this.idEntree, other.idEntree)) {
            return false;
        }
        if (!Objects.equals(this.prixEntree, other.prixEntree)) {
            return false;
        }
        if (!Objects.equals(this.entreeArticle, other.entreeArticle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entree{" + "idEntree=" + idEntree + ", qteEntree=" + qteEntree + ", prixEntree=" + prixEntree + ", entreeArticle=" + entreeArticle + '}';
    }
        
      
    

//Methode ajouter entree

public void ajouterEntree(int qteEntree, Double prixEntree, Article entreeArticle){
    
    Entree E = new Entree(qteEntree, prixEntree,entreeArticle);
    
    listeEntreeAAjouter.add(E);
    
    
}    

//Methode modifier entree


public void modifierEntree(int qteEntree, Double prixEntree, Article entreeArticle){
    
    this.qteEntree = qteEntree;
    this.prixEntree = prixEntree;
    this.entreeArticle = entreeArticle;
    
    listeEntreeAModifier.add(this);
    
}

//Methode supprimer entree

public void supprimerEntree(Entree E){
    
    listeEntreeASupprimer.add(E);
    
    
}

}
        
        

   
