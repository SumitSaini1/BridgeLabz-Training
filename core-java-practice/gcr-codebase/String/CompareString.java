import java.util.Scanner;


public class CompareString {
    public static boolean CheckString(String text1, String text2){
        if(text1.length() != text2.length()){ // if length is not equal return false 
            return false;
        }

        for(int i=0;i<text1.length();i++){
            if(text1.charAt(i) != text2.charAt(i)){ // Any character not match return a false 
                return false;
            }
        }
        

        return true;



    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first text:");
        String text1=input.next();
        System.out.println("Enter a text2:");
        String text2=input.next();

        boolean result=CheckString(text1, text2); // store the return result by method 
        if(result){ // if result true 
            System.out.println("Given two String " + text1 + " and "+ text2 + " is equal.");
        }else{ // if result false 
            System.out.println("Given two String " + text1 + " and "+ text2 + " is not equal.");
        }
    }

    
}
