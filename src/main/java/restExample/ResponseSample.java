package restExample;

import java.io.Serializable;

public class ResponseSample implements Serializable {
   private String risposta;

    public String getRisposta() {
        return risposta;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }
}
