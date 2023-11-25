package com.example.gestiondepedidoshibernate.domain;

import lombok.extern.java.Log;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Clase de utilidad para configurar y proporcionar la SessionFactory de Hibernate.
 */
@Log
public class HibernateUtil {
    private static SessionFactory sf = null;

    static {
        try {
            Configuration cfg = new Configuration();
            cfg.configure();
            sf = cfg.buildSessionFactory();
            log.info("SessionFactory creada con éxito!");
        } catch (Exception ex) {
            log.severe("Error al crear SessionFactory()");
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Obtiene la SessionFactory configurada.
     * @return La SessionFactory de Hibernate.
     */
    public static SessionFactory getSessionFactory() {
        return sf;
    }
}