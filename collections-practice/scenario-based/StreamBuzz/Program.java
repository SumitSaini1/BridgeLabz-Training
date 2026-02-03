package StreamBuzz;
import java.util.ArrayList;
import java.util.HashMap;
public class Program {
	public static ArrayList<CreatorStats> engagementBoard=new ArrayList<>();
	
	public void RegisterCreator(CreatorStats record) {
		engagementBoard.add(record);
		System.out.println("Creator registered successfully");
	}
	
	
	
	public HashMap<String,Integer> getTopPostCount(double likeThreshHold){
		HashMap<String,Integer> topPostCount=new HashMap<>();
		for( CreatorStats e: engagementBoard) {
			double[] likes=e.getWeeklyLikes();
			int weekCount=0;
			for(int i=0;i<likes.length;i++) {
				
				if(likes[i] >= likeThreshHold) {
					weekCount++;
				}
			}
			if(weekCount > 0) {
				topPostCount.put(e.getCreatorName(),weekCount);
				
			}
			
		}
		if(topPostCount.isEmpty()) {
			System.out.println("Empty Record :");
			return topPostCount;
			
		}
		return topPostCount;
		
		
	}
	
	public void display(HashMap<String,Integer> topPostCount) {
		for (HashMap.Entry<String, Integer> entry : topPostCount.entrySet()) {
		    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
	
	public double CalculateAverageLikes() {
		int sumLikes=0;
		int count=0;
		if(engagementBoard.isEmpty()) {
			System.out.println("Empty CreatorList");
			return 0.0;
			
		}
		for(CreatorStats c: engagementBoard ) {
			double[] likes=c.getWeeklyLikes();
			for(int i=0;i<likes.length;i++) {
				sumLikes+=likes[i];
				count++;
			}
		}
		return sumLikes/count;
	}
	
//	public double CalculateAverageLikes(HashMap<String,Integer> topPostCount) {
//		int likesSum=0;
//		if(topPostCount.size()>0) {
//			for(Integer s :topPostCount.values()) {
//				likesSum+=s;
//				
//				
//				
//				
//			}
//			double average=(double)likesSum/topPostCount.size();
//			return average;
//			
//		}
//		return 0;
//		
//		
//		
//	}
//	
	

}
