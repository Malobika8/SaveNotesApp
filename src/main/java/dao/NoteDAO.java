package dao;

import entity.Note;
import entity.Topic;
import jakarta.persistence.Query;
import org.hibernate.Session;

import java.util.List;

public class NoteDAO {

    public void saveNotesByTopic(Topic topic, Session session) {
        session.save(topic);
    }

    public List<Note> getNotesByTopicId(int topicId, Session session) {
        Query query = session.createQuery("from Note where topic.id = :tid", Note.class);
        query.setParameter("tid", topicId);
        List<Note> list = query.getResultList();

        return list;
    }

    public List<Note> getNoteByNoteId(int noteId, Session session) {
        Query query = session.createQuery("from Note where id = :nid", Note.class);
        query.setParameter("nid", noteId);

        List<Note> noteList = query.getResultList();

        return noteList;
    }

    public void updateNotesByNoteId(int noteId, Session session) {
        Query query = session.createQuery("update Note set note = :n where id = :nid");
        query.setParameter("n", "Buy fruits");
        query.setParameter("nid", noteId);
        int result = query.executeUpdate(); // Executes the update query
        System.out.println("Rows affected: " + result);

        System.out.println("Updated..");
    }

    public void deleteTopic(int topicId, Session session) {
        Query query = session.createQuery("delete from Topic where id = :tid");
        query.setParameter("tid", topicId);
        int result = query.executeUpdate(); // Executes the update query
        System.out.println("Rows affected: " + result);
    }

    public void deleteNoteByNoteId(int noteId, Session session) {
        Query query = session.createQuery("delete from Note where id = :nid");
        query.setParameter("nid", noteId);
        int result = query.executeUpdate(); // Executes the update query
        System.out.println("Rows affected: " + result);
    }

    public void deleteNotesByTopicId(int topicId, Session session) {
        Query query = session.createQuery("delete from Note where topic.id = :tid");
        query.setParameter("tid", topicId);
        int result = query.executeUpdate(); // Executes the update query
        System.out.println("Rows affected: " + result);
    }
}
