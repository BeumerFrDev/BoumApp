/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lyess
 */
public class Sortie {
    
    private String idSortie;
    private int qteSortie;
    private Date dateSortie;

    public Sortie(String idSortie, int qteSortie, Date dateSortie) {
        this.idSortie = idSortie;
        this.qteSortie = qteSortie;
        this.dateSortie = dateSortie;
    }

    public String getIdSortie() {
        return idSortie;
    }

    public void setIdSortie(String idSortie) {
        this.idSortie = idSortie;
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
        hash = 97 * hash + Objects.hashCode(this.idSortie);
        hash = 97 * hash + this.qteSortie;
        hash = 97 * hash + Objects.hashCode(this.dateSortie);
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
        if (!Objects.equals(this.idSortie, other.idSortie)) {
            return false;
        }
        if (!Objects.equals(this.dateSortie, other.dateSortie)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sortie{" + "idSortie=" + idSortie + ", qteSortie=" + qteSortie + ", dateSortie=" + dateSortie + '}';
    }
    
    
    
    
}
