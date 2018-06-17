/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.Parc;

import fr.bg.main.modele.Adresses;
import fr.bg.main.modele.Individus;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ouadie
 */
@Entity
public class Parc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomParc;
    private Adresses adresseParc;
    private Individus contact1;
    private Individus contact2;
    private Collection<Blocks> listeBlocks;

    public Parc(Long id, String nomParc) {
        this.id = id;
        this.nomParc = nomParc;
    }

    public Parc(Long id, String nomParc, Adresses adresseParc, Individus contact1, Individus contact2, Collection<Blocks> listeBlocks) {
        this.id = id;
        this.nomParc = nomParc;
        this.adresseParc = adresseParc;
        this.contact1 = contact1;
        this.contact2 = contact2;
        this.listeBlocks = listeBlocks;
    }

    public String getNomParc() {
        return nomParc;
    }

    public void setNomParc(String nomParc) {
        this.nomParc = nomParc;
    }

    public Adresses getAdresseParc() {
        return adresseParc;
    }

    public void setAdresseParc(Adresses adresseParc) {
        this.adresseParc = adresseParc;
    }

    public Individus getContact1() {
        return contact1;
    }

    public void setContact1(Individus contact1) {
        this.contact1 = contact1;
    }

    public Individus getContact2() {
        return contact2;
    }

    public void setContact2(Individus contact2) {
        this.contact2 = contact2;
    }

    public Collection<Blocks> getListeBlocks() {
        return listeBlocks;
    }

    public void setListeBlocks(Collection<Blocks> listeBlocks) {
        this.listeBlocks = listeBlocks;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parc)) {
            return false;
        }
        Parc other = (Parc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.bg.main.modele.plandetri.Parc[ id=" + id + " ]";
    }
    
}
