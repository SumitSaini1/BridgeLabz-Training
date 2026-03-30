import java.util.Scanner;

public class StringPalindrome {

    // reverse the string
    public static String reverseString(String text){
        StringBuilder reverseString=new StringBuilder();
        for(int i=text.length()-1;i>=0;i--){
            // add character in string 
            reverseString.append(text.charAt(i));
        }
        return reverseString.toString();



    }

   
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a text:");
        String text=input.nextLine().toLowerCase();
        String reverseString=reverseString(text);

        // compare original string and reverse String 
        if(text.equals(reverseString)){
            System.out.println("String are palindrome");
        }else{
            System.out.println("String are not palindrome ");
        }

    }
    
}
