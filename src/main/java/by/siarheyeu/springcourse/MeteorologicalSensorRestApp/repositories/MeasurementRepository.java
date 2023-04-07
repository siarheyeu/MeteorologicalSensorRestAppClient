package by.siarheyeu.springcourse.MeteorologicalSensorRestApp.repositories;

import by.siarheyeu.springcourse.MeteorologicalSensorRestApp.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
