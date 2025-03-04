package tests.metodists_rf_task_tracker.store.entities;

import jakarta.persistence.*;

import java.time.Instant;

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
}
