package tests.metodists_rf_task_tracker.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tests.metodists_rf_task_tracker.store.entities.ProjectEntity;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

    Optional<ProjectEntity> findByName(String name);

}
