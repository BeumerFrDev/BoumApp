
package fr.bg.main.modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;


public class Adresses {
  private int idAdresse;

  private int batAdresse;
  private int noAdresse;
  private String rueAdresse; 
  private int cpAdresse;
  private String villeAdresse;
  private String paysAdresse;
  
//liste et methode statique pour enregistrer nos données 
  
  public static final ListPro<Adresses> listeAdresse = new ListPro<Adresses>();
   
    {
        this.listeAdresse.add(this);
    }
  
        //pour definir a chaque fois les ID
    public static int definirId(){
        Iterator it = listeAdresse.iterator();
        
        //année actuelle 
       
        int annee =Calendar.getInstance().get(Calendar.YEAR);
        
        Adresses adressePlusGrandId=null;
        boolean vide =true;
        if(it.hasNext())  adressePlusGrandId=  (Adresses) it.next();
        while(it.hasNext()){
            Adresses ads = (Adresses) it.next();
            vide=false;
            if(ads.getIdAdresse()>adressePlusGrandId.getIdAdresse()) adressePlusGrandId =ads;
        }
            
            if(vide) {System.out.println((annee *10)+1);return ((annee *100000)+1);}
            else {System.out.println(adressePlusGrandId.getIdAdresse()+1);return adressePlusGrandId.getIdAdresse()+1;}
        
        
    }
    
    public static ArrayList<Adresses> of(String id ){
        Iterator it = listeAdresse.iterator();
        ArrayList<Adresses> listRecherche=null;
        while(it.hasNext()){
            Adresses ads = (Adresses) it.next();
            String idd = ads.getIdAdresse()+"";
            if(idd.indexOf(id)!=0){
                
                listRecherche.add(ads);
            }
        }
        return listRecherche;
    }
    
  public Adresses(){
      
  }
      public Adresses(int idAdresse, int batAdresse, int noAdresse, String rueAdresse, int cpAdresse, String villeAdresse, String paysAdresse) {
        this.idAdresse = idAdresse;
      
        this.batAdresse = batAdresse;
        this.noAdresse = noAdresse;
        this.rueAdresse = rueAdresse;
        this.cpAdresse = cpAdresse;
        this.villeAdresse = villeAdresse;
        this.paysAdresse = paysAdresse;
    }
      public Adresses(  int batAdresse, int noAdresse, String rueAdresse, int cpAdresse, String villeAdresse, String paysAdresse) {
        this.idAdresse = idAdresse;
         this.idAdresse = Adresses.definirId();
        this.batAdresse = batAdresse;
        this.noAdresse = noAdresse;
        this.rueAdresse = rueAdresse;
        this.cpAdresse = cpAdresse;
        this.villeAdresse = villeAdresse;
        this.paysAdresse = paysAdresse;
    }

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }



 

    public int getBatAdresse() {
        return batAdresse;
    }

    public void setBatAdresse(int batAdresse) {
        this.batAdresse = batAdresse;
    }

    public int getNoAdresse() {
        return noAdresse;
    }

    public void setNoAdresse(int noAdresse) {
        this.noAdresse = noAdresse;
    }

    public String getRueAdresse() {
        return rueAdresse;
    }

    public void setRueAdresse(String rueAdresse) {
        this.rueAdresse = rueAdresse;
    }

    public int getCpAdresse() {
        return cpAdresse;
    }

    public void setCpAdresse(int cpAdresse) {
        this.cpAdresse = cpAdresse;
    }

    public String getVilleAdresse() {
        return villeAdresse;
    }

    public void setVilleAdresse(String villeAdresse) {
        this.villeAdresse = villeAdresse;
    }

    public String getPaysAdresse() {
        return paysAdresse;
    }

    public void setPaysAdresse(String paysAdresse) {
        this.paysAdresse = paysAdresse;
    }
    
    
    
    
    
   
    
}
