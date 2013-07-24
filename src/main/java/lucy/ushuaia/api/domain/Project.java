package lucy.ushuaia.api.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "story")
public class Project {
    @XmlElement
    private String id;
    @XmlElement
    private String name;

    public Project() {
    }

    public Project(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
