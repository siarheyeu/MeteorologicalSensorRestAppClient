package by.siarheyeu.springcourse.MeteorologicalSensorRestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;
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

		}

	}
}
