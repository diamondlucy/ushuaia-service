package zhang.abel.navigator.resource;

import zhang.abel.navigator.domain.Story;
import zhang.abel.navigator.repository.StoryRepository;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Singleton
@Path("story")
public class StoryResource {

    private StoryRepository storyRepository = new StoryRepository();

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Story getAsXML(@PathParam("id") String id) {
        return storyRepository.get(id);
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.TEXT_HTML})
    public String getAsText(@PathParam("id") String id) {
        Story story = storyRepository.get(id);
        return String.format("id=%s, title=%s, content=%s", story.getId(), story.getTitle(), story.getContent());
    }

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public Response put(Story story) {
        storyRepository.save(story);
        return Response.ok().build();
    }
}
