package lucy.ushuaia.api.resource;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import javax.ws.rs.core.Application;

public class ResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig().packages(true, "lucy.ushuaia.api.resource");
    }

}
