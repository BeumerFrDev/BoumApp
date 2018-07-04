/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.Parc;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ouadie
 */
@Entity
@Table(catalog = "boumap",name = "types", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"referenceType"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Types.findAll", query = "SELECT t FROM Types t")
    , @NamedQuery(name = "Types.findByIdType", query = "SELECT t FROM Types t WHERE t.idType = :idType")
    , @NamedQuery(name = "Types.findByReferenceType", query = "SELECT t FROM Types t WHERE t.referenceType = :referenceType")
    , @NamedQuery(name = "Types.findByLibelleType", query = "SELECT t FROM Types t WHERE t.libelleType = :libelleType")
    , @NamedQuery(name = "Types.findByDureDeVieType", query = "SELECT t FROM Types t WHERE t.dureDeVieType = :dureDeVieType")
    , @NamedQuery(name = "Types.findByImageType", query = "SELECT t FROM Types t WHERE t.imageType = :imageType")})
public class Types implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idType")
    private Integer idType;
    @Basic(optional = false)
    @Column(name = "referenceType")
    private String referenceType;
    @Basic(optional = false)
    @Column(name = "libelleType")
    private String libelleType;
    @Column(name = "dureDeVieType")
    private Integer dureDeVieType;
    @Column(name = "imageType")
    private String imageType;
    @Basic(optional = false)
    @Column(name = "classe")
    private String classe;

    private static final long serialVersionUID = 1L;

    public Types() {
    }

 
    public Types(Integer idType) {
        this.idType = idType;
    }

    public Types(Integer idType, String referenceType, String libelleType, String classe) {
        this.idType = idType;
        this.referenceType = referenceType;
        this.libelleType = libelleType;
        this.classe = classe;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getLibelleType() {
        return libelleType;
    }

    public void setLibelleType(String libelleType) {
        this.libelleType = libelleType;
    }

    public Integer getDureDeVieType() {
        return dureDeVieType;
    }

    public void setDureDeVieType(Integer dureDeVieType) {
        this.dureDeVieType = dureDeVieType;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idType != null ? idType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Types)) {
            return false;
        }
        Types other = (Types) object;
        if ((this.idType == null && other.idType != null) || (this.idType != null && !this.idType.equals(other.idType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.bg.main.modele.Parc.Types[ idType=" + idType + " ]";
    }
    
}
