package FunctionalInterface;
import java.util.function.Predicate;

public class TemperatureAlertSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature=25;
		Predicate<Double> temp=(n)->n>temperature;
		if(temp.test(25.6)) {
			System.out.println("Teperature cross threshold value");
			
		}else {
			System.out.println("Norama temperture");
		}
		

	}

}
