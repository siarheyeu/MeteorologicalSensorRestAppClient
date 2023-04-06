package by.siarheyeu.springcourse.MeteorologicalSensorRestApp.dto;

import java.util.List;

public class MeasurementsResponse {
    private List<MesurementDTO> measurements;

    public MeasurementsResponse (List<MeasurementDTO> measurements) {
        this.measurements = measurements;
    }

    public List<MeasurementDTO> getMeasurements(){
        return measurements;
    }

    public void setMeasurements(List<MeasurementDTO> measurements){
        this.measurements = measurements;
    }
}
