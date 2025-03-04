package tests.metodists_rf_task_tracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class TaskDto {
    private Long id;

    private String name;

    @JsonProperty("created_at")
    private Instant createdAt;

    private String description;

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

    public TaskDto(Long id, String name, Instant createdAt, String description) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.description = description;
    }


    public static TaskDto.TaskDtoBuilder builder() {
        return new TaskDto.TaskDtoBuilder();
    }

    public static class TaskDtoBuilder {
        private Long id;
        private String name;
        private Instant createdAt;
        private String description;

        public TaskDto.TaskDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public TaskDto.TaskDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TaskDto.TaskDtoBuilder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public TaskDto.TaskDtoBuilder description(String description) {
            this.description = description;
            return this;
        }

        public TaskDto build() {
            return new TaskDto(id, name, createdAt, description);
        }
    }
}
