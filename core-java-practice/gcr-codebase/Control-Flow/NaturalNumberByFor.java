import java.util.Scanner;

public class NaturalNumberByFor {
    public static void CheckNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Counter Number : ");
        int number=input.nextInt();
        int n=number;
        
        int sum_loop=0;
        for(int i=n;i>=1;i--){
            

            if(n > 0){
                
                sum_loop+=n;
                n--;


            }else{
                break;
            }
        }
        int sumByFormula=number * (number +1 )/2;

        System.out.println("sum by loop is this "+  sum_loop+ " By Formula is this " + sumByFormula);
        input.close();
    }
    public static void main(String[] args) {
        NaturalNumberByFor.CheckNumber();
    }
    
}
