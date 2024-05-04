package com.example.Weather_Forecast_Project.Service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RapidApiServiceImpl implements RapidApiService {


    @Autowired
    private RestTemplate restTemplate;


    @Override
    public ResponseEntity<String> RapidApiGetForecastSummaryByLocationName(String name) {
        String baseurl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/{name}/summary/";
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");
        headers.set("X-RapidAPI-Key", "c017e607ffmshd10ece0cd4ca829p130327jsn148ec931a1ab");

        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("name", name);
        HttpEntity<?> entity = new HttpEntity<>(headers);


        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseurl);

        System.out.println(builder.buildAndExpand(urlParams).toUri());


        return restTemplate.exchange(builder.buildAndExpand(urlParams).toUri(), HttpMethod.GET, entity, String.class);
    }

    @Override
    public ResponseEntity<String> RapidApiGetHourlyForecastByLocationName(String name) {
        String baseurl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/{name}/hourly/";
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");
        headers.set("X-RapidAPI-Key", "c017e607ffmshd10ece0cd4ca829p130327jsn148ec931a1ab");

        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("name", name);
        HttpEntity<?> entity = new HttpEntity<>(headers);


        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseurl);

        System.out.println(builder.buildAndExpand(urlParams).toUri());


        return restTemplate.exchange(builder.buildAndExpand(urlParams).toUri(), HttpMethod.GET, entity, String.class);

    }
}





