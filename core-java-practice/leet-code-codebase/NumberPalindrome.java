
public class NumberPalindrome {
    public static  boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=x;
        int rev=0;
        while(n>0){
            int d=n%10; // find last digit
            rev=rev*10+d; // add last digit 
            n=n/10; // remove last digit 


        }
        if(x==rev){
            return true;
        }else{
            return false;
        }


        
        
    }
    public static void main(String[] args) {
        int x=121;
        boolean result=isPalindrome(x);
        if(result){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
