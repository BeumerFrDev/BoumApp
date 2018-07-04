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
@Table(catalog = "boumap", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"idPiece"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pieces.findAll", query = "SELECT p FROM Pieces p")
    , @NamedQuery(name = "Pieces.findByIdDB", query = "SELECT p FROM Pieces p WHERE p.idDB = :idDB")
    , @NamedQuery(name = "Pieces.findByIdPiece", query = "SELECT p FROM Pieces p WHERE p.idPiece = :idPiece")
    , @NamedQuery(name = "Pieces.findByReferenceType", query = "SELECT p FROM Pieces p WHERE p.referenceType = :referenceType")
    , @NamedQuery(name = "Pieces.findByBlockPere", query = "SELECT p FROM Pieces p WHERE p.blockPere = :blockPere")})
public class Pieces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idDB;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String idPiece;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String referenceType;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String blockPere;

    public Pieces() {
    }

    public Pieces(Integer idDB) {
        this.idDB = idDB;
    }

    public Pieces(Integer idDB, String idPiece, String referenceType, String blockPere) {
        this.idDB = idDB;
        this.idPiece = idPiece;
        this.referenceType = referenceType;
        this.blockPere = blockPere;
    }

    public Integer getIdDB() {
        return idDB;
    }

    public void setIdDB(Integer idDB) {
        this.idDB = idDB;
    }

    public String getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(String idPiece) {
        this.idPiece = idPiece;
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
        hash += (idDB != null ? idDB.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pieces)) {
            return false;
        }
        Pieces other = (Pieces) object;
        if ((this.idDB == null && other.idDB != null) || (this.idDB != null && !this.idDB.equals(other.idDB))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication10.Pieces[ idDB=" + idDB + " ]";
    }
    
}
