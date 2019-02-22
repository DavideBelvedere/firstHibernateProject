package restExample;

import java.io.Serializable;

public class ResponseSample implements Serializable { //deve essere serializable però importando nel pom fater jackson
   private String risposta;

    public String getRisposta() {
        return risposta;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }
}
