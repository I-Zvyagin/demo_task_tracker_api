package tests.metodists_rf_task_tracker.api.factories;

import org.springframework.stereotype.Component;
import tests.metodists_rf_task_tracker.api.dto.TaskDto;
import tests.metodists_rf_task_tracker.store.entities.TaskEntity;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity entity) {

        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .description(entity.getDescription())
                .build();

    }
}
