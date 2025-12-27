import java.util.Scanner;

public class SubstringCompare {
    public static String substringUsingCharAt(String text, int start, int end){
        StringBuilder substringByCharAt=new StringBuilder();

        for (int i = start; i < end; i++) {
            substringByCharAt.append(text.charAt(i));
        }
        return substringByCharAt.toString();

    }

    public static boolean compareString(String stringBysubstring,String substringBycharAt ){
        
        if(stringBysubstring.length() != substringBycharAt.length()){ // if length is not equal return false 
            return false;
        }

        for(int i=0;i<stringBysubstring.length();i++){
            if(stringBysubstring.charAt(i) != substringBycharAt.charAt(i)){ // Any character not match return a false 
                return false;
            }
        }
        

        return true;
    } 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a Text word :");
        String text=input.next();

        System.out.println("Enter a starting index (0 to ...) :");
        int start=input.nextInt();

        System.out.println("Enter a end index(0 to ..1)");
        int end=input.nextInt();

        // find Substring by predefine function Substring();
        String stringBysubstring=text.substring(start,end);

        String substringBycharAt=substringUsingCharAt(text,start,end); // Call method to find substring by charAt();

        boolean compareResult=compareString(stringBysubstring, substringBycharAt); // Call method to compare the both substrings ;

        // print result 
        System.out.println("\nSubstring using charAt()   : " + substringBycharAt);
        System.out.println("Substring using substring(): " + stringBysubstring);
        System.out.println("Are both substrings equal? : " + compareResult);

        






    }
    
}
