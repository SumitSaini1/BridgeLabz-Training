import java.util.Scanner;

public class MostFrequentCharacter {
    // method to find frequent character 
    public static void frequentCharacter(String text){
        // create a frequncy array 
        int[] freq=new int[256];
        // count the frequency of each character 
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            freq[ch]++;
        }
        
        char result=' ';
        int max=0;
        // find the maximum frequency character and return in result 
        for(int i=0;i<text.length();i++){
            if(freq[text.charAt(i)] > max){
                max=freq[text.charAt(i)];
                result=text.charAt(i);
            }

        }
        System.out.println("Most frequent Element: " + result);

    }
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter a text:");
        // take input 
        String text=input.nextLine();
        // call method
        frequentCharacter(text);

        input.close();
    }
    
}
