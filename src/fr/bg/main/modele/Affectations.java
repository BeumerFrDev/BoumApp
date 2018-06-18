
package fr.bg.main.modele;


import java.util.Date;
import java.util.Iterator;


public class Affectations {
    
   private int idAffectation;
   private String contrat ;
   
   private String loginAffectation;
   private String motPasseAffectation; 
   private Date dateEntrAffectation; 
   private Date dateSortAffectation; 
   private String commAffectation; 
   private String ficheAffectation;
   private Individus individus;
   private Individus referentAffectation;
   private static final ListPro <Affectations> listeAffectations =new ListPro<Affectations>();
   
   
    public Affectations(int idAffectation,String contrat, String loginAffectation,
            String motPasseAffectation, Date dateEntrAffectation, Date datesortAffectation, 
            String commAffectation, String ficheAffectation, Individus individus,Individus referentAffectation) {
        this.idAffectation = idAffectation;
        this.contrat =  contrat;
        this.loginAffectation = loginAffectation;
        this.motPasseAffectation = motPasseAffectation;
        this.dateEntrAffectation = dateEntrAffectation;
        this.dateSortAffectation = datesortAffectation;
        this.commAffectation = commAffectation;
        this.ficheAffectation = ficheAffectation;
        this.individus = individus;
        this.referentAffectation=referentAffectation;
        
    }
   
    public Affectations(int idAffectation,String contrat,
            String loginAffectation, String motPasseAffectation,
            Date dateEntrAffectation, Date datesortAffectation, 
            String commAffectation, String ficheAffectation, 
            Individus individus) {
        
        this.idAffectation = idAffectation;
        this.contrat =  contrat;
        this.loginAffectation = loginAffectation;
        this.motPasseAffectation = motPasseAffectation;
        this.dateEntrAffectation = dateEntrAffectation;
        this.dateSortAffectation = datesortAffectation;
        this.commAffectation = commAffectation;
        this.ficheAffectation = ficheAffectation;
        this.individus = individus;
        
        //this.listeAffectations=listeAffectations;
        listeAffectations.add(this);    }
    
    
     public static boolean validate(String user, String password){
         Iterator it =listeAffectations.iterator();
         String validUserPassword=null ;
         while(it.hasNext()){
             Affectations affectation = (Affectations) it.next();
             if(user.equals(affectation.getLoginAffectation())){
                 validUserPassword=affectation.getMotPasseAffectation();
             }
         }
        
        return validUserPassword != null && validUserPassword.equals(password);
    }
     
     //une méthode statique pour chercher l'individus avec son user 
     
    public static Individus of(String user){
         Iterator it =listeAffectations.iterator();
         Individus indiv=null;
         while(it.hasNext()){
             Affectations affectation = (Affectations) it.next();
             if(user.equals(affectation.getLoginAffectation())){
                 indiv=affectation.getIndividus();
             }
         }
        
        return indiv;
    }
    public int getIdAffectation() {
        return idAffectation;
    }

    public void setIdAffectation(int idAffectation) {
        this.idAffectation = idAffectation;
    }

    public String getContrat() {
        return contrat;
    }

    public Individus getIndividus() {
        return individus;
    }

    public void setIndividus(Individus individus) {
        this.individus = individus;
    }

    public Individus getReferentAffectation() {
        return referentAffectation;
    }

    public void setReferentAffectation(Individus referentAffectation) {
        this.referentAffectation = referentAffectation;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

  
    public String getLoginAffectation() {
        return loginAffectation;
    }

    public void setLoginAffectation(String loginAffectation) {
        this.loginAffectation = loginAffectation;
    }

    public String getMotPasseAffectation() {
        return motPasseAffectation;
    }

    public void setMotPasseAffectation(String motPasseAffectation) {
        this.motPasseAffectation = motPasseAffectation;
    }

    public Date getDateEntrAffectation() {
        return dateEntrAffectation;
    }

    public void setDateEntrAffectation(Date dateEntrAffectation) {
        this.dateEntrAffectation = dateEntrAffectation;
    }

    public Date getDateSortAffectation() {
        return dateSortAffectation;
    }

    public void setDateSortAffectation(Date datesortAffectation) {
        this.dateSortAffectation = datesortAffectation;
    }

    public String getCommAffectation() {
        return commAffectation;
    }

    public void setCommAffectation(String commAffectation) {
        this.commAffectation = commAffectation;
    }

    public String getFicheAffectation() {
        return ficheAffectation;
    }

    public void setFicheAffectation(String ficheAffectation) {
        this.ficheAffectation = ficheAffectation;
    }



   
   
   
    
}
