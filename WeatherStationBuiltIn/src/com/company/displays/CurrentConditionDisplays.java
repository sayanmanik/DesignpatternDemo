package com.company.displays;

import com.company.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplays implements Observer,DisplayElement
{

    Observable observable;
    float temp;
    float pressure;
    float humidity;

    public CurrentConditionDisplays(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData data = (WeatherData) o;
            temp = data.getTemp();
            pressure = data.getPressure();
            humidity = data.getHumidity();

            display();

        }
    }

    @Override
    public void display() {
        System.out.println("Current Condition is:\n"+"temperature: "+temp+"\n"+"pressure: "+pressure+"\n"+"humidity: "+humidity);
    }
}
