import java.util.Scanner;

public class MultiplicationTable {
    public static void printTable(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your  Number : ");
        int number=input.nextInt();
        for(int i=6;i<=9;i++){ // for iterate to 6 to 9
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
    public static void main(String[] args) {
        MultiplicationTable.printTable();
    }
    
}
