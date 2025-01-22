package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topicId")
    private int id;

    @Column(name = "topicName")
    private String name;

    @OneToMany(mappedBy = "topic" , cascade = CascadeType.ALL)
    List<Note> noteList;

    public Topic(int id, String name, List<Note> noteList) {
        this.id = id;
        this.name = name;
        this.noteList = noteList;
    }

    public Topic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noteList=" + noteList +
                '}';
    }
}
