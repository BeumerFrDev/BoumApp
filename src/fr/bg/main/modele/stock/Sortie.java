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
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author lyess
 */


@Entity
public class Sortie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    //liste des attribus
    
    private Long id;
    @OneToOne
    private Article articleSortie;
    private int qteSortie;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateSortie;
    
    
    public static final ListeStock<Sortie> listeSortie = new ListeStock<Sortie>(); 
   
    {
         this.listeSortie.add(this);
    }
           
    
    // liste des constructeurs
    
    public Sortie (){
        
    }

    public Sortie(Long id) {
        this.id = id;
    }

    public Sortie(Long id, Article articleSortie, int qteSortie, Date dateSortie) {
        this.id = id;
        this.articleSortie = articleSortie;
        this.qteSortie = qteSortie;
        this.dateSortie = dateSortie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticleSortie() {
        return articleSortie;
    }

    public void setArticleSortie(Article articleSortie) {
        this.articleSortie = articleSortie;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.articleSortie);
        hash = 71 * hash + this.qteSortie;
        hash = 71 * hash + Objects.hashCode(this.dateSortie);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.articleSortie, other.articleSortie)) {
            return false;
        }
        if (!Objects.equals(this.dateSortie, other.dateSortie)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sortie{" + "id=" + id + ", articleSortie=" + articleSortie + ", qteSortie=" + qteSortie + ", dateSortie=" + dateSortie + '}';
    }
    
    
   
    
}
