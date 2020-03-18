package com.carservice.modules.weather.dtos.weatherdto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherMainParamsDTO {
    double temp;
    double feels_like;
    double temp_min;
    double temp_max;
    long pressure;
    int humidity;
}
