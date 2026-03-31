package CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchRecordCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bfr=new BufferedReader(new FileReader("S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Data.csv"));
			bfr.readLine();
			String line;
			while((line=bfr.readLine())!=null) {
				String[] columns=line.split(",");
				// search by name 
				if(columns[0].equals("Sumit")) {
					System.out.println(columns[0] + "\t" + columns[1] + "\t"+ columns[2]);
					
					
				}
				
				
			} 
			
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}

	}

}
