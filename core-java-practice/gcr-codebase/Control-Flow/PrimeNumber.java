import java.util.*;

public class PrimeNumber {
    public static void isPrime(){
        boolean isPrime=false;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int number=input.nextInt();
        if(number<=1){
            isPrime=false;
        }

        if(number==2){
            isPrime=true;
        }else{
            for(int i=2;i<=number-1;i++){
                if(number % i == 0 ){
                    isPrime=false;
                }else{
                    isPrime=true;
                }
            }

        }
        if(isPrime){
            System.out.println("The given number "+ number + " is a prime number");
        }else{
            System.out.println("The given number "+ number + " is not  a prime number");
        }
        
        
    }
    public static void main(String[] args) {
        PrimeNumber.isPrime();

    }

    
}
