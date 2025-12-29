import java.util.Scanner;


public class ReverseInteger {

     public static  int reverse(int x) {
        int rev=0;
        while (x!=0){
            int dig=x%10;
            int curr=rev*10+dig;
            if((curr-dig)/10!=rev){
                return 0;
            }
            rev=curr;
            x=x/10;
        }
        return rev;

        
    }
    public static void main(String[] args) {
        int x=123;
        int reverse=reverse(x);
        System.out.println(reverse);

    }
}
