/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main;

import fr.bg.main.modele.Parc.Parc;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Ouadie
 */

 
public class TestHibernate {
public static void main(String args[]) throws Exception {
Configuration config = new Configuration();
  config.addClass(Parc.class); /*addClass*/
SessionFactory sessionFactory = config.buildSessionFactory();
Session session = sessionFactory.openSession();
Transaction tx = null;
try {
tx = session.beginTransaction();
Parc personne = new Parc(new Long(1), "prenom3");
session.save(personne);
session.flush() ;
tx.commit();
} catch (Exception e) {
if (tx != null) {
tx.rollback();
}
throw e;
} finally {
session.close();
}
sessionFactory.close();
}

}
