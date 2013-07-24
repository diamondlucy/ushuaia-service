package lucy.ushuaia.api.repository;

import lucy.ushuaia.api.domain.Project;

import java.util.HashMap;
import java.util.Map;

public class ProjectRepository {

    private static Map<String, Project> DEMO_PROJECTS = new HashMap<>();
    static {
        DEMO_PROJECTS.put("P01", new Project("P01", "Ushuaia"));
        DEMO_PROJECTS.put("P02", new Project("P02", "Tile"));
    }

    public Project get(String id) {
        return DEMO_PROJECTS.get(id);
    }

    public Project save(Project project) {
        DEMO_PROJECTS.put(project.getId(), project);
        return project;
    }
}
