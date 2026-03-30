import java.util.Scanner;

public class OddEven {
    public static void CheckNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  nth Number : ");
        int number=input.nextInt();
        if(number > 0){ // for checking positive natural number 
            for(int i=1;i<=number;i++){ // To iterate to 1 to nth number 
                if(i % 2==0){ // check number is even  
                    System.out.println("The number " + i + " is even Number");
                }else{ // check number is odd 
                    System.out.println("The number " + i + " is odd Number");
                }
            }

        }else{
            System.out.println("Enter Positive Number ");
        }
        input.close();

        

    }
    public static void main(String[] args) {
        OddEven.CheckNumber();
    }
     
}
