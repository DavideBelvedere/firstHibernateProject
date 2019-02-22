package restExample;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;

public class RequestObject implements Serializable { // deve essere serializable
    private String id;

    @JsonGetter
    public String getId() {
        return id;
    }

    @JsonSetter
    public void setId(String id) {
        this.id = id;
    }
}
