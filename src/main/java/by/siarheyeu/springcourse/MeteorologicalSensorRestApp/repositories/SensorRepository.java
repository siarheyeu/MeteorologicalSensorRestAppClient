package by.siarheyeu.springcourse.MeteorologicalSensorRestApp.repositories;

import by.siarheyeu.springcourse.MeteorologicalSensorRestApp.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, String> {
    Optional<Sensor>findByName(String name);
}
