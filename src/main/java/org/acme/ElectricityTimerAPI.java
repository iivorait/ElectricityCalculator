package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.acme.models.TimerResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

// @ApplicationScoped
@Path("/")
@RegisterRestClient
public interface ElectricityTimerAPI {

    @GET
    @Path("calculate")
    //@Produces("PriceList.class")
    TimerResponse getTiming(
        @QueryParam("minutes") int minutes, 
        @QueryParam("blocks") int blocks, 
        @QueryParam("minprice") float minprice,
        @QueryParam("cheapmode") int cheapmode);
}