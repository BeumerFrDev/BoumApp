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
public class Rayon {
    
    private String idRayon;
    private String nomRayon;
    
    public Collection<Rayon> listeRayon;
    
    public Collection<Rayon> listeRayonAAjouter;
    public Collection<Rayon> listeRayonAModifier;
    public Collection<Rayon> listeRayonASupprimer;
     
    
    
    
    
    

    public Rayon( String nomRayon) {
        
        this.nomRayon = nomRayon;
    }

    public String getIdRayon() {
        return idRayon;
    }

    public void setIdRayon(String idRayon) {
        this.idRayon = idRayon;
    }

    public String getNomRayon() {
        return nomRayon;
    }

    public void setNomRayon(String nomRayon) {
        this.nomRayon = nomRayon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idRayon);
        hash = 67 * hash + Objects.hashCode(this.nomRayon);
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
        final Rayon other = (Rayon) obj;
        if (!Objects.equals(this.idRayon, other.idRayon)) {
            return false;
        }
        return Objects.equals(this.nomRayon, other.nomRayon);
    }

    @Override
    public String toString() {
        return "Rayon{" + "idRayon=" + idRayon + ", nomRayon=" + nomRayon + '}';
    }
    
    
    //Methode ajouter Rayon
    
    public Rayon ajouterRayon( String nomRayon){
        
        Rayon R = new Rayon( nomRayon);
        
        return R; 
        
    }
    
    //Methode modifier Rayon
    
    public void modifierRayon( String nomRayon){
        
        this.nomRayon = nomRayon;
        
    }
    
    
    
}
