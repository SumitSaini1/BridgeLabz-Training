import java.util.Scanner;

public class DoubleOperation {
    public static void operation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one : ");
        double a=input.nextDouble();
        System.out.println("Enter number Second : ");
        double b=input.nextDouble();
        System.out.println("Enter number Third : ");
        double c=input.nextDouble();

        double operation_1=a + b *c;
        double operation_2=a * b + c;
        double operation_3=c + a / b;
        double operation_4= a % b + c;

        System.out.println("The result of all operations are " + operation_1 + ", " + operation_2 +", " + operation_3 +", "+ operation_4);

        input.close();



        

    }
    public static void main(String[] args) {
        DoubleOperation.operation();

    }


    
}
