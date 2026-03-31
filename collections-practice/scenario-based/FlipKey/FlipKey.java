package FlipKey;
import java.util.*;
public class FlipKey {
	
	public static String convertEvenIndexToUpperCase(StringBuilder removeChar ) {
		for(int i=0;i<removeChar.length();i++) {
			char ch=removeChar.charAt(i);
			if(i%2==0) {
				ch=Character.toUpperCase(ch);
				removeChar.setCharAt(i,ch);
			}
		}
		return removeChar.toString();	
		
		
	}
	public static String CleanseAndInvert(String input) {
		if (input == null || input.length() < 6) {
		    return "";
		}
		String lowercaseString=input.toLowerCase();
		String regexValidation="^[A-Za-z]{6,}$";
		StringBuilder removeChar=new StringBuilder();
		

		

		if(!lowercaseString.matches(regexValidation)){
			return ""; 
			
			
		}else {
			for(int i=0;i<lowercaseString.length();i++) {
				char ch=lowercaseString.charAt(i);
				int ascii=ch;

				if(! (ascii % 2==0) ){
					removeChar.append(ch);
				}
				
			}
			
			
		}
		removeChar.reverse();
		String convertUppercase=convertEvenIndexToUpperCase(removeChar);
		return convertUppercase;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENter a string :");
		String input=scanner.nextLine();
		String keyGenerated=CleanseAndInvert(input);
		if(keyGenerated.equals("")) {
			System.out.println("Invalid input");
		}else {
			System.out.println("The generated key is - "+keyGenerated);
		}
		
		

	}

}
