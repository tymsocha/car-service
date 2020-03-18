package com.carservice.modules.weather.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WeatherConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
