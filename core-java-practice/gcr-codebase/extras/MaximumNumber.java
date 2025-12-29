import java.util.Scanner;

public class MaximumNumber {
    public static int[] takeinput(Scanner input){
        System.out.println("Enter a first Number");
        int number1=input.nextInt();
        System.out.println("Enter a Second Number");
        int number2=input.nextInt();
        System.out.println("Enter a third Number");
        int number3=input.nextInt();
        return new int[]{number1,number2,number3};
    }
    public static void findMaximum(int[] numbers){
        int max=numbers[0];
        if(numbers[1] > max){
            max=numbers[1];
        }
        if(numbers[2] > max){
            max=numbers[2];
        }
        System.out.println("Maximum number is :" + max);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers=takeinput(input);
        findMaximum(numbers);


    }

    
}
