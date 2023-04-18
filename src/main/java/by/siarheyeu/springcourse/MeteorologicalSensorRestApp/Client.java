package by.siarheyeu.springcourse.MeteorologicalSensorRestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Client {

	public static void main(String[] args) {
		final String sensorName = "Sensor123";

		registerSensor(sensorName);

		Random random = new Random();

		double minTemperature = 0.0;
		double maxTemperature = 45.0;
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
			sendMeasurement (minTemperature + (random.nextDouble() * (maxTemperature - minTemperature)),
				random.nextBoolean(), sensorName);
		}
	}

	private static void registerSensor(String sensorName){
		final String url = "http://localhost:8080/sensor/registration";

		Map<String, Object> jsonData = new HashMap<>();
		jsonData.put("name", sensorName);

		makePostRequestWithJSON(url, jsonData);
	}

	private static void sendMeasurement(double value, boolean raining, String sensorName) {
		final String url = "http://localhost:8080/measurement/add";

		Map<String, Object> jsonData = new HashMap<>();
		jsonData.put("value", value);
		jsonData.put("raining", raining);
		jsonData.put("sensor", Map.of("name", sensorName));

		makePostRequestWithJSONData(url, jsonData);
	}

	private static void makePostRequestWithJSONData(String url, Map<String, Object> jsonData){
		final RestTemplate restTemplate = new RestTemplate();

		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Object> request = new HttpEntity<>(jsonData, headers);

		try{
			restTemplate.postForObject(url, request, String.class);

			System.out.println("Измерение успешно отправлено на сервер!");
		} catch (HttpClientErrorException e){
			System.out.println("ОШИБКА!");
			System.out.println(e.getMessage());
		}
	}
}
