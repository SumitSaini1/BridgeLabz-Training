import java.util.Scanner;

class EmployeeBonus{
    public static void BonusFind(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the salary : ");
        int salary=input.nextInt();
        System.out.println("Enter year of service : ");
        int service=input.nextInt();
        if(service > 5){
            int bonus=(salary)*5/100; // find bonus amount 
            salary+=bonus;
            System.out.println(" Your salary with bonus is "+ salary);



        }else{
            System.out.println("you are not eligible for bonus ");

        }
    }
    public static void main(String[] args) {
        EmployeeBonus.BonusFind();
        
    }
}