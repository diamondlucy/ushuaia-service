package lucy.ushuaia.api.service;

import lucy.ushuaia.api.domain.Project;
import lucy.ushuaia.api.repository.ProjectRepository;

import javax.ws.rs.NotFoundException;

public class ProjectService {

    ProjectRepository repository = new ProjectRepository();

    public Project get(String id) {
        Project project = repository.get(id);
        if(project == null) {
            throw new NotFoundException();
        }
        return project;
    }
}
