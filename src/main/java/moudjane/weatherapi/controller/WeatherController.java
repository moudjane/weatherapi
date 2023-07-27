package moudjane.weatherapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import moudjane.weatherapi.model.MainData;
import moudjane.weatherapi.service.WeatherService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public MainData getWeatherForCity(@PathVariable String city) {
        return weatherService.getWeatherForCity(city);
    }
}