import dao.NoteDAO;
import entity.Note;
import entity.Topic;

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

        NoteDAO noteDAO = new NoteDAO();

        //save topic
        noteDAO.saveNotesByTopic(topic);
    }
}
