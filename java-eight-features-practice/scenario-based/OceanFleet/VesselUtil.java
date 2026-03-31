package OceanFleet;
import java.util.*;
import java.util.*;
public class VesselUtil {
	private List<Vessel> vesselList=new ArrayList<>();
	
	// add vesel
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
		
		
	}
	// find by id
	public Vessel getVesselById(String vesselId) {
		if(vesselList.isEmpty()) {
			return null;
		}
		for(Vessel v : vesselList) {
			Vessel vessel=v;
			if(v.getVesselId().equalsIgnoreCase(vesselId)) {
				return vessel;
				
				
			}
			
			
		}
		return null;
		
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		double maxAverage =
		        vesselList.stream()
		                  .mapToDouble(Vessel::getAverageSpeed)
		                  .max()
		                  .orElse(0);
		List<Vessel> maxAverageList=new ArrayList<>();
		for(Vessel v : vesselList) {
			if(v.getAverageSpeed()==maxAverage) {
				maxAverageList.add(v);
				
				
				
			}
			
			
		}
		return maxAverageList;


		
		
	}
	

}
