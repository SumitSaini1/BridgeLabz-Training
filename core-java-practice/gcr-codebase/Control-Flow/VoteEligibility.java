import java.util.Scanner;

public class VoteEligibility {
    public static void CheckEligibility(){
        Scanner input=new Scanner(System.in);
		System.out.println("Enter you age : ");
        int age=input.nextInt();

        if(age >= 18){
            System.out.println("The person's age is " + age +" can vote");
        }else{
            System.out.println("The person's age is " + age +" cannot vote");
        }
    }

    public static void main(String[] args) {
        VoteEligibility.CheckEligibility();
        
    }
    
}
