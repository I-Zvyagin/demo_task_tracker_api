package tests.metodists_rf_task_tracker.store.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    @OneToMany
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private List<UserEntity> userEntities = new ArrayList<>();

    public RoleEntity(Integer id, String name, List<UserEntity> userEntities) {
        this.id = id;
        this.name = name;
        this.userEntities = userEntities;
    }

    public RoleEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<UserEntity> userEntities) {
        this.userEntities = userEntities;
    }


    public static RoleEntityBuilder builder() {
        return new RoleEntityBuilder();
    }

    public static class RoleEntityBuilder {
        private Integer id;
        private String name;
        private List<UserEntity> userEntities;

        public RoleEntityBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public RoleEntityBuilder name(String name) {
            this.name = name;
            return this;
        }

        public RoleEntityBuilder userEntities(List<UserEntity> userEntities) {
            this.userEntities = userEntities;
            return this;
        }

        public RoleEntity build() {
            return new RoleEntity(id, name, userEntities);
        }
    }
}
