import java.util.Scanner;

public class FactorArray {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number to find Factors: ");
        int number=input.nextInt();

        int maxFactor=10;
        int[] factors= new int[maxFactor]; // make a one d array 
        int index=0;

        for(int i=1;i<=maxFactor;i++){ // To find the factors 
            if(number % i == 0){ // Conditio to find factors 
                if(index==maxFactor){
                    maxFactor *= 2; // Increase the maxfactor 
                    int[] temp=new int[maxFactor];
                    for(int j=0;j<=maxFactor;j++){
                        temp[j]=factors[j]; // Copy factors array  to temp array 
                    }
                    factors=temp; // Copy whole temp array to factors array 

                }
                factors[index]=i; 
                index++; //  increase the index++

                

            }
        }

        for(int i=0;i<factors.length;i++){
            if(factors[i] != 0){
                System.out.println("Factors of number "+ number + " are "+ factors[i] + " ");

            }
            
        }
    }
    
}
