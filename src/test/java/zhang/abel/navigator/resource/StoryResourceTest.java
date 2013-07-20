package zhang.abel.navigator.resource;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class StoryResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(StoryResource.class);
    }

    @Test
    public void should_get_story_as_text_plain() {
        String result = target("story/default").request(MediaType.TEXT_PLAIN).get(String.class);

        assertThat(result, is(notNullValue()));
    }
}
