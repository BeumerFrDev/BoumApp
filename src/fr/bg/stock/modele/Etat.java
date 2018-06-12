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
class Etat {
    
    private String idEtat;
    private String nomEtat;

    public Etat(String idEtat, String nomEtat) {
        this.idEtat = idEtat;
        this.nomEtat = nomEtat;
    }

    public String getIdEtat() {
        return idEtat;
    }

    public String getNomEtat() {
        return nomEtat;
    }

    public void setIdEtat(String idEtat) {
        this.idEtat = idEtat;
    }

    public void setNomEtat(String nomEtat) {
        this.nomEtat = nomEtat;
    }
    
    
    
    
    
    
}
