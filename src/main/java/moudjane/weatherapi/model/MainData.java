package moudjane.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainData {
    @JsonProperty("name")
    private String city;

    @JsonProperty("main")
    private TempData mainData;

    @JsonProperty("weather")
    private WeatherInfo[] weatherInfo;

    @JsonProperty("sys")
    private SysData sysData;

    public static class SysData {
        @JsonProperty("country")
        private String country;
    }
}