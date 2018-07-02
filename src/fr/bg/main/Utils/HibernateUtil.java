/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.bg.main.Utils;

import org.hibernate.*;

import org.hibernate.boot.registry.*;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                    .configure("fr/bg/main/Utils/hibernate.cfg.xml")
                    .build();
            Metadata metaData = new MetadataSources(
                    standardRegistry)
                    .getMetadataBuilder()
                    .build();
            sessionFactory = metaData.getSessionFactoryBuilder().build();
        } catch (Throwable th) {
            throw new ExceptionInInitializerError(th);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;

    }
}
