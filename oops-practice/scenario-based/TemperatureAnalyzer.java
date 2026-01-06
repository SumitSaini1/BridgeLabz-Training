
import java.util.Scanner;

public class TemperatureAnalyzer {
	// method to find average
	public static float[] analyzeTemperature(float[][] temperature) {
		float[] average = new float[7];
		for (int i = 0; i < temperature.length; i++) {
			float sum = 0;
			for (int j = 0; j < 24; j++) {

				sum += temperature[i][j];

			}
			average[i] = sum / 24;
		}
		return average;

	}

	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		float[][] temperature = new float[7][24];
		for (int i = 0; i < temperature.length; i++) {
			for (int j = 0; j < 24; j++) {
				System.out.println("Enter temperature for Day " + (i + 1) + ", Hour " + (j + 1));
				temperature[i][j] = (float) (Math.random() * 100) + 1;
				// temperature[i][j]=input.nextFloat();

			}
		}
		float[] average = analyzeTemperature(temperature);
		int hotest = 0;
		int coldest = 0;
		for (int i = 1; i < 7; i++) {
			if (average[i] > average[hotest]) {
				hotest = i;
			}
			if (average[i] < average[coldest]) {
				coldest = i;
			}

		}
		System.out.println("Hottest Day: Day " + (hotest + 1));
		System.out.println("Coldest Day: Day " + (coldest + 1));
		input.close();
	}

}
