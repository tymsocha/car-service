package com.carservice.modules.weather.mvc;

import com.carservice.modules.weather.domain.WeatherApi;
import com.carservice.modules.weather.domain.dtos.SimplifiedWeatherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherApi weatherApi;

    @GetMapping("/weather")
    public SimplifiedWeatherDTO getWeather() {
        return weatherApi.getCurrentWeatherInformation();
    }
}
