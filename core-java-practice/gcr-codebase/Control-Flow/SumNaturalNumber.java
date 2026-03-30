import java.util.*;

public class SumNaturalNumber {
    public static void CheckNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one : ");
        int n=input.nextInt(); // taking input

        if(n>0){ // For positive of Natural Number 
            int sum=n * (n+1)/2; // Find sum of n numbers
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        }else{ // For negative integer
            System.out.println("The number " + n + " is not a natural number " );
        }
        
    }
    public static void main(String[] args) {
        SumNaturalNumber.CheckNumber();
        
    }
}
