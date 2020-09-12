package com.company;

import com.company.display.CurrentConditions;
import com.company.subject.Subjects;
import com.company.subject.WeatherData;

public class Main {

    public static void main(String[] args) {
	// write your code here

        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions(weatherData);

        weatherData.measure(80,60,30.4f);
        System.out.println("------------------>>>>>>>>>>>>>>>");
        weatherData.measure(70,70,40.4f);

    }
}
