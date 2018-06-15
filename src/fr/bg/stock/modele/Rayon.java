/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lyess
 */
@Entity
public class Rayon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    //liste des attribus
    
    private Long id;
    private String nomRayon;
    
    
    // liste des constructeur
    
    public Rayon(){
        
    }

    public Rayon(Long id) {
        this.id = id;
    }

    public Rayon(Long id, String nomRayon) {
        this.id = id;
        this.nomRayon = nomRayon;
    }

   // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        hash = 67 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.nomRayon, other.nomRayon)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rayon{" + "id=" + id + ", nomRayon=" + nomRayon + '}';
    }
    
    
    
}
