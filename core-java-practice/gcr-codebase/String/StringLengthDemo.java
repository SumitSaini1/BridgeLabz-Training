import java.util.Scanner;

public class StringLengthDemo {

    // this method finds length of string without using length
    public static int findLengthWithoutMethod(String text) {

        int count = 0;

        try {
            
            while (true) {
                text.charAt(count); 
                count++;            
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exception occurs when index goes out 
           
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a String: ");
        String text = input.next();

        // calling user defined method
        int lengthByLogic = findLengthWithoutMethod(text);

        // calling built in length method
        int lengthByBuiltIn = text.length();

        // display result
        System.out.println("\nLength without using length(): " + lengthByLogic);
        System.out.println("Length using length() method : " + lengthByBuiltIn);

        input.close();
    }
}
