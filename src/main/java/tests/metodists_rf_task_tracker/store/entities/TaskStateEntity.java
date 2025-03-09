package tests.metodists_rf_task_tracker.store.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "task_state")
public class TaskStateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String name;

    private Long ordinal;

    private Instant createdAt = Instant.now();
    private String description;
    @OneToMany
    @JoinColumn(name = "task_state_id", referencedColumnName = "id")
    private List<TaskEntity> tasks = new ArrayList<>();

    public TaskStateEntity(Long id, String name, Long ordinal, Instant createdAt, String description, List<TaskEntity> tasks) {
        this.id = id;
        this.name = name;
        this.ordinal = ordinal;
        this.createdAt = createdAt;
        this.description = description;
        this.tasks = tasks;
    }

    public TaskStateEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Long ordinal) {
        this.ordinal = ordinal;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TaskEntity> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskEntity> tasks) {
        this.tasks = tasks;
    }


    public static TaskStateEntityBuilder builder() {
        return new TaskStateEntityBuilder();
    }

    public static class TaskStateEntityBuilder {
        private Long id;
        private String name;
        private Long ordinal;
        private Instant createdAt;
        private String description;
        private List<TaskEntity> tasks;

        public TaskStateEntityBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public TaskStateEntityBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TaskStateEntityBuilder ordinal(Long ordinal) {
            this.ordinal = ordinal;
            return this;
        }

        public TaskStateEntityBuilder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public TaskStateEntityBuilder description(String description) {
            this.description = description;
            return this;
        }

        public TaskStateEntityBuilder tasks(List<TaskEntity> tasks) {
            this.tasks = tasks;
            return this;
        }

        public TaskStateEntity build() {
            return new TaskStateEntity(id, name, ordinal, createdAt, description, tasks);
        }
    }
}
