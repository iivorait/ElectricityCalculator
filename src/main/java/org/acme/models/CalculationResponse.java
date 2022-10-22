package org.acme.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class CalculationResponse {
    
    public boolean active;
    public int resolution;
    public float temperature;
    public float kwh;
    public float minutes;
    public ArrayList<PricePoint> pricePoints;

    public CalculationResponse(TimerResponse timerResponse) {
        this.active = timerResponse.active;
        this.resolution = timerResponse.resolution;
        this.pricePoints = timerResponse.pricePoints;
    }
    
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public ArrayList<PricePoint> getPricePoints() {
        return pricePoints;
    }
    public void setPricePoints(ArrayList<PricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }
    public int getResolution() {
        return resolution;
    }
    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getMinutes() {
        return minutes;
    }

    public void setMinutes(float minutes) {
        this.minutes = minutes;
    }

    public float getKwh() {
        return kwh;
    }

    public void setKwh(float kwh) {
        this.kwh = kwh;
    }

}
