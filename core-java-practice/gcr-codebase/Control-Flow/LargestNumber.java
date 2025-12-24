import java.util.Scanner;

public class LargestNumber {
    public static void CheckLargest(){
        Scanner input=new Scanner(System.in); // Scanner object for taking inputs
		System.out.println("Enter number 1: ");
		int number1=input.nextInt(); // Number 1
		System.out.println("Enter number 2: ");
		int number2=input.nextInt();  // Number 2
		System.out.println("Enter number 3: ");
		int number3=input.nextInt();  // Number 3
		
		if(number1 > number2 && number1 > number3 ){ // Check first Number
		    System.out.println("Is the first number 1 the largest? " + " yes");
		}else{
            System.out.println("Is the first number 1 the largest? " + " No");
		}
        
        if(number2 > number1 && number2 > number3){ // Check Second Number
            System.out.println("Is the first number 2 the largest? " + " yes");

        }else{
            System.out.println("Is the first number 2 the largest? " + " No");
        }

        if(number3 > number1 && number3 > number2){ // Check Third Number
            System.out.println("Is the first number 3 the largest? " + " yes");
        }
		else{
            System.out.println("Is the first number 3 the largest? " + " No");
        }
        input.close();


    }
    public static void main(String[] args) {
        LargestNumber.CheckLargest();
    }
}

