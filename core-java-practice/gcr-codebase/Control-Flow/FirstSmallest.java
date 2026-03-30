import java.util.*;

class FirstSmallest{
    public static void CheckNumber(){
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int number1=input.nextInt();
		System.out.println("Enter number 2: ");
		int number2=input.nextInt();
		System.out.println("Enter number 3: ");
		int number3=input.nextInt();
		
		if(number1 < number2 && number1 < number3 ){
		    System.out.println("Is the first number the smallest? " + " yes");
		}
		else{
		    System.out.println("Is the first number the smallest? " + " No");
		}
		
		
	}
	public static void main(String[] args) {
		FirstSmallest.CheckNumber();
	}
	
}