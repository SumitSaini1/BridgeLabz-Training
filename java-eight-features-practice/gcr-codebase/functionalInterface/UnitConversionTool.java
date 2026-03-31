package FunctionalInterface;

interface Conversion{
	static double kmToMiles(int km) {
		return km * 0.621371;
		
	}
	
	static double kgToIbs(int kg) {
		return kg * 2.20462;
		
	}
}
public class UnitConversionTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  miles =Conversion.kmToMiles(5);
		System.out.println("Miles:"+miles);
		double Ibs=Conversion.kgToIbs(5);
		System.out.println("Ibs:"+Ibs);
		

	}

}
