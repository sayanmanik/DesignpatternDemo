package com.company.display;

import com.company.observer.Observers;
import com.company.subject.Subjects;

public class ForecastDisplay implements DisplayElement, Observers {


    float temp;
    float humidity;
    float pressure;
    Subjects subject;


    ForecastDisplay(Subjects sub){
        subject = sub;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Data is :\n"+"Humidity is:"+humidity+"\nTemperature is:"+temp+"\nPressure is:"+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;

        display();

    }
}
