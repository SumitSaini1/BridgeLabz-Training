package FutureLogistics;

public class TimberTransport extends GoodsTransport{
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice; 
	
	
	public TimberTransport(
	        String transportId,
	        String transportDate,
	        int transportRating,
	        float timberLength,
	        float timberRadius,
	        String timberType,
	        float timberPrice) {

	    super(transportId, transportDate, transportRating);

	    this.timberLength = timberLength;
	    this.timberRadius = timberRadius;
	    this.timberType = timberType;
	    this.timberPrice = timberPrice;
	}

	public float getTimberLength() {
		return timberLength;
	}
	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	public float getTimberRadius() {
		return timberRadius;
	}
	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	public String getTimberType() {
		return timberType;
	}
	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}
	public float getTimberPrice() {
		return timberPrice;
	}
	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	public String vehicleSelection() {
		double area= 2 *  3.147
 * timberRadius  * timberLength;
		
		if(area < 250) {
			return "Truck";
		}else if(area >= 250 && area<=400) {
			return "Lorry";
			
		}else {
			return "MonsterLorry";
		}
		
		

	}
	
	public float rate() {
		if(timberType.equalsIgnoreCase("premium")) {
			return 0.25f;
		}
		if(timberType.equalsIgnoreCase("nonpremium")) {
			return 0.15f;
		}
		return 0.0f;
	}

	
	public float calculateTotalCharge() {
		double volume = 3.147
 * getTimberRadius() * getTimberRadius() * getTimberLength();
		float vehiclePrice=vehiclesPrice(vehicleSelection());
		
		float price = (float) volume * getTimberPrice() * rate();
		float tax = price * 0.3f;
		float discount = (price * discountPercentage())/100;
		
		float totalCharge = (price + vehiclePrice + tax) -discount;
		return totalCharge;
		
		
		
	}
	
	

}
