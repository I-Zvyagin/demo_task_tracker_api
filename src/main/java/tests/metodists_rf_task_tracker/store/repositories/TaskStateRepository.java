package tests.metodists_rf_task_tracker.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tests.metodists_rf_task_tracker.store.entities.TaskStateEntity;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity, Long> {
}
