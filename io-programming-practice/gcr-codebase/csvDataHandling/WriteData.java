package CSVDataHandling;
import java.io.*;


public class WriteData {
	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Output.csv"))){
			
			
			writer.write("ID,Name");
			writer.newLine();
			writer.write("1,Sumit");
			System.out.println("Write Successfully:");
			
			
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
