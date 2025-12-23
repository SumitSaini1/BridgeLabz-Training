import java.util.Scanner;

public class IntOperation {
    public static void operation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one : ");
        int a=input.nextInt();
        System.out.println("Enter number Second : ");
        int b=input.nextInt();
        System.out.println("Enter number Third : ");
        int c=input.nextInt();

        int operation_1=a + b *c;
        int operation_2=a * b + c;
        int operation_3=c + a / b;
        int operation_4= a % b + c;

        System.out.println("The result of all operations are " + operation_1 + "," + operation_2 +"," + operation_3 +","+ operation_4);
        input.close();



        

    }
    public static void main(String[] args) {
        IntOperation.operation();
    }
    
}
