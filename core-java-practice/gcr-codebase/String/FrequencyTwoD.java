import java.util.Scanner;

public class FrequencyTwoD {
    public static String[][] findFirstUniqueCharacter(String text){
        // Frequency array to store charater frequency 
        int[] frequency=new int[256];
        
       
        
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            frequency[ch]++; // acees element index and increment value 
        }

        String[][] result =new String[text.length()][2];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            result[i][0]=String.valueOf(text.charAt(i));
            result[i][1]=String.valueOf(frequency[ch]);



        }
        return result;




     

    }
    public static void displayresult(String[][] result){
        System.out.println("============Output===================");
        System.out.println("Character \tFrequency");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0] + "\t" + " " + "\t" + result[i][1]);

        }
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a text");
        String sting1=input.nextLine();
        String text=sting1.toLowerCase();
        String[][] result=findFirstUniqueCharacter(text);
        displayresult(result);
    }
}
