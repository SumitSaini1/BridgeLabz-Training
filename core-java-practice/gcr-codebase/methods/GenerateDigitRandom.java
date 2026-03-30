import java.util.Scanner;
public class GenerateDigitRandom {
    // generate 4 digit number array 
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers=new int[size];
        for(int i=0;i<size;i++){
            // use random to generate the 4 digit number 
            numbers[i]=(int)(Math.random()*9000) + 1000;
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        
        double sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }

        double average=sum / numbers.length;
        
        double max=numbers[0];
        double min=numbers[0];
        for(int i=1;i<numbers.length;i++){
            max=Math.max(max,numbers[i]);
            min=Math.min(min,numbers[i]);
        }
        return new double[]{average,max,min};
        

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=input.nextInt();
        int[] numbers=generate4DigitRandomArray(size);
        double[] calculate=findAverageMinMax(numbers);

        System.out.println("Average : " + calculate[0]);
        System.out.println("Max :\t " + calculate[1]);
        System.out.println("Min :\t " + calculate[2]);
        

    }


    
}
