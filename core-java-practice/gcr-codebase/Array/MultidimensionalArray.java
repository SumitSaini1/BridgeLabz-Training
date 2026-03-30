import java.util.Scanner;
public class MultidimensionalArray{
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a row number");
        int row=input.nextInt(); // take row number

        System.out.println("Enter a column number");
        int column=input.nextInt(); // take column 

        int[][] twoDArray=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){ // making 2d array 
                System.out.println("Enter a number row "+ i + " column " + j);
                twoDArray[i][j]=input.nextInt();
            }
        }
        int[] oneDArray=new int[row*column]; // makeing one d array 
        int index=0;

        for(int i=0;i<row;i++){ // copy two d element into one d 
            for(int j=0;j<column;j++){
                oneDArray[index]=twoDArray[i][j];
                index++;    

            }
        }

        for(int i=0;i<oneDArray.length;i++){ // print result 
            System.out.println("Element index "+ i + " is "+ oneDArray[i] );
        }
        
    }
}