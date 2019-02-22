package restExample;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class LogisticaCrudService {

   /* @Inject
    CorriereDaoImpl corriereDao;*/

    @POST
    @Path("/getFiles")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseSample retrieveFiles(RequestObject request) {
        ResponseSample sample= new ResponseSample();
        sample.setRisposta(request.getId());
        return sample;
    }

    @GET
    @Path("/ciao")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseSample retrieveFiles() {
        ResponseSample sample= new ResponseSample();
        sample.setRisposta("ciao");
        return sample;
    }

}
