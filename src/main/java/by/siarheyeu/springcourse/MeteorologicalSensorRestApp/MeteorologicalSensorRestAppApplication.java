package by.siarheyeu.springcourse.MeteorologicalSensorRestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MeteorologicalSensorRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeteorologicalSensorRestAppApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return ModelMapper();
	}
}
