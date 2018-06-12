/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

import java.util.Date;

/**
 *
 * @author lyess
 */
public class Reception {
    
   private int numReception;
   private Date dateReception;
   private int qteLivree;

    public Reception(int numReception, Date dateReception, int qteLivree) {
        this.numReception = numReception;
        this.dateReception = dateReception;
        this.qteLivree = qteLivree;
    }

    public int getNumReception() {
        return numReception;
    }

    public void setNumReception(int numReception) {
        this.numReception = numReception;
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
   
   
   
   
    
}
