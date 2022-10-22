package org.acme.models;

import java.util.ArrayList;

public class TimerResponse {
    
    public boolean active;
    public int resolution;
    public ArrayList<PricePoint> pricePoints;

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

}
