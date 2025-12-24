import java.util.*;

public class NumberPositiveNegative {
    public static void CheckNumber(){
        Scanner input=new Scanner(System.in);
		System.out.println("Enter you number : ");
        int number=input.nextInt(); //taking input 
        if(number > 0){ // Check Positive 
            System.out.println("Positive Number");
        }else if(number<0){ // // Check Negative
            System.out.println("Negative Number");
        }else{ 
            System.out.println("Zero");
        }
        input.close();
    }
    public static void main(String[] args) {
        NumberPositiveNegative.CheckNumber();

    }
}
