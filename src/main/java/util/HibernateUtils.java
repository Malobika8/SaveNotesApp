package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure("src/main/resources/hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        }

        return sessionFactory;
    }
}
