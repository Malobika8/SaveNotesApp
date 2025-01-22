package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Topic {
    @Id
    private int id;

    @Column(name = "topicName")
    private String name;

    @OneToMany
    List<Note> list;

    public Topic(int id, String name, List<Note> list) {
        this.id = id;
        this.name = name;
        this.list = list;
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

    public List<Note> getList() {
        return list;
    }

    public void setList(List<Note> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
