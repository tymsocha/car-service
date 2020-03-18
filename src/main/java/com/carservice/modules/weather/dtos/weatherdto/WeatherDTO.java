package com.carservice.modules.weather.dtos.weatherdto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDTO {
    LocationCoordinatesDTO coord;

    List<WeatherInfoDTO> weather;

    String base;

    WeatherMainParamsDTO main;

    long visibility;

    WindDTO wind;

    CloudsDTO clouds;

    long dt;

    WeatherSystemParamsDTO sys;

    long timezone;

    long id;

    String name;

    long cod;

}
