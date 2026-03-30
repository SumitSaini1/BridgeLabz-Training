import java.util.Scanner;
public class RouteDistanceTracker {
    public static void StartTravel(){
        Scanner input =new Scanner(System.in);
        int stop=0;
        int totalDistance=0;
        
        System.out.println("Bus Journey Started ");
        String stop1="";
        while(!stop1.equalsIgnoreCase("yes")){
            
            System.out.println("Bus reached Stop " + (stop+1));
            stop++;
            System.out.println("Distance covered at this stop: 2 km");
            totalDistance+=2;
            System.out.println("Total distance so far: "+totalDistance);
            System.out.print("Do you want to get off? (yes/no):");
            stop1=input.next();

            
            System.out.println("=======================================");
            
            
        }
        System.out.println("Passenger got off the bus ");
        System.out.println("Total distance traveled: " + totalDistance + " km");

        input.close();
    }
    public static void main(String[] args) {
        StartTravel();
        
        
    }
}
