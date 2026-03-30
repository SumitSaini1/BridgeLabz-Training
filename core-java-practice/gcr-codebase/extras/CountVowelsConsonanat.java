import java.util.Scanner;

public class CountVowelsConsonanat {
    // count vowels and consonanat 
    public static void countVowelAndConsonant(String text){
        // initialize counts
        int vowels=0;
        int consonant=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch >='a' && ch <='z'){
                // condition to check vowels
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                    vowels++;

                }else{
                    consonant++;
                }

            }
            


        }
        System.out.println("Number of vowel in given text is: " + vowels);
        System.out.println("Number of consonanat in given text is: " + consonant);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a text:");
        // take a input 
        String text=input.nextLine().toLowerCase();
        // call function to find counts 
        countVowelAndConsonant(text);
        input.close();

    }
    
}
