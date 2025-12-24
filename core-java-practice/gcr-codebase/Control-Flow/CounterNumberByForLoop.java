import java.util.Scanner;

public class CounterNumberByForLoop {
    public static void Counter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Counter Number : ");
        int counterNumber=input.nextInt();
        
        for(int i=counterNumber;i>=1;i--){
            System.out.println(i);
            
        }
        input.close();
        
    }
    public static void main(String[] args) {
        CounterNumberByForLoop.Counter();
    }
    
}
