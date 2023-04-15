package cz.educanet;

public enum TaskType {

    BACKLOG(0),
    IN_PROGRESS(1),
    IN_REVIEW(2),
    TEST(3),
    FINISHED(4);

    private int id;

    TaskType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}


