package CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class DetectDuplicatesCSV {

	public static void main(String[] args) {
		HashSet<Integer> id=new HashSet<>();
		try {
			BufferedReader bfr=new BufferedReader(new FileReader("S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Data.csv"));
			bfr.readLine();
			String line;
			while((line=bfr.readLine())!=null) {
				String[] columns=line.split(",");
				if(id.contains(Integer.parseInt(columns[0]))) {
					System.out.println("Duplicate");
					System.out.println(columns[0] + "\t" + columns[1] + "\t"+ columns[2]);
					
				}else {
					id.add(Integer.parseInt(columns[0]));
				}
				
			} 
			
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
