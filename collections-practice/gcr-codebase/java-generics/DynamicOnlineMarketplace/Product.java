public class Product <T extends Category>{
	private String productId;
	private String productName;
	private double price;
	private T category;
	
	public Product(String productId,String productName,double price,T category) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.category=category;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public T getCategory() {
		return category;
	}

	public void setCategory(T category) {
		category = category;
	}
	
	// Display method
    public void display() {
		System.out.println("=======Display Details==========");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Category     : " + category.getCategory());
		System.out.println("---------------------------------");
    }
	
	
	

}

