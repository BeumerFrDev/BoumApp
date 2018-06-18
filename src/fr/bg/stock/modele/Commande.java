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
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = AUTO)
    
    //liste des attribus
    
    private Long id;
    @Temporal(DATE)
    private Date dateCommande;
    private String etatCommande;
    @OneToOne
    private Reception reception;
    
    public static Collection<Commande> listeCommande;
    
    public static Collection<Commande> commandeAAjouter;
    public static Collection<Commande> commandeAModifier;
    public static Collection<Commande> commandeASupprimer;
    
    
    
    // liste des constructeurs
    
    public Commande(){
        
    }

    public Commande(Long id) {
        this.id = id;
    }

    public Commande(Long id, Date dateCommande, String etatCommande, Reception reception) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
        this.reception = reception;
    }
    
    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(String etatCommande) {
        this.etatCommande = etatCommande;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.dateCommande);
        hash = 67 * hash + Objects.hashCode(this.etatCommande);
        hash = 67 * hash + Objects.hashCode(this.reception);
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
        final Commande other = (Commande) obj;
        if (!Objects.equals(this.etatCommande, other.etatCommande)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateCommande, other.dateCommande)) {
            return false;
        }
        if (!Objects.equals(this.reception, other.reception)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", dateCommande=" + dateCommande + ", etatCommande=" + etatCommande + ", reception=" + reception + '}';
    }
    
    
    

    
}
