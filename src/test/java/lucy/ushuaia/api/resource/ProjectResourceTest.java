package lucy.ushuaia.api.resource;

import lucy.ushuaia.api.domain.Project;
import lucy.ushuaia.api.repository.ProjectRepository;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class ProjectResourceTest extends ResourceTest {
    @Test
    public void should_get_project_as_xml() {
        Project project = target("project/P01").request(MediaType.APPLICATION_XML).get(Project.class);

        assertThat(project, is(notNullValue()));
        assertThat(project.getId(), is("P01"));
        assertThat(project.getName(), is("Ushuaia"));
    }

    @Test
    public void should_get_project_as_text() {
        String project = target("project/P01").request(MediaType.TEXT_PLAIN).get(String.class);

        assertThat(project, is(notNullValue()));
    }

}
