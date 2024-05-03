package com.example.Weather_Forecast_Project.Service;
import org.springframework.http.ResponseEntity;


public interface RapidApiService {
    public ResponseEntity<String> RapidApiGetForecastSummaryByLocationName(String name);

    public ResponseEntity<String> RapidApiGetHourlyForecastByLocationName(String Name);

}


