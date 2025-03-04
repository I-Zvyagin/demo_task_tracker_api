package tests.metodists_rf_task_tracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class TaskStateDto {

    private Long id;

    private String name;

    private Long ordinal;

    @JsonProperty("created_at")
    private Instant createdAt;

    private String description;

    public TaskStateDto(Long id, String name, Long ordinal, Instant createdAt, String description) {
        this.id = id;
        this.name = name;
        this.ordinal = ordinal;
        this.createdAt = createdAt;
        this.description = description;
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


    public static TaskStateDto.TaskStateDtoBuilder builder() {
        return new TaskStateDto.TaskStateDtoBuilder();
    }

    public static class TaskStateDtoBuilder {
        private Long id;
        private String name;
        private Long ordinal;
        private Instant createdAt;
        private String description;

        public TaskStateDto.TaskStateDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public TaskStateDto.TaskStateDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TaskStateDto.TaskStateDtoBuilder ordinal(Long ordinal) {
            this.ordinal = ordinal;
            return this;
        }

        public TaskStateDto.TaskStateDtoBuilder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public TaskStateDto.TaskStateDtoBuilder description(String description) {
            this.description = description;
            return this;
        }

        public TaskStateDto build() {
            return new TaskStateDto(id, name, ordinal, createdAt, description);
        }
    }
}
