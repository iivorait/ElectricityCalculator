package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

// @ApplicationScoped
@Path("/")
@RegisterRestClient
public interface TemperatureAPI {

    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    String getTemperature();
}