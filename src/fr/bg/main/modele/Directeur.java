 
package fr.bg.main.modele;

import java.util.Date;
import fr.bg.main.modele.Individus;

/**
 *
 * @author salim , Ouadie
 */
public class Directeur extends Individus {
    
 
    
  
  
 
    
    public Directeur(String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,String tel,String mail, Affectations affectation) {
       super(nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu, tel, mail,affectation);
         
      
    }
    public Directeur(String nomIndividu, String prenomIndividu, String genreIndividu, Date datNaisIndividu, String lieuNaisIndividu, String nivEtudIndividu, String domEtudIndividu, String profIndividu, Adresses domCompetIndividu, String langMatIndividu, String langParlIndividu, String photoIndividu, String rectoPIDIndividu, String versoPIDIndividu,String tel,String mail) {
       super(nomIndividu,prenomIndividu,genreIndividu,datNaisIndividu,lieuNaisIndividu,nivEtudIndividu,domEtudIndividu,profIndividu,domCompetIndividu,langMatIndividu,langParlIndividu,photoIndividu,rectoPIDIndividu,versoPIDIndividu, tel, mail);
         
      
    }









   
    
    
}
