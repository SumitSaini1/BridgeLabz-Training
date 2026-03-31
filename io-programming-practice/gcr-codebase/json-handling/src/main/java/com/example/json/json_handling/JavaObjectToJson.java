package com.example.json.json_handling;
import com.fasterxml.jackson.databind.ObjectMapper;
class Car{
	public String name;
	public int price;
	public Car(String name,int price){
		this.name=name;
		this.price=price;
		
		
	}
	
}
public class JavaObjectToJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Car car=new Car("Audi",40000000);
			
			ObjectMapper objectmapper=new ObjectMapper();
			
			String jsonString=objectmapper.writeValueAsString(car);
			System.out.println(jsonString);
		}catch(Exception e) {
			e.printStackTrace();

		}
		
		

	}

}
