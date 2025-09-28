package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.acme.models.TimerResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.acme.models.CalculationResponse;

@ApplicationScoped
public class CalculatorService {
    
    @Inject
    @RestClient
    ElectricityTimerAPI timer;

    public CalculationResponse calc(int watts, float temperature, int curve, int blocks, int aggregatesize, float minprice, int cheapmode) {
        //TODO: curve valinta
        float kwh = this.curve1(temperature);
        float minutes = kwh / ((float) watts / 1000) * 60;
        TimerResponse timerResponse = timer.getTiming((int) minutes, blocks, aggregatesize, minprice, cheapmode);
        CalculationResponse response = new CalculationResponse(timerResponse);
        response.setMinutes(minutes);
        response.setTemperature(temperature);
        response.setKwh(kwh);
        return response;
    }

    //TODO: yksikkötesti curve1:lle

    public float curve1(float temperature) {
        if(temperature > 15) {
            return 0;
        }
        double base = 1.40029781;
        double increment = 0.8238973459;
        float multiplier = (temperature - 15) * -1;
        double kwh = base + multiplier * increment;
        return (float) kwh;
    }
}
