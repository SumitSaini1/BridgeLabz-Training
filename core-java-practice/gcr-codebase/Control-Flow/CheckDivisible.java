import java.util.*;

class CheckDivisible{
    public static void CheckNumber(){
	    Scanner input=new Scanner(System.in);

		System.out.println("Enter number :");
		int number=input.nextInt();
		if(number%5==0){
		    System.out.println("Is the number " + number + " divisible by 5 " + " Yes");
		}else{
		    System.out.println("Is the number " + number + " divisible by 5 " + " No");
		}
	 
	
	}
	public static void main(String[] args){
	    CheckDivisible.CheckNumber();
		
	}
}