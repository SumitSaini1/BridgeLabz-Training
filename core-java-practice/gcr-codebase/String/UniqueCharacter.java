import java.util.Scanner;

public class UniqueCharacter {
    // method to count the character in a String text 
    public static int countLength(String text){
        int count=0;
        try{// loop for count the string character 
            while(true){
                text.charAt(count);
                count++;
                
            }

        }catch(StringIndexOutOfBoundsException e){
            return count;
        }

       
        
    }
    // method to find the unique character 
    public static char[] findUniqueCharacter(int count,String text){
        char[] result=new char[count];
        int index=0;
        
        for(int i=0;i < count;i++){
            char ch=text.charAt(i);
            boolean isUnique=true;
            for(int j=0;j<count;j++){
                if(text.charAt(i) == text.charAt(j) && i != j){
                    isUnique=false;
                    break;
                    
                }
                
                
            }
            if(isUnique){
                result[index]=ch;
                index++;


            }
        }
        return result;

    }
    // Display the records 
    public static void display(char[] result, int count) {
        System.out.println("Unique Characters are:");
        for (int i = 0; i < count; i++) {
            if (result[i] != '\0') {
                System.out.print(result[i] + " ");
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a text Line");
        String text=input.nextLine();
        int count=countLength(text);
        char[] result=findUniqueCharacter(count, text);
        display(result, count);

    }
    
}
