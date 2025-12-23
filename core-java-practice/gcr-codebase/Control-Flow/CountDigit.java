import java.util.Scanner;
public class CountDigit {
    public static void count(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number=input.nextInt();
        int count=0;
        while(number!=0){
            number=number / 10 ;// divide by 10 to remove last element 
            count ++;

        }
        System.out.println("Number of digit in is " + count);

        input.close();

    }
    public static void main(String[] args) {
        CountDigit.count();
    }
    
    
}
