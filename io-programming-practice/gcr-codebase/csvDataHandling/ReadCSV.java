package CSVDataHandling;
import java.io.*;
public class ReadCSV {
	public static void main(String[] args) {
		try {
			BufferedReader bfr=new BufferedReader(new FileReader("S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Data.csv"));
			String line;
			while((line=bfr.readLine())!=null) {
				String[] columns=line.split(",");
				System.out.println("Roll no:"+columns[0]+" 	Name:"+columns[1]);
				
			} 
			
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
		
	}
	

}
