package com.carservice.modules.weather.dtos;

import com.carservice.modules.weather.dtos.weatherdto.WeatherDTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SimplifiedWeatherDTO {

    String cityName;
    double temp;
    double perceptibleTemp;
    long pressure;
    double windVelocity;
    long windDirection;
    long visibility;
    int humidity;

    public SimplifiedWeatherDTO(WeatherDTO weatherDTO) {
        this.cityName = weatherDTO.getName();
        this.temp = weatherDTO.getMain().getTemp();
        this.perceptibleTemp = weatherDTO.getMain().getFeels_like();
        this.pressure = weatherDTO.getMain().getPressure();
        this.windVelocity = weatherDTO.getWind().getSpeed();
        this.windDirection = weatherDTO.getWind().getDeg();
        this.visibility = weatherDTO.getVisibility();
        this.humidity = weatherDTO.getMain().getHumidity();
    }
}
