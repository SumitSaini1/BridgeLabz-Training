import java.util.Scanner;

public class AbundantNumber {
    
    public static void CheckAbundant(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number :");
        int number=input.nextInt();


        int sum=0;
        for(int i=1;i<number;i++){ // iterate from 0 to number -1
            if(number % i ==0){ // finding divisor and add on sum 
                sum+=i;
            }
        }

        if(sum > number){ // condition to check abundant number
            System.out.println("Abundant Number");
        }else{
            System.out.println("Not an abundant ");
        }

        input.close();


    }
    public static void main(String[] args) {
        AbundantNumber.CheckAbundant();

    }
}
