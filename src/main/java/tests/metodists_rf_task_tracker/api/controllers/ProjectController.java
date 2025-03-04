package tests.metodists_rf_task_tracker.api.controllers;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;
import tests.metodists_rf_task_tracker.api.dto.ProjectDto;
import tests.metodists_rf_task_tracker.api.exceptions.BadRequestException;
import tests.metodists_rf_task_tracker.api.factories.ProjectDtoFactory;
import tests.metodists_rf_task_tracker.store.repositories.ProjectRepository;

@Transactional
@RestController
public class ProjectController {

    private final ProjectRepository projectRepository;

    private final ProjectDtoFactory projectDtoFactory;

    public ProjectController(ProjectRepository projectRepository, ProjectDtoFactory projectDtoFactory) {
        this.projectRepository = projectRepository;
        this.projectDtoFactory = projectDtoFactory;
    }


    public static final String CREATE_PROJECT = "/api/projects{project_id}/tasks";
    @PostMapping(CREATE_PROJECT)
    public ProjectDto createProject(@RequestParam String name) {

        projectRepository
                .findByName(name)
                .ifPresent(project -> {
                    throw new BadRequestException(String.format("Project \"%s\" already exists.", name));
                });

        throw new BadRequestException(String.format("Project \"%s\" already exists.", name));

        //TODO: uncomment and insert entity in method
        //return projectDtoFactory.makeProjectDto();
        //return null;
    }
}
