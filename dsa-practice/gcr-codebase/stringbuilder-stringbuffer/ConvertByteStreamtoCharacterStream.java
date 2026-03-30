
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.io.InputStreamReader;
import java.io.FileInputStream;
public class ConvertByteStreamtoCharacterStream {

	public static void main(String[] args) {
		try {
			// for input file
			FileInputStream input=new FileInputStream("C:\\Users\\sumit\\Dropbox\\PC\\Desktop\\Training\\BridgeLabz-Training\\dsa-practice\\gcr-codebase\\stringbuilder-stringbuffer\\data.txt");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(input,StandardCharsets.UTF_8));
			String line;
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			
		}catch(IOException e) {
			System.out.println("Error Reading");
		}
		
		
		

	}

}
