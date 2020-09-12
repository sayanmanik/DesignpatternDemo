package com.company.subject;

import com.company.observer.Observers;

import java.util.ArrayList;

public class WeatherData implements Subjects
{

    ArrayList<Observers> observers;
    float temp;
    float humidity;
    float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observers o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observers o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observers o = observers.get(i);
            o.update(temp,humidity,pressure);
        }
    }


    public void measure(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObserver();
    }
}
