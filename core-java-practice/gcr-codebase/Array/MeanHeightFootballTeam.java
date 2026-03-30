import java.util.Scanner;
public class MeanHeightFootballTeam {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        double[] heights = new double[11]; //declare array 
        double sum = 0.0;

        
        System.out.println("Enter height of 11 football players:");
        for (int i = 0; i < heights.length; i++) { // calculate sum and input 
            heights[i] = input.nextDouble(); // take input 
            sum = sum + heights[i];
        }

      
        double mean = sum / heights.length; // mean calculate 

        
        System.out.println("Mean Height of Football Team = " + mean); // diplay 

        input.close();
        
    }
    
}
