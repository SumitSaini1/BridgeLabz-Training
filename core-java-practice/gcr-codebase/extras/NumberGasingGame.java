import java.util.Scanner;
public class NumberGasingGame {
    public static int guessNumber(int low,int high){
        int guessNumber=(int)(Math.random() * (high-low+1))+low;
        return guessNumber;
    }
    public static String feedback(Scanner input){
        System.out.println("Is the guess high, low, or correct?");
        String feedback =input.nextLine().toLowerCase();
        return feedback;

    }
    public static int[] updateRange(String feedback,int low,int high,int guess){
        if(feedback.equals("high")){
            high=guess-1;
        }else if(feedback.equals("low")){
            low=guess+1;
        }
        return new int[]{low,high};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int low=1;
        int high=100;
        int attempt=0;

        System.out.println("Think of a number between 1 and 100.");
        while (true) {
            if (low > high) {
                System.out.println("Inconsistent feedback detected. Game stopped.");
                break;
            }
            int guess=guessNumber(low,high);
            attempt++;
            System.out.println("Computer's guess: " + guess);
            String feedback=feedback(input);

            if(feedback.equals("correct")){
                System.out.println("\n🎉 Computer guessed your number correctly!");
                System.out.println("Total attempts: " + attempt);
                break; // stop the loop
            }else if (feedback.equals("high") || feedback.equals("low")) {
                int[] updateRange = updateRange(feedback, low, high, guess);
                low = updateRange[0];
                high = updateRange[1];
            }else {
                System.out.println("Invalid input! Please type high, low, or correct.");
                attempt--; // do not  count invalid attempt
            }
            
        }
        input.close();


        
    }
    
}
