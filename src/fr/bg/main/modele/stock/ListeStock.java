/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.modele.stock;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author lyess
 * @param <S>
 */


public class ListeStock<S> implements Collection{
    
    
    //Les liste important
    
     private HashSet<S> metier ;
     private HashSet<S> asupprimer ;
     private HashSet<S> amodifier ;
     private HashSet<S> ainserer  ;

 
     
     // Le constructeur par default
public ListeStock(){
        metier = new HashSet<>();
	asupprimer = new HashSet<>();
	amodifier = new HashSet<>();
	ainserer  = new HashSet<>();
}
    


    // getters and setters

    public HashSet<S> getMetier() {
        return metier;
    }

    public void setMetier(HashSet<S> metier) {
        this.metier = metier;
    }

    public HashSet<S> getAsupprimer() {
        return asupprimer;
    }

    public void setAsupprimer(HashSet<S> asupprimer) {
        this.asupprimer = asupprimer;
    }

    public HashSet<S> getAmodifier() {
        return amodifier;
    }

    public void setAmodifier(HashSet<S> amodifier) {
        this.amodifier = amodifier;
    }

    public HashSet<S> getAinserer() {
        return ainserer;
    }

    
    public void setAinserer(HashSet<S> ainserer) {
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
    
    
    
     /*
       * Ajout l'objet dans notre liste métier pour qu'il apparait dans notre interface
       * et dans la liste a inserer pour la parcourir au moment de l'enregistrement du travail 
       */
    
     @Override
    public boolean add(Object e) {
      
        try{
            if(!this.getMetier().contains((S)e)){
                    this.getMetier().add((S)e);
                   this.getAinserer().add((S)e);
                   return true;   
            }
        }catch(Exception exception){
            
            System.out.println(exception);
        }
        return false;
    }
    
    
    
    /*
       * Supression de l'objet de notre liste métier pour qu'il n'apparait plus dans notre interface
       * et l'ajouter a la  la liste a supprimer pour la parcourir au moment de l'enregistrement du travail 
       */
    
     @Override
    public boolean remove(Object o) {
        
        try{
            if(this.getMetier().contains((S)o)){
                    this.asupprimer.add((S)o);
                    this.metier.remove((S)o);
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
           Iterator<S> it = clctn.iterator();
         try{
             while(it.hasNext()){
               S entite = it.next();
               this.add(entite);
           }return true;
         }catch(Exception ex){
             System.out.println(ex);
             return false;
         }
           
    }

    @Override
    public boolean removeAll(Collection clctn) {
                 Iterator<S> it = clctn.iterator();
         try{
             while(it.hasNext()){
               S entite = it.next();
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
