/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.Parc;

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
public class Blocks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelleBlock;
    private String reference ;
    private String image;
    private Type typeBlock;
    private Collection<Pieces> listePieces ;
    private Collection<Blocks> listeSousBlocks;

    public Blocks() {
    }

    public Blocks(Long id) {
        this.id = id;
    }

    public Blocks(Long id, String libelleBlock, String reference, String image, Type typeBlock, Collection<Pieces> listePieces, Collection<Blocks> listeSousBlocks) {
        this.id = id;
        this.libelleBlock = libelleBlock;
        this.reference = reference;
        this.image = image;
        this.typeBlock = typeBlock;
        this.listePieces = listePieces;
        this.listeSousBlocks = listeSousBlocks;
    }

    public Blocks(Long id, String libelleBlock, String reference, String image, Type typeBlock, Collection<Pieces> listePieces) {
        this.id = id;
        this.libelleBlock = libelleBlock;
        this.reference = reference;
        this.image = image;
        this.typeBlock = typeBlock;
        this.listePieces = listePieces;
    }

    public String getLibelleBlock() {
        return libelleBlock;
    }

    public void setLibelleBlock(String libelleBlock) {
        this.libelleBlock = libelleBlock;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Type getTypeBlock() {
        return typeBlock;
    }

    public void setTypeBlock(Type typeBlock) {
        this.typeBlock = typeBlock;
    }

    public Collection<Pieces> getListePieces() {
        return listePieces;
    }

    public void setListePieces(Collection<Pieces> listePieces) {
        this.listePieces = listePieces;
    }

    public Collection<Blocks> getListeSousBlocks() {
        return listeSousBlocks;
    }

    public void setListeSousBlocks(Collection<Blocks> listeSousBlocks) {
        this.listeSousBlocks = listeSousBlocks;
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
        if (!(object instanceof Blocks)) {
            return false;
        }
        Blocks other = (Blocks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.bg.main.modele.plandetri.Blocks[ id=" + id + " ]";
    }
    
}
