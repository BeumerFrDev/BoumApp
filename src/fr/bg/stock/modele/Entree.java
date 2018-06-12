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
        
        public Collection <Entree> listeEntree;
        public Collection <Entree> listeEntreeAAjouter;
        public Collection <Entree> listeEntreeAModifier;
        public Collection <Entree> listeEntreeASupprimer;
        
        

    public Entree(int qteEntree, Double prixEntree) {
     
        this.qteEntree = qteEntree;
        this.prixEntree = prixEntree;
    }

    public String getIdEntree() {
        return idEntree;
    }

    public int getQteEntree() {
        return qteEntree;
    }

    public Double getPrixEntree() {
        return prixEntree;
    }

    public void setIdEntree(String idEntree) {
        this.idEntree = idEntree;
    }

    public void setQteEntree(int qteEntree) {
        this.qteEntree = qteEntree;
    }

    public void setPrixEntree(Double prixEntree) {
        this.prixEntree = prixEntree;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idEntree);
        hash = 71 * hash + this.qteEntree;
        hash = 71 * hash + Objects.hashCode(this.prixEntree);
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
        return true;
    }

    @Override
    public String toString() {
        return "Entree{" + "idEntree=" + idEntree + ", qteEntree=" + qteEntree + ", prixEntree=" + prixEntree + '}';
    }
    
    
     // Methode ajouter entrer
    
    public  Entree ajouterEntree(int qteEntree, Double prixEntree){
        
        Entree E = new Entree(qteEntree,prixEntree);
        return E;
           
    }
    
    //Methode modifier entree
    
    public void modifierEntree(int qteEntree, Double prixEntree){
        
       
        this.qteEntree = qteEntree;
        this.prixEntree = prixEntree;
    
}
        

    
}
