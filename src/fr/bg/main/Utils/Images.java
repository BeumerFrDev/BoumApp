/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.Utils;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.imageio.ImageIO;
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

@Table(catalog = "boumap",name = "images" ,schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"titreImage"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Images.findAll", query = "SELECT i FROM Images i")
    , @NamedQuery(name = "Images.findByIdImage", query = "SELECT i FROM Images i WHERE i.idImage = :idImage")
    , @NamedQuery(name = "Images.findByTitreImage", query = "SELECT i FROM Images i WHERE i.titreImage = :titreImage")})
public class Images implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idImage;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String titreImage;
    @Basic(optional = false)
    @Lob
    @Column(nullable = false)
       private byte[] binaireImage;

    public Images() {
    }

    public Images(Integer idImage) {
        this.idImage = idImage;
    }

    public Images(Integer idImage, String titreImage, byte[] binaireImage) {
        this.idImage = idImage;
        this.titreImage = titreImage;
        this.binaireImage = binaireImage;
    }

    public Integer getIdImage() {
        return idImage;
    }

    public void setIdImage(Integer idImage) {
        this.idImage = idImage;
    }

    public String getTitreImage() {
        return titreImage;
    }

    public void setTitreImage(String titreImage) {
        this.titreImage = titreImage;
    }

    public byte[] getBinaireImage() {
        return binaireImage;
    }

    public void setBinaireImage(byte[] binaireImage) {
        this.binaireImage = binaireImage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImage != null ? idImage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Images)) {
            return false;
        }
        Images other = (Images) object;
        if ((this.idImage == null && other.idImage != null) || (this.idImage != null && !this.idImage.equals(other.idImage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.bg.main.Utils.Images[ idImage=" + idImage + " ]";
    }
    
     
    public static String imageSaveBDETLienInterne(BufferedImage image) throws IOException, SQLException {
            Images images = new Images();
            ImagesDAO imagesDao= new ImagesDAO();
          
            images.setBinaireImage(getBytes(image));
            images.setTitreImage(LocalDate.now().toString()+(Math.random()*1000)/10);
            System.out.println(images.getBinaireImage());

           System.out.println(imagesDao.create(images) + "test images");
          
         File outputFile = new File("src/fr/bg/main/assets/images/" + images.getTitreImage()+".png");
        
        try {
            ImageIO.write(image, "png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "src/fr/bg/main/assets/images/" + images.getTitreImage()+".png";
}
    	public static byte[] getBytes(BufferedImage img) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ImageIO.write(img, "png", baos);
		} finally {
			baos.close();
		}
		return baos.toByteArray();
	}
}
