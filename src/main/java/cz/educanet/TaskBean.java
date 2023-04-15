package cz.educanet;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.*;

import java.util.List;

@RequestScoped
@Named
public class TaskBean {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyUserApp");


    public void add(String title, TaskType taskType) {
        EntityManager em = emf.createEntityManager();

        TaskEntity ae = new TaskEntity();
        ae.setTitle(title);
        ae.setType(taskType);

        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(ae);
        et.commit();
        em.close();
    }


    public List<TaskEntity> getAll() {
        EntityManager em = emf.createEntityManager();

        TypedQuery<TaskEntity> result = em.createQuery("select task from TaskEntity as task", TaskEntity.class);
        return result.getResultList();
    }
}
