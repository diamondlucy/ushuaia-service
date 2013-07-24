package lucy.ushuaia.api.resource;

import lucy.ushuaia.api.domain.Project;
import lucy.ushuaia.api.service.ProjectService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("project")
public class ProjectResource {
    ProjectService projectService = new ProjectService();

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Project getAsXML(@PathParam("id") String id) {
        return projectService.get(id);
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAsText(@PathParam("id") String id) {
        Project project = projectService.get(id);
        return String.format("Project: id=%s, name=%s", project.getId(), project.getName());
    }
}
