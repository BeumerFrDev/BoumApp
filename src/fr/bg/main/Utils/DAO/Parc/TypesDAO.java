/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.Utils.DAO.Parc;

import fr.bg.main.Utils.AbstractDAO;
import fr.bg.main.modele.Parc.Types;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ouadie
 */
public class TypesDAO extends AbstractDAO<Types> {

    public TypesDAO() {
        super(Types.class);
    }

    public  Types findByReference(String id) {
        Types type;
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("from Types where referenceType = :id");
            query.setParameter("id", id);
            type = (Types) query.uniqueResult();
            transaction.commit();
        } catch (Exception e) {
            type = null;
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return type;
    }
}
