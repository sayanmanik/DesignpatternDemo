package com.company;


import java.util.Observable;

public class WeatherData extends Observable {

    float temp;
    float pressure;
    float humidity;


    public void changeMeasure(){

        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float presssure, float humidity){
        this.temp = temp;
        this.pressure = presssure;
        this.humidity = humidity;

        changeMeasure();
    }


    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
