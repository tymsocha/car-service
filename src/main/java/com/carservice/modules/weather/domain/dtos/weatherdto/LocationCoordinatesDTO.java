package com.carservice.modules.weather.domain.dtos.weatherdto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LocationCoordinatesDTO {
    double lon;
    double lat;
}
