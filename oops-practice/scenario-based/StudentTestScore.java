
import java.util.Scanner;

public class StudentTestScore {
	public static float[] storeMarks(int n,Scanner input) {
		float[] score=new float[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter your "+(i+1)+" Student Marks");
			float mark=input.nextFloat();
			while(mark<0) {
				System.out.println("Marks cannot in negative! Enter again");
				mark=input.nextFloat();
			}
			score[i]=mark;
			
		}
		return score;
	}
	public static float averageScore(float[] score) {
		float sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		float average=sum/score.length;
		return average;
		
		
		
	}
	public static void highestLowest(float[] score) {
		int highest=0;
		int lowest=0;
		for(int i=1;i<score.length;i++) {
			if(score[i] > score[highest]) {
				highest=i;
			}
			if(score[i] < score[lowest]) {
				lowest=i;
			}
			
		}
		System.out.println("Highest marks " + score[highest]);
		System.out.println("Lowest marks " + score[lowest]);
	}
	
	public static void displayAboveAverageScores(float[] score, float average) {
	    System.out.println("Scores above average:");

	    boolean found = false;

	    for (int i = 0; i < score.length; i++) {
	        if (score[i] > average) {
	            System.out.println("Student " + (i + 1) + ": " + score[i]);
	            found = true;
	        }
	    }

	    if (!found) {
	        System.out.println("No student scored above the average.");
	    }
	}

	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n=input.nextInt();
		float[] score=storeMarks(n,input);
		
		float average=averageScore(score);
		System.out.println("average marks"+average);
		
		highestLowest(score);
		
		displayAboveAverageScores(score,average);  
		
		
		
		

	}

}
