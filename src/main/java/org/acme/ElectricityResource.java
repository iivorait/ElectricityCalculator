package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.acme.models.CalculationResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
@Path("/calculate")
public class ElectricityResource {

    @Inject
    @RestClient
    TemperatureAPI temperatureapi;

    @Inject
    CalculatorService calculator;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CalculationResponse calc(
            @QueryParam("watts") int watts, 
            @QueryParam("curve") int curve,
            @QueryParam("blocks") int blocks,
            @DefaultValue("1") @QueryParam("aggregatesize") int aggregatesize,
            @QueryParam("minprice") float minprice,
            @QueryParam("cheapmode") int cheapmode
        ) {
        //    System.out.println("KOE" + temperatureapi.getTemperature().replaceAll("[^0-9.-]",""));
        float temperature = Float.parseFloat(temperatureapi.getTemperature().replaceAll("[^0-9.-]","")); //remove all other characters but numbers, minus sign and decimal dot
        return calculator.calc(watts, temperature, curve, blocks, aggregatesize, minprice, cheapmode);
    }

}
