import java.util.Scanner;

public class Anagram {
    // check anagram or not
    public static boolean checkAnagram(String text1,String text2){

        // store frequency of both textin separate array 
        int[] freaq1=new int[256];
        int[] freaq2=new int[256];

        // if length is not same return false
        if(text1.length() != text2.length()){
            return false;
            
        }else{// store text1 frequency 
            for(int i=0;i<text1.length();i++){
                char ch=text1.charAt(i);
                freaq1[ch]++;
            }
            // store text2 frequency 
            for(int i=0;i<text2.length();i++){
                char ch=text2.charAt(i);
                freaq2[ch]++;
            }

        }
        // compare frequencies
        for(int i=0;i<256;i++){
            if(freaq1[i] != freaq2[i] ){
                return false;
                
            }
        }
        return true;

       
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       

        System.out.println("Enter first text:");
        String text1 = input.nextLine();

        System.out.println("Enter second text:");
        String text2 = input.nextLine();

        boolean result = checkAnagram(text1, text2);

        if (result) {
            System.out.println("The texts are Anagrams");
        } else {
            System.out.println("The texts are NOT Anagrams");
        }

        input.close();
    }
    
}
