
import java.util.Scanner;
public class PrimeNumberCheck {
    public static boolean checkPrime(int number){
        if(number <= 1 ){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number % i ==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number To check prime or not ");
        int numbers=input.nextInt();
        boolean result=checkPrime(numbers);
        if(result){
            System.out.println("The given number is prime Number");
        }else{
            System.out.println("The given number is not a prime Number");
        }

    }
}
