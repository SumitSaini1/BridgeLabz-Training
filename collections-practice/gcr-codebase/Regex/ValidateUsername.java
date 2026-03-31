package Regex;
import java.util.*;
public class ValidateUsername {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("EnterUserName");
		String input=scanner.nextLine();
		String validate="^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		if(input.matches(validate)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		

	}

}
