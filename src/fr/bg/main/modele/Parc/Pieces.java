/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.Parc;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ouadie
 */
@Entity
public class Pieces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libellePiece;
    private String referencePiece;
    private String image;
    private Type type;
    private int dureDeVie;

    public Pieces() {
    }

    public Pieces(Long id) {
        this.id = id;
    }

    public Pieces(Long id, String libellePiece, String referencePiece, Type type, int dureDeVie) {
        this.id = id;
        this.libellePiece = libellePiece;
        this.referencePiece = referencePiece;
        this.type = type;
        this.dureDeVie = dureDeVie;
    }

    public Pieces(Long id, String libellePiece, String referencePiece, String image, Type type, int dureDeVie) {
        this.id = id;
        this.libellePiece = libellePiece;
        this.referencePiece = referencePiece;
        this.image = image;
        this.type = type;
        this.dureDeVie = dureDeVie;
    }

    public String getLibellePiece() {
        return libellePiece;
    }

    public void setLibellePiece(String libellePiece) {
        this.libellePiece = libellePiece;
    }

    public String getReferencePiece() {
        return referencePiece;
    }

    public void setReferencePiece(String referencePiece) {
        this.referencePiece = referencePiece;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getDureDeVie() {
        return dureDeVie;
    }

    public void setDureDeVie(int dureDeVie) {
        this.dureDeVie = dureDeVie;
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
        if (!(object instanceof Pieces)) {
            return false;
        }
        Pieces other = (Pieces) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.bg.main.modele.plandetri.Pieces[ id=" + id + " ]";
    }
    
}
