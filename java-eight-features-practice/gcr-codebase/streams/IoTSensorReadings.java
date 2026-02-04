package Streams;
import java.util.List;
import java.util.Arrays;
public class IoTSensorReadings {

	public static void main(String[] args) {
		List<Double> sensorReadings = Arrays.asList(
                22.5, 30.2, 18.9, 45.0, 27.8, 50.3
        );

        double threshold = 30.0;

        System.out.println("Sensor readings above threshold (" + threshold + "):");

        
        sensorReadings.stream()
                .filter(reading -> reading > threshold)
                .forEach(System.out::println);

	}

}
