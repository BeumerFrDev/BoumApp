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
import javax.persistence.Lob;
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
@Table(catalog = "boumap", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"idBlock"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blocks.findAll", query = "SELECT b FROM Blocks b")
    , @NamedQuery(name = "Blocks.findByIdBD", query = "SELECT b FROM Blocks b WHERE b.idBD = :idBD")
    , @NamedQuery(name = "Blocks.findByIdBlock", query = "SELECT b FROM Blocks b WHERE b.idBlock = :idBlock")
    , @NamedQuery(name = "Blocks.findByNumeroBlock", query = "SELECT b FROM Blocks b WHERE b.numeroBlock = :numeroBlock")
    , @NamedQuery(name = "Blocks.findByReferenceType", query = "SELECT b FROM Blocks b WHERE b.referenceType = :referenceType")
    , @NamedQuery(name = "Blocks.findByBlockPere", query = "SELECT b FROM Blocks b WHERE b.blockPere = :blockPere")})
public class Blocks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idBD;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String idBlock;
    private Integer numeroBlock;
    @Lob
    private Object positionInterface;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String referenceType;
    @Column(length = 20)
    private String blockPere;

    public Blocks() {
    }

    public Blocks(Integer idBD) {
        this.idBD = idBD;
    }

    public Blocks(Integer idBD, String idBlock, String referenceType) {
        this.idBD = idBD;
        this.idBlock = idBlock;
        this.referenceType = referenceType;
    }

    public Integer getIdBD() {
        return idBD;
    }

    public void setIdBD(Integer idBD) {
        this.idBD = idBD;
    }

    public String getIdBlock() {
        return idBlock;
    }

    public void setIdBlock(String idBlock) {
        this.idBlock = idBlock;
    }

    public Integer getNumeroBlock() {
        return numeroBlock;
    }

    public void setNumeroBlock(Integer numeroBlock) {
        this.numeroBlock = numeroBlock;
    }

    public Object getPositionInterface() {
        return positionInterface;
    }

    public void setPositionInterface(Object positionInterface) {
        this.positionInterface = positionInterface;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getBlockPere() {
        return blockPere;
    }

    public void setBlockPere(String blockPere) {
        this.blockPere = blockPere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBD != null ? idBD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blocks)) {
            return false;
        }
        Blocks other = (Blocks) object;
        if ((this.idBD == null && other.idBD != null) || (this.idBD != null && !this.idBD.equals(other.idBD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication10.Blocks[ idBD=" + idBD + " ]";
    }
    
}
