import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountTheOccurrenceWord {

	public static void main(String[] args) {
		
		try {
			String line;
			int count=0;
			
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sumit\\Dropbox\\PC\\Desktop\\Training\\BridgeLabz-Training\\dsa-practice\\gcr-codebase\\stringbuilder-stringbuffer\\data.txt"));
			while((line=br.readLine())!=null){
				String[] wordArray=line.split(" ");
				for(int i=0;i<wordArray.length;i++) {
					if(wordArray[i].equals("Java")) {
						count++;
					}
					
				}
				
				
				
				
			}
			System.out.println("Count of word:"+count);
			
			
			
		}catch(IOException e) {
			System.out.println("Error Reading");
		}

	}

}
