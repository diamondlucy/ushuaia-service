package lucy.ushuaia.api.repository;

import lucy.ushuaia.api.domain.Story;

import java.util.HashMap;
import java.util.Map;

public class StoryRepository {
    private static Map<String, Story> FAKE_DATA_STORE = new HashMap<>();

    static {
        FAKE_DATA_STORE.put("default", new Story("default", "default story", "content of default story"));
    }

    public void save(Story story) {
        FAKE_DATA_STORE.put(story.getId(), story);
    }

    public Story get(String id) {
        return FAKE_DATA_STORE.get(id);
    }
}
