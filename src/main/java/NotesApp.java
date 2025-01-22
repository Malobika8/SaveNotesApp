import dao.NoteDAO;
import entity.Note;
import entity.Topic;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtils;

import java.util.ArrayList;
import java.util.List;

public class NotesApp {
    public static void main(String[] args) {
        Topic topic = new Topic();
        topic.setName("ToDo");

        Note note1 = new Note();
        note1.setNote("Buy groceries");
        note1.setTopic(topic);

        Note note2 = new Note();
        note2.setNote("Buy notebooks");
        note2.setTopic(topic);

        List<Note> noteList = new ArrayList<Note>();
        noteList.add(note1);
        noteList.add(note2);

        topic.setNoteList(noteList);

        // Main program starts
        NoteDAO noteDAO = new NoteDAO();

        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        //save topic
        noteDAO.saveNotesByTopic(topic, session);

        //getNotesByTopicId
        int topicId = 1;
        List<Note> notes1 = noteDAO.getNotesByTopicId(topicId, session);
        System.out.println("No of notes by topic id " + topicId + ":" + notes1.size());

        //getNoteByNoteId
        int noteId = 2;
        List<Note> notes2 = noteDAO.getNoteByNoteId(noteId, session);
        System.out.println("Notes by note id " + topicId + ":" + notes2.size());

        //updateNotesByNoteId
        noteDAO.updateNotesByNoteId(noteId, session);

        //deleteNoteByNoteId
        noteDAO.deleteNoteByNoteId(noteId, session);

        //deleteNotesByTopicId
        noteDAO.deleteNotesByTopicId(topicId, session);

        //deleteTopic
        noteDAO.deleteTopic(topicId, session);

        transaction.commit();
        session.close();
        //Program ends
    }
}
