import java.util.*;

public class SumNumber {
    public static void Sum(){
        Scanner input = new Scanner(System.in);

        double totalSum=0;
        while(true){ // Loop continue till user enter 0
            System.out.println("Enter  Number to add : ");
            double number=input.nextDouble(); // take input 
            if(number==0){
                break;
            }else{
                totalSum+=number;

            }
            


        }
        System.out.println("Total Sum of Numbers : "+totalSum);

        

    }
    public static void main(String[] args) {
        SumNumber.Sum();
    }
    
}
