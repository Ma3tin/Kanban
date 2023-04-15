package cz.educanet;

import jakarta.persistence.*;

@Entity
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private TaskType type;

    public void setDiffTask(int id) {
        if (id == 1) setType(TaskType.IN_PROGRESS);
        if (id == 2) setType(TaskType.IN_REVIEW);
        if (id == 3) setType(TaskType.TEST);
        if (id == 4) setType(TaskType.FINISHED);
        else setType(TaskType.BACKLOG);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }
}
