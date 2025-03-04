package tests.metodists_rf_task_tracker.api.factories;

import org.springframework.stereotype.Component;
import tests.metodists_rf_task_tracker.api.dto.TaskStateDto;
import tests.metodists_rf_task_tracker.store.entities.TaskStateEntity;

@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {

        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .ordinal(entity.getOrdinal())
                .description(entity.getDescription())
                .build();
    }
}
