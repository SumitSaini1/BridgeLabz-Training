import java.util.Scanner;

public class FindFactors {
    // method to find factors 
    public static int[] findFactors(int number){
        int[] factor=new int[number];
        int index=0;
        for(int i=1;i<=number;i++){
            if(number % i==0){
                factor[index]=i;
                index++;
                
            }

        }
        return factor;
    }
    // find sum of factors
    public static int sumOfFactors(int[] factor){
        int sum=0;
        for(int i=0;i<factor.length;i++){
            sum+=factor[i];
        }
        return sum;
    }
    // find product  of factors
    public static int productOffactors(int[] factor){
        int product=1;
        for(int i=0;i<factor.length;i++){
            if(factor[i]!=0){
                product*=factor[i];

            }
            
        }
        return product;
    }
    // find square of factors
    public static double factorsSumOfSquare(int sum){
        double square=Math.pow(sum,2);
        return square;

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number :");
        // take input 
        int number =input.nextInt();
        // call method to find factors
        int[] factor=findFactors(number);
        // call sum to find 
        int sum=sumOfFactors(factor);
        // call product to find
        int product=productOffactors(factor);
        // find square 
        double square=factorsSumOfSquare(sum);

        System.out.println("Sum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Square of sum of factors = " + square);

    }
    
    
}
