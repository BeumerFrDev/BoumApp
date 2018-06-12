/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

/**
 *
 * @author lyess
 */
class Entree {
    
        private String idEntree;
        private int qteEntree;
        private Double prixEntree;

    public Entree(String idEntree, int qteEntree, Double prixEntree) {
        this.idEntree = idEntree;
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
    
    
        
        

    
}
