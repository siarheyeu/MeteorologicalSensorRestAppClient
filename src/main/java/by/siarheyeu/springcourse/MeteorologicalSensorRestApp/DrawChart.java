package by.siarheyeu.springcourse.MeteorologicalSensorRestApp;


import by.siarheyeu.springcourse.MeteorologicalSensorRestApp.dto.MeasurementsResponse;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class DrawChart {
    public static void main(String[] args) {
        List<Double> temperatures = getTemperaturesFromServer();
        drawChart(temperatures);
        }

        private static List<Double> getTemperaturesFromServer(){
        final RestTemplate restTemplate = new RestTemplate();
        final String url = "http://localhost:8080/measurements";
        }

        MeasurementsResponse
}
