/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.Utils;

import org.hibernate.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Ouadie
 */
public abstract class AbstractDAO<T> {

    private Class<T> entity;
    protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public AbstractDAO(Class<T> entity) {
        this.entity = entity;
     
  
    
    }

    public List<T> findAll() {
        List<T> result = null;
        Session session = null;
        Transaction transaction = null;
        try { 
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            
            result = session.createQuery("from " + entity.getName()).list();
            System.out.println( session.createQuery("from " + entity.getName()));
            transaction.commit();
        } catch (Exception e) {e.printStackTrace();
            result = null;
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public T find(Object id) {
        T result = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            result = (T) session.get(entity, (Serializable) id);
            transaction.commit();
        } catch (Exception e) {
            result = null;
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public boolean create(T entity) {
        boolean result = true;
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (Exception e) {
            result = false;
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public boolean update(T entity) {
        boolean result = true;
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(entity);
            transaction.commit();
        } catch (Exception e) {
            result = false;
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public boolean delete(T entity) {
        boolean result = true;
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            result = false; 
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

}
