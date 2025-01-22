package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class NoteDAO {

    public void saveNotesByTopic() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.close();
    }

    public void getNotesByTopicId() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.close();
    }

    public void getNoteByNoteId() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.close();
    }

    public void updateNotesByNoteId() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.close();
    }

    public void deleteTopic() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.close();
    }

    public void deleteNoteByNoteId() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.close();
    }

    public void deleteNotesByTopicId() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.close();
    }
}
