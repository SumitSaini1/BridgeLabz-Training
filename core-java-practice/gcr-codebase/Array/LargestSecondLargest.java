import java.util.*;
public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int maxDigit=10;
        int[] digit=new int[maxDigit];

        for(int i=0;i<maxDigit;i++){ // to make users input array 
            System.out.println("Enter a digit: ");
            digit[i]=input.nextInt();
        }

        //int largestElement=digit[0];
        int largestElement=Integer.MIN_VALUE;
        int SecondlargestElement=Integer.MIN_VALUE;
        for(int i=1;i<maxDigit;i++){ // loop to find the largest element in an array 
            if(digit[i]>largestElement){// condition to find largest element
                largestElement=digit[i];
            }else if(digit[i]>SecondlargestElement && digit[i] != largestElement){ // condition for find second largest 
                SecondlargestElement=digit[i];


            }
            
        }
        System.out.println("largest element : " + largestElement);
        System.out.println("Second largest element : " + SecondlargestElement);


    }
    
}
