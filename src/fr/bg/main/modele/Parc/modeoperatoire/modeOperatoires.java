/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.Parc.modeoperatoire;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.Persistence;
import static javax.persistence.Persistence.createEntityManagerFactory;

/**
 *
 * @author Ouadie
 */
@Entity
public class modeOperatoires implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String fonctionMode;
    private Reglages reglage;
    private Collection<Outils> listeOutils;
    private ConsignationSecurites consignation;
    private MontageDemontages montage;
    private MontageDemontages demontage;
     
    public modeOperatoires(Long id, String fonctionMode, Reglages reglage, Collection<Outils> listeOutils, ConsignationSecurites consignation) {
        this.id = id;
        this.fonctionMode = fonctionMode;
        this.reglage = reglage;
        this.listeOutils = listeOutils;
        this.consignation = consignation;
    }

    public modeOperatoires(Long id, String fonctionMode, Reglages reglage, Collection<Outils> listeOutils, ConsignationSecurites consignation, MontageDemontages montage, MontageDemontages demontage) {
        this.id = id;
        this.fonctionMode = fonctionMode;
        this.reglage = reglage;
        this.listeOutils = listeOutils;
        this.consignation = consignation;
        this.montage = montage;
        this.demontage = demontage;
    }

    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }

    public String getFonctionMode() {
        return fonctionMode;
    }

    public void setFonctionMode(String fonctionMode) {
        this.fonctionMode = fonctionMode;
    }

    public Reglages getReglage() {
        return reglage;
    }

    public void setReglage(Reglages reglage) {
        this.reglage = reglage;
    }

    public Collection<Outils> getListeOutils() {
        return listeOutils;
    }

    public void setListeOutils(Collection<Outils> listeOutils) {
        this.listeOutils = listeOutils;
    }

    public ConsignationSecurites getConsignation() {
        return consignation;
    }

    public void setConsignation(ConsignationSecurites consignation) {
        this.consignation = consignation;
    }

    public MontageDemontages getMontage() {
        return montage;
    }

    public void setMontage(MontageDemontages montage) {
        this.montage = montage;
    }

    public MontageDemontages getDemontage() {
        return demontage;
    }

    public void setDemontage(MontageDemontages demontage) {
        this.demontage = demontage;
    }

    public modeOperatoires() {
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
        if (!(object instanceof modeOperatoires)) {
            return false;
        }
        modeOperatoires other = (modeOperatoires) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.bg.main.modele.plandetri.modeOperatoire[ id=" + id + " ]";
    }

    public void persist(Object object) {
        EntityManagerFactory emf = createEntityManagerFactory("BoumAppPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
