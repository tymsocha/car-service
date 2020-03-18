package com.carservice.utils;

import lombok.Getter;

@Getter
public enum WeatherUnits {
    MILIMETERS("Milimetery", "mm", "Metric"),
    CELCIUS_DEGREES("Stopnie Celsjusza", "C", "Metric"),
    WIND_VELOCITY("Prędkość wiatru", "m/s", "Metric"),
    WIND_ANGLE("Kierunek wiatru", "st", "Metric"),
    HUMIDITY("Wilgotność", "%", "Metric"),
    PRESSURE("Ciśnienie", "hPa", "Metric"),
    VISIBILITY("Widoczność", "m", "Metric");

    private final String name;
    private final String sign;
    private final String metricSystem;

    WeatherUnits(String name, String sign, String metricSystem) {
        this.name = name;
        this.sign = sign;
        this.metricSystem = metricSystem;
    }
}
