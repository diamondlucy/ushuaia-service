package zhang.abel.navigator.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "story")
public class Story {
    @XmlElement
    private String id;
    @XmlElement
    private String title;
    @XmlElement
    private String content;

    public Story() {
    }

    public Story(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
