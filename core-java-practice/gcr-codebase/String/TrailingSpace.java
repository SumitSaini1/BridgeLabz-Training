import java.util.Scanner;

public class TrailingSpace {
    public static int[] trailSpaceByCharAt(String text) {

        int start = 0;
        int end = text.length() - 1;

        // find the first occurence index of character
        while (start <= end && text.charAt(start) == ' ') {
            start++;

        }

        // find the last occurence index of character
        while (end >= start && text.charAt(end) == ' ') {

            end--;

        }

        // make string to result after remove space
        int[] startEnd=new int[2];
        startEnd[0]=start;
        startEnd[1]=end;
        return startEnd;

    }

    public static String findSubstring(String text){
        int[] startEndIndex=trailSpaceByCharAt(text); // call method to find start and last character index
        int startIndex=startEndIndex[0];
        int lastIndex=startEndIndex[1];

        // String builder to store a Character 
        StringBuilder substringByCharAt=new StringBuilder();

        // find Charcter by start and last index of element after removing trail spaces index  
        for(int i=startIndex;i<=lastIndex;i++){
            char ch=text.charAt(i);
            substringByCharAt.append(ch);

        }
        
        return substringByCharAt.toString();



    }

    public static boolean compareStrings(String builtInTrim,String trailSpaceByCharAt){

        // check the length of string 
        if(builtInTrim.length() != trailSpaceByCharAt.length()){
            return false;
        }

        // compare strings character 
        for(int i=0;i<builtInTrim.length();i++){
            if(builtInTrim.charAt(i) != trailSpaceByCharAt.charAt(i)){
                return false;
            }
        }
        return true;


        



    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter a String: ");
        String text = input.nextLine();

        // Use built in method 
        String builtInTrim=text.trim();

        // call method to find string after removing space
        String trailSpaceByCharAt=findSubstring(text);


        // call method to compare both the string 
        boolean result = compareStrings(builtInTrim,trailSpaceByCharAt); 

        // display result 
        System.out.println("\n A Substring by user define method: " + trailSpaceByCharAt);
        System.out.println("\n A Substring by Built in  method: " + builtInTrim);
        System.out.println("\n Compare string are equals or not ?: " + result);




    }

}
