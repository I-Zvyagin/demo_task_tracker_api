package tests.metodists_rf_task_tracker.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tests.metodists_rf_task_tracker.store.entities.RoleEntity;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {

    Optional<RoleEntity> findByName(String name);

}
