package com.company;

import com.company.displays.CurrentConditionDisplays;

public class Main {

    public static void main(String[] args) {
	// write your code here


        WeatherData data = new WeatherData();
        CurrentConditionDisplays display = new CurrentConditionDisplays(data);
        data.setMeasurements(20.0f, 50.0f, 22.5f);
    }
}
