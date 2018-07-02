/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.Utilisateurs;

import fr.bg.main.modele.stock.ListeStock;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lyess
 */
@Entity
public class Absence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    private Long id;
    private Date dateAbsence;
    
    public static final ListeStock<Absence> listeAbsence = new ListeStock<Absence>(); 
   
    {
         this.listeAbsence.add(this);
    }

    
    
}
