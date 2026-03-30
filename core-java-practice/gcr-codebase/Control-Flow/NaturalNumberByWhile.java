import java.util.Scanner;

public class NaturalNumberByWhile {
    public static void CheckNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Counter Number : ");
        int number=input.nextInt();
        int n=number;
        
        int sum_loop=0;
        while(true){
            

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

        NaturalNumberByWhile.CheckNumber();
    }
}
