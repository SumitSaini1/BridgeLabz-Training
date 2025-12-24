import java.util.*;

public class CounterNumber {
    public static void Counter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Counter Number : ");
        int counterNumber=input.nextInt();
        while(counterNumber>=1){
            System.out.println(counterNumber);
            counterNumber--;

        }
        
    }
    public static void main(String[] args) {
        CounterNumber.Counter();
    }
    
}
