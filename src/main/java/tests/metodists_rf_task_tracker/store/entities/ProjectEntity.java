package tests.metodists_rf_task_tracker.store.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String name;

    private Instant createdAt = Instant.now();
    @OneToMany
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private List<TaskStateEntity> taskStates = new ArrayList<>();

    public ProjectEntity(Long id, String name, Instant createdAt, List<TaskStateEntity> taskStates) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.taskStates = taskStates;
    }

    public ProjectEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public List<TaskStateEntity> getTaskStates() {
        return taskStates;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setTaskStates(List<TaskStateEntity> taskStates) {
        this.taskStates = taskStates;
    }


     public static ProjectEntityBuilder builder() {
        return new ProjectEntityBuilder();
     }

     public static class ProjectEntityBuilder {
         private Long id;
         private String name;
         private Instant createdAt;
         private List<TaskStateEntity> taskStates;

         public ProjectEntityBuilder id(Long id) {
             this.id = id;
             return this;
         }

         public ProjectEntityBuilder name(String name) {
             this.name = name;
             return this;
         }

         public ProjectEntityBuilder createdAt(Instant createdAt) {
             this.createdAt = createdAt;
             return this;
         }

         public ProjectEntityBuilder taskStates(List<TaskStateEntity> taskStates) {
             this.taskStates = taskStates;
             return this;
         }

         public ProjectEntity build() {
             return new ProjectEntity(id, name, createdAt, taskStates);
         }
     }
}
