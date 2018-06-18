
package fr.bg.main.modele;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;


public class Individus<T> {
    private int idIndividu;
    private String nomIndividu;
    private String prenomIndividu; 
    private String genreIndividu; 
    private Date datNaisIndividu; 
    private String lieuNaisIndividu; 
    private String nivEtudIndividu;
    private String domEtudIndividu;
    private String profIndividu; 
   private Adresses domCompetIndividu; 
    private String langMatIndividu; 
    private String langParlIndividu; 
    private String photoIndividu;
    private String rectoPIDIndividu;
    private String versoPIDIndividu;
    private String tel;
    private String mail;
    private Affectations affectation;    
  //  private ArrayList<Assiduites> ListeAbsences;
  //  private ArrayList<Assiduites> ListePresences;
  
    public static final ListPro<Individus> listeIndividusEtablissement= new ListPro<Individus>(); 
    {
        listeIndividusEtablissement.add(this);
    }
    
   
    
    //variable de classe pour definr les id des nouv individus

    public Individus( String nomIndividu, 
           String prenomIndividu ,String genreIndividu, 
           Date datNaisIndividu, String lieuNaisIndividu, 
           String nivEtudIndividu, String domEtudIndividu, 
           String profIndividu, Adresses domCompetIndividu,
           String langMatIndividu, String langParlIndividu, 
           String photoIndividu, String rectoPIDIndividu,
           String versoPIDIndividu,String tel,String mail,Affectations affectation) {
        this.idIndividu = definirId();
        this.nomIndividu = nomIndividu;
        this.affectation = affectation;
        this.prenomIndividu = prenomIndividu;
        this.genreIndividu = genreIndividu;
        this.datNaisIndividu = datNaisIndividu;
        this.lieuNaisIndividu = lieuNaisIndividu;
        this.nivEtudIndividu = nivEtudIndividu;
        this.domEtudIndividu = domEtudIndividu;
        this.profIndividu = profIndividu;
        this.domCompetIndividu = domCompetIndividu;
        this.langMatIndividu = langMatIndividu;
        this.langParlIndividu = langParlIndividu;
        this.photoIndividu = photoIndividu;
        this.rectoPIDIndividu = rectoPIDIndividu;
        this.versoPIDIndividu = versoPIDIndividu;
        this.tel=tel;
        this.mail=mail;
        
        
    }
     
     public Individus( String nomIndividu, 
           String prenomIndividu ,String genreIndividu, 
           Date datNaisIndividu, String lieuNaisIndividu, 
           String nivEtudIndividu, String domEtudIndividu, 
           String profIndividu, Adresses domCompetIndividu,
           String langMatIndividu, String langParlIndividu, 
           String photoIndividu, String rectoPIDIndividu,
           String versoPIDIndividu,String tel,String mail) {
        this.idIndividu = definirId();
        this.nomIndividu = nomIndividu;
      
        this.prenomIndividu = prenomIndividu;
        this.genreIndividu = genreIndividu;
        this.datNaisIndividu = datNaisIndividu;
        this.lieuNaisIndividu = lieuNaisIndividu;
        this.nivEtudIndividu = nivEtudIndividu;
        this.domEtudIndividu = domEtudIndividu;
        this.profIndividu = profIndividu;
        this.domCompetIndividu = domCompetIndividu;
        this.langMatIndividu = langMatIndividu;
        this.langParlIndividu = langParlIndividu;
        this.photoIndividu = photoIndividu;
        this.rectoPIDIndividu = rectoPIDIndividu;
        this.versoPIDIndividu = versoPIDIndividu;
        this.tel=tel;
        this.mail=mail;
        
        
    }
     
  

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     *
     * @param id
     * @return
     */
    public  static  ArrayList<Individus> of(String id ){
        Iterator it = listeIndividusEtablissement.iterator();
        ArrayList<Individus> listRecherche=null;
        while(it.hasNext()){
            Individus indiv = (Individus) it.next();
            String idd = indiv.getIdIndividu()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(indiv);
            }
        }
        return listRecherche;
    }
    
    //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeIndividusEtablissement.iterator();
        
        //année actuelle 
       
        int annee =getInstance().get(YEAR);
        
        Individus indivPlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  indivPlusGrandId=  (Individus) it.next();
        while(it.hasNext()){
            Individus indiv = (Individus) it.next();
            vide=false;
            if(indiv.getIdIndividu()>indivPlusGrandId.getIdIndividu()) indivPlusGrandId =indiv;
        }
            
            if(vide) {out.println((annee *10)+1);return ((annee *100000)+1);}
            else {out.println(indivPlusGrandId.getIdIndividu()+1);return indivPlusGrandId.getIdIndividu()+1;}
        
        
    }
  

    public ListPro<Individus> getListeIndividusEtablissement() {
        return listeIndividusEtablissement;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


  
    public Individus(int idIndividu) {
        this.idIndividu = idIndividu;
    }
    
   
    public Affectations getAffectation() {
        return affectation;
    }

    public void setAffectation(Affectations affectation) {
        this.affectation = affectation;
    }

    public int getIdIndividu() {
        return idIndividu;
    }

    public void setIdIndividu(int idIndividu) {
        this.idIndividu = idIndividu;
    }

    public String getNomIndividu() {
        return nomIndividu;
    }

    public void setNomIndividu(String nomIndividu) {
        this.nomIndividu = nomIndividu;
    }

    public String getPrenomIndividu() {
        return prenomIndividu;
    }

    public void setPrenomIndividu(String prenomIndividu) {
        this.prenomIndividu = prenomIndividu;
    }

    public String getGenreIndividu() {
        return genreIndividu;
    }

    public void setGenreIndividu(String genreIndividu) {
        this.genreIndividu = genreIndividu;
    }

    public Date getDatNaisIndividu() {
        return datNaisIndividu;
    }

    public void setDatNaisIndividu(Date datNaisIndividu) {
        this.datNaisIndividu = datNaisIndividu;
    }

    public String getLieuNaisIndividu() {
        return lieuNaisIndividu;
    }

    public void setLieuNaisIndividu(String lieuNaisIndividu) {
        this.lieuNaisIndividu = lieuNaisIndividu;
    }

    public String getNivEtudIndividu() {
        return nivEtudIndividu;
    }

    public void setNivEtudIndividu(String nivEtudIndividu) {
        this.nivEtudIndividu = nivEtudIndividu;
    }

    public String getDomEtudIndividu() {
        return domEtudIndividu;
    }

    public void setDomEtudIndividu(String domEtudIndividu) {
        this.domEtudIndividu = domEtudIndividu;
    }

    public String getProfIndividu() {
        return profIndividu;
    }

    public void setProfIndividu(String profIndividu) {
        this.profIndividu = profIndividu;
    }



    public String getLangMatIndividu() {
        return langMatIndividu;
    }

    public void setLangMatIndividu(String langMatIndividu) {
        this.langMatIndividu = langMatIndividu;
    }

    public String getLangParlIndividu() {
        return langParlIndividu;
    }

    public void setLangParlIndividu(String langParlIndividu) {
        this.langParlIndividu = langParlIndividu;
    }

    public String getPhotoIndividu() {
        return photoIndividu;
    }

    public void setPhotoIndividu(String photoIndividu) {
        this.photoIndividu = photoIndividu;
    }

    public String getRectoPIDIndividu() {
        return rectoPIDIndividu;
    }

    public void setRectoPIDIndividu(String rectoPIDIndividu) {
        this.rectoPIDIndividu = rectoPIDIndividu;
    }

    public String getVersoPIDIndividu() {
        return versoPIDIndividu;
    }

    public void setVersoPIDIndividu(String versoPIDIndividu) {
        this.versoPIDIndividu = versoPIDIndividu;
    }
     
     
     
    
}
