package moudjane.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherInfo {
    @JsonProperty("description")
    private String description;

    @JsonProperty("icon")
    private String icon;
}