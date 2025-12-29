import java.util.Scanner;
public class LongestWord{
    public static void longestWord(String sentence){
        // convert string in to array 
        String[] words=sentence.split(" ");
        int longest=words[0].length();
        int logestWordIndex=0;
        // iterate over array 
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int countWord=0;
            // loop to count the character in each word
            for(int j=0;j<word.length();j++){
                countWord++;

            }
            // condition to find largest
            if(countWord > longest){
                longest=countWord;
                logestWordIndex=i;
            }


        }
        System.out.println("Longest word is : " + words[logestWordIndex]);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a text:");
        // take a input 
        String sentence=input.nextLine();
        // call function to find longest word
        longestWord(sentence);

        input.close();
    }
}