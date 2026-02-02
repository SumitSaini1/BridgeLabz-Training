package CSVDataHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRowsCSVFile {

	public static void main(String[] args) {
		try {
			BufferedReader bfr=new BufferedReader(new FileReader("S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Data.csv"));
			String line;
			int rows=0;
			while((line=bfr.readLine())!=null) {
				String[] columns=line.split(",");
				System.out.println(columns[0] + "\t" + columns[1]);
				rows++;
 
				
			} 
			System.out.println("Total records:"+(rows-1));
			
			
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}

	}

}
