package com.carservice.modules.weather.domain;

import com.carservice.modules.weather.dtos.SimplifiedWeatherDTO;
import com.carservice.modules.weather.dtos.weatherdto.WeatherDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Component
public class WeatherApi {

    @Autowired
    private WeatherService weatherService;

    @Transactional
    public SimplifiedWeatherDTO getCurrentWeatherInformation() {
        return weatherService.getCurrentWeather();
    }
}
