/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import fr.bg.main.modele.plandetri.Type;
import java.util.Collection;
import java.util.Objects;

/**
 *
 * @author lyess
 */
public class Article {
    
    private int idArticle;
    private String nomArticle;
    private Type typeArticle;
    private String libelleArticle;
    private String referenceArticle;
    private Fournisseur fournisseurArticle;
    private Rayon rayonArticle;
    private int qteStock;
    private String imageArticle;
    private Entree entreeArticle;
    private Sortie sortieArticle;
    
    
    public Collection<Article> listeArticle;
    
    public Collection<Article> listeArticleAAjouter;
    public Collection<Article> listeArticleAModifier;
    public Collection<Article> listeArticleASupprimer;
    

    public Article( String nomArticle, Type typeArticle, String libelleArticle,
            String referenceArticle, Fournisseur fournisseurArticle, Rayon rayonArticle, 
            int qteStock, String imageArticle, Entree entreeArticle, Sortie sortieArticle) {
       
        this.nomArticle = nomArticle;
        this.typeArticle = typeArticle;
        this.libelleArticle = libelleArticle;
        this.referenceArticle = referenceArticle;
        this.fournisseurArticle = fournisseurArticle;
        this.rayonArticle = rayonArticle;
        this.qteStock = qteStock;
        this.imageArticle = imageArticle;
        this.entreeArticle = entreeArticle;
        this.sortieArticle = sortieArticle;
    }
    
    
    public Article(String nomArticle, Type typeArticle, String libelleArticle,
            String referenceArticle, Fournisseur fournisseurArticle, Rayon rayonArticle, 
            int qteStock, Entree entreeArticle, Sortie sortieArticle) {
       
        this.nomArticle = nomArticle;
        this.typeArticle = typeArticle;
        this.libelleArticle = libelleArticle;
        this.referenceArticle = referenceArticle;
        this.fournisseurArticle = fournisseurArticle;
        this.rayonArticle = rayonArticle;
        this.qteStock = qteStock;
      
        this.entreeArticle = entreeArticle;
        this.sortieArticle = sortieArticle;
    }
    
    
    
   public Article(String nomArticle, Type typeArticle,  Fournisseur fournisseurArticle,int qteStock) {
       
        this.nomArticle = nomArticle;
        this.typeArticle = typeArticle;
        this.fournisseurArticle = fournisseurArticle;
        this.qteStock = qteStock;
      
    } 

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
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

    public String getLibelleArticle() {
        return libelleArticle;
    }

    public void setLibelleArticle(String libelleArticle) {
        this.libelleArticle = libelleArticle;
    }

    public String getReferenceArticle() {
        return referenceArticle;
    }

    public void setReferenceArticle(String referenceArticle) {
        this.referenceArticle = referenceArticle;
    }

    public Fournisseur getFournisseurArticle() {
        return fournisseurArticle;
    }

    public void setFournisseurArticle(Fournisseur fournisseurArticle) {
        this.fournisseurArticle = fournisseurArticle;
    }

    public Rayon getRayonArticle() {
        return rayonArticle;
    }

    public void setRayonArticle(Rayon rayonArticle) {
        this.rayonArticle = rayonArticle;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public String getImageArticle() {
        return imageArticle;
    }

    public void setImageArticle(String imageArticle) {
        this.imageArticle = imageArticle;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idArticle;
        hash = 97 * hash + Objects.hashCode(this.nomArticle);
        hash = 97 * hash + Objects.hashCode(this.typeArticle);
        hash = 97 * hash + Objects.hashCode(this.libelleArticle);
        hash = 97 * hash + Objects.hashCode(this.referenceArticle);
        hash = 97 * hash + Objects.hashCode(this.fournisseurArticle);
        hash = 97 * hash + Objects.hashCode(this.rayonArticle);
        hash = 97 * hash + this.qteStock;
        hash = 97 * hash + Objects.hashCode(this.imageArticle);
        hash = 97 * hash + Objects.hashCode(this.entreeArticle);
        hash = 97 * hash + Objects.hashCode(this.sortieArticle);
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
        if (this.idArticle != other.idArticle) {
            return false;
        }
        if (this.qteStock != other.qteStock) {
            return false;
        }
        if (!Objects.equals(this.nomArticle, other.nomArticle)) {
            return false;
        }
        if (!Objects.equals(this.libelleArticle, other.libelleArticle)) {
            return false;
        }
        if (!Objects.equals(this.referenceArticle, other.referenceArticle)) {
            return false;
        }
        if (!Objects.equals(this.imageArticle, other.imageArticle)) {
            return false;
        }
        if (!Objects.equals(this.typeArticle, other.typeArticle)) {
            return false;
        }
        if (!Objects.equals(this.fournisseurArticle, other.fournisseurArticle)) {
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
        return true;
    }

    @Override
    public String toString() {
        return "Article{" + "idArticle=" + idArticle + ", nomArticle=" + nomArticle + ", typeArticle=" + typeArticle + ", libelleArticle=" + libelleArticle + ", referenceArticle=" + referenceArticle + ", fournisseurArticle=" + fournisseurArticle + ", rayonArticle=" + rayonArticle + ", qteStock=" + qteStock + ", imageArticle=" + imageArticle + ", entreeArticle=" + entreeArticle + ", sortieArticle=" + sortieArticle + '}';
    }
    
    
    
   // Methode Ajouter Article
    
    public Article ajouterArticle(String nomArticle, Type typeArticle, String libelleArticle,
            String referenceArticle, Fournisseur fournisseurArticle, Rayon rayonArticle, 
            int qteStock, String imageArticle, Entree entreeArticle, Sortie sortieArticle){
        
        
        Article A = new Article(nomArticle,typeArticle, libelleArticle,
             referenceArticle, fournisseurArticle, rayonArticle, 
             qteStock, imageArticle, entreeArticle, sortieArticle);
        
        return A;
  
         }
    
    
    
    //Methode modifier article
    
    
    public void modifierArticle(String nomArticle, Type typeArticle, String libelleArticle,
            String referenceArticle, Fournisseur fournisseurArticle, Rayon rayonArticle, 
            int qteStock, String imageArticle, Entree entreeArticle, Sortie sortieArticle){
        
        
        this.nomArticle = nomArticle;
        this.typeArticle = typeArticle;
        this.libelleArticle = libelleArticle;
        this.referenceArticle = referenceArticle;
        this.fournisseurArticle = fournisseurArticle;
        this.rayonArticle = rayonArticle;
        this.qteStock = qteStock;
        this.imageArticle = imageArticle;
        this.entreeArticle = entreeArticle;
        this.sortieArticle = sortieArticle;
        
        }
    
    
    //Methode supprimer article
    
    public void supprimerArticle(Article A){
        
        
    }
    
    
    
    
    
    
}



    