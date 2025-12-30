import java.util.Scanner;

public class YoungestTallestFriends {
    // method to find youngest 
    public static int youngest(int[] age){
        int youngest = 0; // index of first friend 
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngest]) { // for finding the youngest
                youngest = i;

            }

            

        }
        return youngest;
    }
    // method to find tallest friend n
    public static int tallest(double[] height){
        int tallest = 0;
        for (int i = 1; i < 3; i++) {

            

            if (height[i] > height[tallest]) {// for finding tallest
                tallest = i;
            }


        }
        return tallest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        String[] name = { "Amar", "Akbar", "Anthony" };

        // take inputs for height and age 
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + " Friend Age:");
            age[i] = input.nextInt();
            System.out.println("Enter " + (i + 1) + " Friend height :");
            height[i] = input.nextDouble();

        }

        int youngest=youngest(age);
        int tallest=tallest(height);
        
        
       
        System.out.println("youngest: " + name[youngest] + ", tallest :" + name[tallest]); // print tallest 

    }
}
