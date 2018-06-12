/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idEtat);
        hash = 97 * hash + Objects.hashCode(this.nomEtat);
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
        final Etat other = (Etat) obj;
        if (!Objects.equals(this.idEtat, other.idEtat)) {
            return false;
        }
        if (!Objects.equals(this.nomEtat, other.nomEtat)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etat{" + "idEtat=" + idEtat + ", nomEtat=" + nomEtat + '}';
    }
    
    
    
    
    
    
}
