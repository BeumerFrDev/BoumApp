/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.Personnel;

import fr.bg.main.modele.Adresses;
import fr.bg.main.modele.Affectations;
import fr.bg.main.modele.Individus;
import fr.bg.main.modele.Intervention.Intervention;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author lyess
 */
@Entity
public class Personne extends Individus {

    
    
    @Id
    private Individus responsablePersonne;
    @OneToOne
    private Poste postePersonne;
    @OneToOne
    private Service servicePersonne;;
    
    private Collection<Intervention> listeInterventionPersonne;

    public Personne(Individus responsablePersonne, Poste postePersonne, Service servicePersonne, Collection<Intervention> listeInterventionPersonne, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, String tel, String mail, Affectations affectation) {
        super(nomIndividu, prenomIndividu, genreIndividu, datNaisIndividu, lieuNaisIndividu, nivEtudIndividu, domEtudIndividu, profIndividu, domCompetIndividu, langMatIndividu, langParlIndividu, photoIndividu, rectoPIDIndividu, versoPIDIndividu, tel, mail, affectation);
        this.responsablePersonne = responsablePersonne;
        this.postePersonne = postePersonne;
        this.servicePersonne = servicePersonne;
        this.listeInterventionPersonne = listeInterventionPersonne;
    }

    public Personne(Individus responsablePersonne, Poste postePersonne, Service servicePersonne, Collection<Intervention> listeInterventionPersonne, String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu, String tel, String mail) {
        super(nomIndividu, prenomIndividu, genreIndividu, datNaisIndividu, lieuNaisIndividu, nivEtudIndividu, domEtudIndividu, profIndividu, domCompetIndividu, langMatIndividu, langParlIndividu, photoIndividu, rectoPIDIndividu, versoPIDIndividu, tel, mail);
        this.responsablePersonne = responsablePersonne;
        this.postePersonne = postePersonne;
        this.servicePersonne = servicePersonne;
        this.listeInterventionPersonne = listeInterventionPersonne;
    }

    public Personne(Individus responsablePersonne, Poste postePersonne, Service servicePersonne, Collection<Intervention> listeInterventionPersonne, int idIndividu) {
        super(idIndividu);
        this.responsablePersonne = responsablePersonne;
        this.postePersonne = postePersonne;
        this.servicePersonne = servicePersonne;
        this.listeInterventionPersonne = listeInterventionPersonne;
    }

    public Individus getResponsablePersonne() {
        return responsablePersonne;
    }

    public void setResponsablePersonne(Individus responsablePersonne) {
        this.responsablePersonne = responsablePersonne;
    }
    
    
    

    
    
}
