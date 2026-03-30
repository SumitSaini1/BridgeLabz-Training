import java.util.Scanner;
public class MetroSmartCard {
    public static void travelFare(Scanner input){
        int cardBalance=100;
        char choice;
        while(cardBalance > 0){
            System.out.println("====================== Welcome! to Metro ==========================");
            System.out.print("Enter Your Distance:");
            int distance=input.nextInt();
            int fare=distance>5 ? 20:10;
            if(cardBalance < fare){
                break;
            }
            cardBalance-=fare;
            System.out.println("Total fare of distance is:"+ fare);
            System.out.println("Reamaing Card Balance:"+ cardBalance);

            // Ask user if they want to continue
            System.out.print("Do you want to travel again? (y/n): ");
            choice = input.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                break;
            }

            System.out.println("----------------------------------");
        }
        System.out.println("Thank you for using Delhi Metro ");


        

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        travelFare(input);
    }
    
}
