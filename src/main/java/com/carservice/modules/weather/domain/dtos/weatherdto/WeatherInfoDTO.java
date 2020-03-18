package com.carservice.modules.weather.domain.dtos.weatherdto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherInfoDTO {
    Long id;
    String main;
    String description;
    String icon;
}
