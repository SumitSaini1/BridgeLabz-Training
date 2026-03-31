import java.io.*;
import java.util.*;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            System.out.println("Enter a first number:");
            int a=input.nextInt();
            System.out.println("Enter a second number:");
            int b=input.nextInt();

            int c=a/b;
            System.out.println("Divide:"+c);

            
        }catch(ArithmeticException e){
            System.out.println("We cannot divide by zero");
        }catch(InputMismatchException e){
            System.out.println("Give Numeric Number ");
        }
    }

    
}
