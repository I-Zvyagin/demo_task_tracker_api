package tests.metodists_rf_task_tracker.store.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String name;
    private Instant createdAt = Instant.now();
    private String description;

    public TaskEntity(Long id, String name, Instant createdAt, String description) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.description = description;
    }

    public TaskEntity() {
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


    public static TaskEntityBuilder builder() {
        return new TaskEntityBuilder();
    }

    public static class TaskEntityBuilder {
        private Long id;
        private String name;
        private Instant createdAt;
        private String description;

        public TaskEntityBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public TaskEntityBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TaskEntityBuilder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public TaskEntityBuilder description(String description) {
            this.description = description;
            return this;
        }

        public TaskEntity build() {
            return new TaskEntity(id, name, createdAt, description);
        }
    }
}
