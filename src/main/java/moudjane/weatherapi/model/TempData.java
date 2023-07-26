package moudjane.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TempData {
    @JsonProperty("temp")
    private double temperature;

    @JsonProperty("temp_min")
    private double tempMin;

    @JsonProperty("temp_max")
    private double tempMax;

}