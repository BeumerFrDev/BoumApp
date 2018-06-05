/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modele;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Ouadie
 * @param <T>
 */
public class ListPro<T> implements Collection {

    /**
     * les differentes liste qu'on va travailler dessus pour 
     * extraire tout nos donners si on veut et pour tracker
     * les differents actions afin de les enregistrer dans notre base 
     */
private HashSet<T> metier  ;
private HashSet<T> asupprimer ;
private HashSet<T> amodifier ;
private HashSet<T> ainserer  ;


//le constructeur par defaut de la liste

public ListPro(){
        metier = new HashSet<>();
	asupprimer = new HashSet<>();
	amodifier = new HashSet<>();
	ainserer  = new HashSet<>();
}



    public HashSet<T> getMetier() {
        return metier;
    }

    public void setMetier(HashSet<T> metier) {
        this.metier = metier;
    }

    public HashSet<T> getAsupprimer() {
        return asupprimer;
    }

    public void setAsupprimer(HashSet<T> asupprimer) {
        this.asupprimer = asupprimer;
    }

    public HashSet<T> getAmodifier() {
        return amodifier;
    }

    public void setAmodifier(HashSet<T> amodifier) {
        this.amodifier = amodifier;
    }

    public HashSet<T> getAinserer() {
        return ainserer;
    }

    public void setAinserer(HashSet<T> ainserer) {
        this.ainserer = ainserer;
    }



    @Override
    public int size() {
        return this.metier.size();
    }

    @Override
    public boolean isEmpty() {
        return this.metier.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
       return this.metier.contains(o);
    }
    
    @Override
    public boolean add(Object e) {
      /*
       * Ajout l'objet dans notre liste métier pour qu'il apparait dans notre interface
       * et dans la liste a inserer pour la parcourir au moment de l'enregistrement du travail 
       */
        try{
            if(!this.getMetier().contains((T)e)){
                    this.getMetier().add((T)e);
                   this.getAinserer().add((T)e);
                   return true;   
            }
        }catch(Exception exception){
            
            System.out.println(exception);
        }
        return false;
    }
    
    @Override
    public boolean remove(Object o) {
        /*
       * Supression de l'objet de notre liste métier pour qu'il n'apparait plus dans notre interface
       * et l'ajouter a la  la liste a supprimer pour la parcourir au moment de l'enregistrement du travail 
       */
        try{
            if(this.getMetier().contains((T)o)){
                    this.asupprimer.add((T)o);
                    this.metier.remove((T)o);
                   return true;   
            }
        }catch(Exception exception){
            
            System.out.println(exception);
        }
        return false;    
    }

    @Override
    public boolean containsAll(Collection clctn) {
       return this.metier.containsAll(clctn);
    }

    @Override
    public boolean addAll(Collection clctn) {
           Iterator<T> it = clctn.iterator();
         try{
             while(it.hasNext()){
               T entite = it.next();
               this.add(entite);
           }return true;
         }catch(Exception ex){
             System.out.println(ex);
             return false;
         }
           
    }

    @Override
    public boolean removeAll(Collection clctn) {
                 Iterator<T> it = clctn.iterator();
         try{
             while(it.hasNext()){
               T entite = it.next();
               this.remove(entite);
           }return true;
         }catch(Exception ex){
             System.out.println(ex);
             return false;
         }
    }

    @Override
    public boolean retainAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
          metier = new HashSet <>();
	asupprimer = new HashSet<>();
	amodifier = new HashSet<>();
	ainserer  = new HashSet<>();
    }

    @Override
    public Iterator iterator() {
        return this.metier.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.metier.toArray();
    }

    @Override
    public Object[] toArray(Object[] ts) {
        return this.metier.toArray(ts);

    }

    @Override
    public boolean removeIf(Predicate prdct) {
        return Collection.super.removeIf(prdct); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spliterator spliterator() {
        return Collection.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stream stream() {
        return Collection.super.stream(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stream parallelStream() {
        return Collection.super.parallelStream(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(Consumer cnsmr) {
        Collection.super.forEach(cnsmr); //To change body of generated methods, choose Tools | Templates.
    }


}
