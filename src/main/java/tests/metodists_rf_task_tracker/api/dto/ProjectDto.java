package tests.metodists_rf_task_tracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class ProjectDto {
    private Long id;

    private String name;

    @JsonProperty("created_at")
    private Instant createdAt;

    public ProjectDto(Long id, String name, Instant createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
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


    public static ProjectDtoBuilder builder() {
        return new ProjectDtoBuilder();
    }

    public static class ProjectDtoBuilder {
        private Long id;
        private String name;
        private Instant createdAt;

        public ProjectDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProjectDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProjectDtoBuilder createdAt(Instant createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public ProjectDto build() {
            return new ProjectDto(id, name, createdAt);
        }
    }
}
