import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a text");
        // take Input
        String text=input.nextLine();
        String result=" ";
        // loop to check each character 
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            // check charcter is present in result or not 
            if(result.indexOf(ch)==-1){
                // add character in result String 
                result+=text.charAt(i);
            }
            
        }
        System.out.println("String after Remove all duplicate: " + result);
        input.close();
        
        
    }
    
}
