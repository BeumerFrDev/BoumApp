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
public class Reception {
    
   private int numReception;
   private Date dateReception;
   private int qteLivree;
   
   
   public Collection<Reception> listeReception;
   
   public Collection<Reception> listeReceptionAAjouter;
   public Collection<Reception> listeReceptionAModifier;
   public Collection<Reception> listeReceptionASupprimer;
    

    public Reception( Date dateReception, int qteLivree) {
        
        this.dateReception = dateReception;
        this.qteLivree = qteLivree;
    }

    public int getNumReception() {
        return numReception;
    }

    public void setNumReception(int numReception) {
        this.numReception = numReception;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public int getQteLivree() {
        return qteLivree;
    }

    public void setQteLivree(int qteLivree) {
        this.qteLivree = qteLivree;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.numReception;
        hash = 53 * hash + Objects.hashCode(this.dateReception);
        hash = 53 * hash + this.qteLivree;
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
        final Reception other = (Reception) obj;
        if (this.numReception != other.numReception) {
            return false;
        }
        if (this.qteLivree != other.qteLivree) {
            return false;
        }
        return Objects.equals(this.dateReception, other.dateReception);
    }

    @Override
    public String toString() {
        return "Reception{" + "numReception=" + numReception + ", dateReception=" + dateReception + ", qteLivree=" + qteLivree + '}';
    }
   
   
   
    
    //Methode ajouter Reception
    
    public void ajouterreception(Date dateReception, int qteLivree){
        
        Reception R = new Reception( dateReception, qteLivree);
        
        listeReceptionAAjouter.add(R);
        
    }
    
    
    //Methode modifier Reception
    
    public void modifierReception(Date dateReception, int qteLivree){
        
        this.dateReception = dateReception;
        this.qteLivree = qteLivree;
        
        listeReceptionAModifier.add(this);
        
    }
   
    // Methode supprimer Reception
    
    
    public void supprimerReception(Reception R){
        
        listeReceptionASupprimer.add(R);
        
        
        
    }
}
