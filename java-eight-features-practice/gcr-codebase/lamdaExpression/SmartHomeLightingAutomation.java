package LamdaExpression;


interface LightPattern{
	public void pattern() ;
	
}

public class SmartHomeLightingAutomation {
	public static void main(String[] args) {
		LightPattern motion=()->System.out.println("Light is moving");
		
		LightPattern timeOfDay=()->System.out.println("Time of day: 12:50 Am");
		
		LightPattern voice=()->System.out.println("Off the lights");
		
		motion.pattern();
		timeOfDay.pattern();
		voice.pattern();
		
		
		
		
		
	}

	
	


}
