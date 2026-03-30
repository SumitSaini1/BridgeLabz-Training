import java.util.Scanner;

public class YoungestTallestFrinds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        String[] name = { "Amar", "Akbar", "Anthony" };

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + " Friend Age:");
            age[i] = input.nextInt();
            System.out.println("Enter " + (i + 1) + " Friend height :");
            height[i] = input.nextDouble();

        }
        int youngest = 0;
        int tallest = 0;
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngest]) { // for finding the youngest
                youngest = i;

            }

            if (height[i] > height[tallest]) {// for finding tallest
                tallest = i;
            }

        }
        System.out.println("youngest: " + name[youngest] + ", tallest :" + name[tallest]); // print tallest 

    }

}
