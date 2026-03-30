import java.util.Scanner;

public class UniquecharaterTwoD {

    // find the unique character in a text
    public static char[] findUniqueCharaters(String text){
        // dtore unique character 
        char[] uniqueChar=new char[text.length()];
        // index for uniquechar
        int index=0;
        // loop to find unique char 
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            boolean isUnique=true;
            // check the unique or not
            for(int j=0;j<text.length();j++){
                if(text.charAt(i) == text.charAt(j) && i !=j){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                uniqueChar[index]=ch;
                index++;
            }
        }
        return uniqueChar;
    }
    public static String[][] findFrequencyOfUniqueCharacters(String text,char[] uniqueChar){
        // store the frequency of text character 
        int[] frequency=new int[256];
        // loop to find the frequency and stored in above array 
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            // increase the frequency 
            frequency[ch]++;

        }

        // tarck the count of unique charater 
        int count=0;
        // find count of unique charater 
        for(int i=0;i<uniqueChar.length;i++){
            if(uniqueChar[i] !='\0'){
                count++;
            }
        }
        
        // store unique charater and frequency 
        String[][] uniqueCharfrequency=new String[count][2];
        // track index position of uniquecharater array 
        int index=0;
        // loop to insert freaquency and charater in Two D array 
        for(int i=0;i<uniqueChar.length;i++){
            
            if (uniqueChar[i] != '\0') {
                char ch = uniqueChar[i];
                uniqueCharfrequency[index][0] = String.valueOf(ch);
                uniqueCharfrequency[index][1] = String.valueOf(frequency[ch]);
                index++;
            }
        }
        return uniqueCharfrequency;
    }
    // display result 
    public static void displayresult(String[][] uniqueCharfrequency){
        System.out.println("============Output===================");
        System.out.println("Character \tFrequency");
        for(int i=0;i<uniqueCharfrequency.length;i++){
            if(uniqueCharfrequency[i][0]!= null){
                System.out.println(uniqueCharfrequency[i][0] + "\t" + " " + "\t" + uniqueCharfrequency[i][1]);
            }
           

        }
    }




    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a text");
        String text=input.nextLine();
        // call userdefine method to find unique charaters in text 
        char[] uniqueChar=findUniqueCharaters(text);

        //call method to find frequency and stored in two d array 
        String[][] uniqueCharfrequency= findFrequencyOfUniqueCharacters(text,uniqueChar);

        // display result 
        displayresult(uniqueCharfrequency);

        

    }
    
}
