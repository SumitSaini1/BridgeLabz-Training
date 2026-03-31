package Regex;

import java.util.Scanner;

public class LicensePlate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("EnterplateNumber");
		String input=scanner.nextLine();
		String validate="^[A-Z]{2}[0-9]{4}$";
		if(input.matches(validate)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}

}
