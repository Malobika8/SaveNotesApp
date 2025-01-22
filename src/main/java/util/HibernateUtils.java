package util;

import entity.Note;
import entity.Topic;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Note.class);
            configuration.addAnnotatedClass(Topic.class);
            sessionFactory = configuration.buildSessionFactory();
        }

        return sessionFactory;
    }
}
