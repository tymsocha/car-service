package com.carservice.modules.weather.domain;

import com.carservice.modules.weather.dtos.SimplifiedWeatherDTO;
import com.carservice.modules.weather.dtos.weatherdto.WeatherDTO;
import com.carservice.utils.WeatherApiConstans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
class WeatherService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    SimplifiedWeatherDTO getCurrentWeather() {
        URI url = buildWeatherUri(WeatherApiConstans.rzeszow, WeatherApiConstans.metricUnitSystem);
        WeatherDTO weatherDTO = Optional.ofNullable(restTemplate.getForObject(url, WeatherDTO.class)).orElse(new WeatherDTO());
        return new SimplifiedWeatherDTO(weatherDTO);
    }

    private URI buildWeatherUri(String city, String unitSystem) {
        return UriComponentsBuilder.fromHttpUrl(WeatherApiConstans.wetherMainUrl)
                .queryParam("q", city)
                .queryParam("units", unitSystem)
                .queryParam("appid", apiKey)
                .build().encode().toUri();
    }
}
