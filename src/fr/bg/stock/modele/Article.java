/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.stock.modele;

/**
 *
 * @author lyess
 */
public class Article {
   private int idArticle;
   private String nomArticle;
   private String libelleArticle;
   private String refStockArticle;
   private int qteStock; 
   TypeArticle type;
   Fournisseur fournisseur;
   Rayon rayon;
}

