import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderLine {

	public static void main(String[] args) {
		try {
			String line;
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sumit\\Dropbox\\PC\\Desktop\\Training\\BridgeLabz-Training\\dsa-practice\\gcr-codebase\\stringbuilder-stringbuffer\\data.txt"));
			while((line=br.readLine())!=null) {
				System.out.println(line);
				
			}
			br.close();
			
		}catch(IOException e) {
			System.out.println("Error reading");
			
			
			
		}
		
		
		

	}

}
