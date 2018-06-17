/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.stock;

import fr.bg.main.modele.Parc.Type;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author lyess
 */
@Entity
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    
    // liste des attribus
    
    
    private Long id;
    private String nomArticle;
    @OneToOne
    private Type typeArticle;
    private int qteStock;
    @OneToOne
    private Rayon rayonArticle;
    @OneToOne
    private Entree entreeArticle;
    @OneToOne
    private Sortie sortieArticle;
    @OneToOne
    private Fournisseur fournisseurArticle;
    private String referenceArticle;
    private String libelleArticle;
    private String imageArticle;
    
    
    // liste des constructeur
    
    public Article(){
        
    }

    public Article(Long id) {
        this.id = id;
    }

    public Article(String nomArticle, Type typeArticle, Fournisseur fournisseurArticle) {
        this.nomArticle = nomArticle;
        this.typeArticle = typeArticle;
        this.fournisseurArticle = fournisseurArticle;
    }

    public Article(String nomArticle, Type typeArticle, int qteStock, Rayon rayonArticle, Fournisseur fournisseurArticle, String referenceArticle, String imageArticle) {
        this.nomArticle = nomArticle;
        this.typeArticle = typeArticle;
        this.qteStock = qteStock;
        this.rayonArticle = rayonArticle;
        this.fournisseurArticle = fournisseurArticle;
        this.referenceArticle = referenceArticle;
        this.imageArticle = imageArticle;
    }

    
    
    public Article(Long id, String nomArticle, Type typeArticle, int qteStock, Rayon rayonArticle, Entree entreeArticle, Sortie sortieArticle, 
            Fournisseur fournisseurArticle, String referenceArticle, String libelleArticle, String imageArticle) {
        this.id = id;
        this.nomArticle = nomArticle;
        this.typeArticle = typeArticle;
        this.qteStock = qteStock;
        this.rayonArticle = rayonArticle;
        this.entreeArticle = entreeArticle;
        this.sortieArticle = sortieArticle;
        this.fournisseurArticle = fournisseurArticle;
        this.referenceArticle = referenceArticle;
        this.libelleArticle = libelleArticle;
        this.imageArticle = imageArticle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public Type getTypeArticle() {
        return typeArticle;
    }

    public void setTypeArticle(Type typeArticle) {
        this.typeArticle = typeArticle;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public Rayon getRayonArticle() {
        return rayonArticle;
    }

    public void setRayonArticle(Rayon rayonArticle) {
        this.rayonArticle = rayonArticle;
    }

    public Entree getEntreeArticle() {
        return entreeArticle;
    }

    public void setEntreeArticle(Entree entreeArticle) {
        this.entreeArticle = entreeArticle;
    }

    public Sortie getSortieArticle() {
        return sortieArticle;
    }

    public void setSortieArticle(Sortie sortieArticle) {
        this.sortieArticle = sortieArticle;
    }

    public Fournisseur getFournisseurArticle() {
        return fournisseurArticle;
    }

    public void setFournisseurArticle(Fournisseur fournisseurArticle) {
        this.fournisseurArticle = fournisseurArticle;
    }

    public String getReferenceArticle() {
        return referenceArticle;
    }

    public void setReferenceArticle(String referenceArticle) {
        this.referenceArticle = referenceArticle;
    }

    public String getLibelleArticle() {
        return libelleArticle;
    }

    public void setLibelleArticle(String libelleArticle) {
        this.libelleArticle = libelleArticle;
    }

    public String getImageArticle() {
        return imageArticle;
    }

    public void setImageArticle(String imageArticle) {
        this.imageArticle = imageArticle;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.nomArticle);
        hash = 43 * hash + Objects.hashCode(this.typeArticle);
        hash = 43 * hash + this.qteStock;
        hash = 43 * hash + Objects.hashCode(this.rayonArticle);
        hash = 43 * hash + Objects.hashCode(this.entreeArticle);
        hash = 43 * hash + Objects.hashCode(this.sortieArticle);
        hash = 43 * hash + Objects.hashCode(this.fournisseurArticle);
        hash = 43 * hash + Objects.hashCode(this.referenceArticle);
        hash = 43 * hash + Objects.hashCode(this.libelleArticle);
        hash = 43 * hash + Objects.hashCode(this.imageArticle);
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
        final Article other = (Article) obj;
        if (this.qteStock != other.qteStock) {
            return false;
        }
        if (!Objects.equals(this.nomArticle, other.nomArticle)) {
            return false;
        }
        if (!Objects.equals(this.referenceArticle, other.referenceArticle)) {
            return false;
        }
        if (!Objects.equals(this.libelleArticle, other.libelleArticle)) {
            return false;
        }
        if (!Objects.equals(this.imageArticle, other.imageArticle)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.typeArticle, other.typeArticle)) {
            return false;
        }
        if (!Objects.equals(this.rayonArticle, other.rayonArticle)) {
            return false;
        }
        if (!Objects.equals(this.entreeArticle, other.entreeArticle)) {
            return false;
        }
        if (!Objects.equals(this.sortieArticle, other.sortieArticle)) {
            return false;
        }
        if (!Objects.equals(this.fournisseurArticle, other.fournisseurArticle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", nomArticle=" + nomArticle + ", typeArticle=" + typeArticle + ", qteStock=" + qteStock + 
                ", rayonArticle=" + rayonArticle + ", entreeArticle=" + entreeArticle + ", sortieArticle=" + sortieArticle + ", fournisseurArticle="
                + fournisseurArticle + ", referenceArticle=" + referenceArticle + ", libelleArticle=" + libelleArticle + ", imageArticle=" + imageArticle + '}';
    }

   
    
}
