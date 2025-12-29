import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String text){
        StringBuilder reverseString=new StringBuilder();
        // iterate loop from length-1;
        for(int i=text.length()-1;i>=0;i--){
            // add element in reverseString 
            reverseString.append(text.charAt(i));
        }
        return reverseString.toString();



    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a text:");
        // take input
        String text=input.nextLine().toLowerCase();
        // call method to reverse strig 
        String reverseString=reverseString(text);
        System.out.println("Reversed String of " + text + " is "+ reverseString);

        input.close();
    }
    
}
