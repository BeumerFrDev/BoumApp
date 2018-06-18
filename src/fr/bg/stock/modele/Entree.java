/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;

/**
 *
 * @author lyess
 */


@Entity
public class Entree implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = AUTO)
    
    //liste des attribus
    
    private Long id;
    @OneToOne
    private Article articleEntree;
    private int qteEntree;
    @Temporal(DATE)
    private Date dateEntree;
    private Double prixEntree;
    
    public static Collection<Entree> listeEntree;
    
    public static Collection<Entree> EntreeAAjouter;
    public static Collection<Entree> EntreeAModifier;
    public static Collection<Entree> EntreeASupprimer;
    
    
    
    // liste des constructeurs
    
   public Entree(){
       
   } 

    public Entree(Long id) {
        this.id = id;
    }

    public Entree(Long id, Article articleEntree, int qteEntree, Date dateEntree, Double prixEntree) {
        this.id = id;
        this.articleEntree = articleEntree;
        this.qteEntree = qteEntree;
        this.dateEntree = dateEntree;
        this.prixEntree = prixEntree;
    }

   
    
    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticleEntree() {
        return articleEntree;
    }

    public void setArticleEntree(Article articleEntree) {
        this.articleEntree = articleEntree;
    }

    public int getQteEntree() {
        return qteEntree;
    }

    public void setQteEntree(int qteEntree) {
        this.qteEntree = qteEntree;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Double getPrixEntree() {
        return prixEntree;
    }

    public void setPrixEntree(Double prixEntree) {
        this.prixEntree = prixEntree;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.articleEntree);
        hash = 71 * hash + this.qteEntree;
        hash = 71 * hash + Objects.hashCode(this.dateEntree);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.articleEntree, other.articleEntree)) {
            return false;
        }
        if (!Objects.equals(this.dateEntree, other.dateEntree)) {
            return false;
        }
        if (!Objects.equals(this.prixEntree, other.prixEntree)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entree{" + "id=" + id + ", articleEntree=" + articleEntree + ", qteEntree=" + qteEntree + ", dateEntree=" + dateEntree + ", prixEntree=" + prixEntree + '}';
    }
    
    
    
}
