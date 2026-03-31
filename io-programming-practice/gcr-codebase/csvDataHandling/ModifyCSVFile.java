package CSVDataHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSVFile {

	public static void main(String[] args) {
		 String inputFile = "S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Data.csv";
	     String outputFile = "S:\\Eclipse\\BridgeLabzTraining\\src\\CSVDataHandling\\Output.csv";
		
		try( BufferedReader bfr = new BufferedReader(new FileReader(inputFile));
	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
			
			
			String header= bfr.readLine();
			writer.write(header);
			writer.newLine();
			
			String line;
			while((line=bfr.readLine())!=null) {
				String[] details=line.split(",");
				String department=details[1];
				double salary=Double.parseDouble(details[2]);
				if(department.equals("IT")) {
					double increase= (salary * 10)/100;
					salary+=increase;
					
				}
				writer.write(details[0]+","+department+","+salary);
				System.out.println("Update Successfully:");
				writer.newLine();
				
				
			}
		}catch(IOException e) {
			e.getStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
