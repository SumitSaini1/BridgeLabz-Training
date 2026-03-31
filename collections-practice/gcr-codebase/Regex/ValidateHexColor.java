package Regex;

import java.util.Scanner;

public class ValidateHexColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Hex code");
		String input=scanner.nextLine();
		String validate="^[#][0-9A-Fa-f]{6}$";
		if(input.matches(validate)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
