package restExample;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class RestEasyServices extends Application { // va messa la classe nel web.xml, qua vanno incluse tutte le classi che espongono servizi

    private Set<Object> singletons = new HashSet<Object>();

    public RestEasyServices() {
        singletons.add(new LogisticaCrudService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
