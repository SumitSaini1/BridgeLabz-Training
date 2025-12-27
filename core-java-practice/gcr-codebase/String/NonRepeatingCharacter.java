import java.util.Scanner;
public class NonRepeatingCharacter {
    public static void findFirstUniqueCharacter(String text){
        // Frequency array to store charater frequency 
        int[] frequency=new int[26];
        char[] charArray=text.toCharArray();
        
        for(int i=0;i<charArray.length;i++){
            char ch=charArray[i];
            frequency[ch-'a']++; // acees element index and increment value 
        }
        boolean found=false;
        for(int i=0;i<charArray.length;i++){
            if(frequency[charArray[i]-'a']==1){
                System.out.println("The first non repeating Unique charater is :" + charArray[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("No unique character is found ");
        }

    }
    
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a text");
        String sting1=input.nextLine();
        String text=sting1.toLowerCase();
        
        findFirstUniqueCharacter(text);

    }
}
