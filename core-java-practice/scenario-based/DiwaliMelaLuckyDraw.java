import java.util.Scanner;

public class DiwaliMelaLuckyDraw {
        // This method handles the lucky draw process for multiple visitors
    public static void luckyDraw() {
        Scanner input = new Scanner(System.in);
        // Infinite loop to allow multiple visitors to participate
        while (true) { 
            // Display welcome message for each visitor
            System.out.println("===========Welcome! to Diwali Mela Lucky Draw=====================");
            System.out.println();
             // Ask the visitor to enter a lucky number
            System.out.println("Enter your guess number:");
            // Read the lucky number entered by the visitor
            int number = input.nextInt();
             // If user enters 0, stop the lucky draw and exit the loop
            if(number ==0){
                System.out.println("Thank you for visiting Diwali Mela ");
                break;
            }
            // If the number is negative, it is considered invalid
            if (number < 0) {
                System.out.println("Ops! Sorry Invalid Number ");
                continue;

                //// Check if the number is divisible by both 3 and 5
            }else if(number % 3==0 && number % 5 ==0){
                System.out.println("Congratulations you Win a gift hamper");
            }else{
                System.out.println("Ops! Sorry Better Luck Next Time");
            }
            System.out.println();
            // Close the scanner
            
        }
        input.close();
    }
    public static void main(String[] args) {
        luckyDraw();
    }

}
