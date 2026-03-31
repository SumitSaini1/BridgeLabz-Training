package FutureLogistics;

public class BrickTransport extends GoodsTransport {
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	public BrickTransport(String transportId,String transportDate,int transportRating,float brickSize,int brickQuantity,float brickPrice) {
		super(transportId,transportDate,transportRating);
		this.brickSize=brickSize;
		this.brickQuantity=brickQuantity;
		this.brickPrice=brickPrice;
		
		
	}
	
	
	
	
	
	public float getBrickSize() {
		return brickSize;
	}





	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}





	public int getBrickQuantity() {
		return brickQuantity;
	}





	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}





	public float getBrickPrice() {
		return brickPrice;
	}





	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}





	public String vehicleSelection() {
		int quantity=getBrickQuantity();
		if(quantity < 300) {
			return "Truck";
		}else if(quantity >= 300 && quantity<=500) {
			return "Lorry";
			
		}else {
			return "MonsterLorry";
		}
	}
	
	
	
	
	public float calculateTotalCharge() {
		int discountPercent=discountPercentage();
		float vehiclePrice=vehiclesPrice(vehicleSelection());
		float price=getBrickPrice() * getBrickQuantity() ;
		float tax = price * 0.3f;
		float Discount=(price * discountPercent)/100;
		float totalCharge=price + vehiclePrice +tax - Discount;
		return totalCharge;
		
		
	}
	

}
