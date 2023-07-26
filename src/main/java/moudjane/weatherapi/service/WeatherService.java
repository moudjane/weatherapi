package moudjane.weatherapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import moudjane.weatherapi.model.MainData;

@Service
public class WeatherService {

    @Value("${openweathermap.apiKey}")
    private String apiKey;

    private final WebClient webClient;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://api.openweathermap.org/data/2.5/weather").build();
    }

    public MainData getWeatherForCity(String city) {
        String url = String.format("?q=%s&appid=%s", city, apiKey);

        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(MainData.class)
                .block();
    }
}