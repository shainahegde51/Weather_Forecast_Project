**Weather-forecast-Project**

Write a server by using SpringBoot Java and integrate Weather API from Rapid API. On the basis of that integration, expose your RESTful APIs as follows with JSON response. 
Authentication Method: Header-based authentication with random client id and random client secret

How to Run Project

Download the zip folder

Import Project in Tools(Intellij Idea).

Build the project

Getting Access Token

follow the steps for output

step1: Use default issuer for access token (https://dev-49329729.okta.com/oauth2/default)

step2: For access token we need to set authorization header
a) type-> basic Auth 

b) username-> Client ID : 0oagvr9w5dfFs1QsZ5d7

c) password-> CLIENT SECRETS : AXm9Ljpfg6heb3S2JswnZEVLeAuOOPsvnyzUpHH7g-94V2Er0GU-a2o1h2anWeQk

d) in body we need to enter key and value After authorization header will be automatically generated when you send the request.

![Screenshot 2024-05-04 171811](https://github.com/shainahegde51/Weather_Forecast_Project/assets/75922338/4caec126-f76c-45c7-b0fe-0cf268eb39b6)


4)Access tocken

![Screenshot 2024-05-04 172012](https://github.com/shainahegde51/Weather_Forecast_Project/assets/75922338/c708b606-0433-424d-a413-0a76cb50b332)


output of 2 API

API 1: Get the Weather forecast summary of Any city using API (RapidApiGetForecastSummaryByLocationName)
In the below picture getting output for Forecast Summary By Location Name image

![Screenshot 2024-05-04 164318](https://github.com/shainahegde51/Weather_Forecast_Project/assets/75922338/3a86d967-4e54-4f6d-8950-c3819e84dcd5)


API 2: Get hourly Weather forecast details of Any city using API (RapidApiGetHourlyForecastByLocationName)

In the below picture getting output for Hourly Forecast By Location Name image

Implemented all the logic for this api, since its a paid one not able to access it

![Screenshot 2024-05-04 165026](https://github.com/shainahegde51/Weather_Forecast_Project/assets/75922338/c70e15df-1da4-487c-b5c4-8ef01e110c08)



