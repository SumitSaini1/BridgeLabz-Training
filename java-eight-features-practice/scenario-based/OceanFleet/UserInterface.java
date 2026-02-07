package OceanFleet;
import java.util.Scanner;
import java.util.*;
public class UserInterface {
	
	public static Vessel parseData(String details) {
		try {
			String[] parseData=details.split(":");
			if(parseData.length<4) {
				return null;
			} 
			Vessel v=new Vessel(parseData[0],parseData[1],Double.parseDouble(parseData[2]),parseData[3]);
			return v;
			
		}catch(Exception e) {
			return null;
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		VesselUtil util=new VesselUtil();
		Scanner input=new Scanner(System.in);
		System.out.println("==========Welcome To OceanFleet===========");
		System.out.println("Enter the number of vessels to be added");
		int task;
		do {
			System.out.println("Add vesels Deatails: 1");
			System.out.println("Find VeselByID to check: 2");
			System.out.println("Find High performance vesel: 3");
			System.out.println("Exit 0");
			
			System.out.println("What you want press number:");
			task=input.nextInt();
			input.nextLine();
			
			
			switch(task) {
			case 1:
				System.out.println("Enter number of inputs");
				int noOfDetails=input.nextInt();
				input.nextLine();
				
				for(int i=0;i<noOfDetails;i++) {
					System.out.println("Input:"+(i+1));
					System.out.println("Details in this Format vesselId:vesselName:averageSpeed:vesselType.");
					String details=input.nextLine();
					Vessel result=parseData(details);
					if(result==null) {
						System.out.println("Invalid Input Enter again");
						i--;
						
					}else {
						util.addVesselPerformance(result);
						System.out.println("Added Vessel");
					}
					
					
					
					
					
				}
				break;
			case 2:
				System.out.println("Enter vessel id to check");
				
				String id=input.next();
				Vessel vesel=util.getVesselById(id);
				if(vesel==null) {
					System.out.println("Vessel By id not found ");
				}else {
					System.out.println(vesel);
				}
				break;
				
			case 3:
				
				
				List<Vessel> maxAverage=util.getHighPerformanceVessels();
				maxAverage.forEach(System.out::println);
				break;
			default:
				System.out.println("Invalid choice");
				
				
			}
			
			
		}while(task!=0);
	}

}
