/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.stock;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;

/**
 *
 * @author lyess
 */
@Entity
public class Reception implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = AUTO)
    
    //liste des attribus
    
    private Long id;
    @Temporal(DATE)
    private Date dateReception;
    private int qteLivree;
    
    public static final ListeStock<Reception> listeReception = new ListeStock<Reception>(); 
   
    {
         this.listeReception.add(this);
    }
    
    // les constructeurs
    
    public Reception(){
        
    }

    public Reception(Long id) {
        this.id = id;
    }

    public Reception(Long id, Date dateReception, int qteLivree) {
        this.id = id;
        this.dateReception = dateReception;
        this.qteLivree = qteLivree;
    }

    // getters ans setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.dateReception);
        hash = 41 * hash + this.qteLivree;
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
        if (this.qteLivree != other.qteLivree) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateReception, other.dateReception)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reception{" + "id=" + id + ", dateReception=" + dateReception + ", qteLivree=" + qteLivree + '}';
    }
    
    
    
    
    
    
}
