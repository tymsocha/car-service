package com.carservice.modules.weather.dtos.weatherdto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherSystemParamsDTO {
    long type;
    long id;
    String country;
    long sunrise;
    long sunset;
}
