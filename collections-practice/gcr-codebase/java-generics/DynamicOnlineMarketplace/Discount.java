public class Discount {
	public static  <T extends Product<? extends Category>> void  getDiscount(T product,double percentage){
		double price=product.getPrice();
		double discount=(price*percentage)/100;
		product.setPrice(price- discount);
		
	}
	

}
