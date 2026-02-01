package FutureLogistics;

public abstract class GoodsTransport {
	private String transportId;
	private String transportDate;
	private int transportRating;
	public GoodsTransport(String transportId,String transportDate,int transportRating) {
		this.transportId=transportId;
		this.transportDate=transportDate;
		this.transportRating=transportRating;
		
		
	}
	public String getTransportId() {
		return transportId;
	}
	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}
	public String getTransportDate() {
		return transportDate;
	}
	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}
	public int getTransportRating() {
		return transportRating;
	}
	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}
	public abstract String vehicleSelection();
	public abstract float calculateTotalCharge();
	
	protected float vehiclesPrice(String vehicle) {
	    if(vehicle.equals("Truck")) return 1000f;
	    if(vehicle.equals("Lorry")) return 1700f;
	    return 3000f;
	}

	protected int discountPercentage() {
	    if(getTransportRating() == 5) return 20;
	    if(getTransportRating() == 3 || getTransportRating() == 4) return 10;
	    return 0;
	}


}
