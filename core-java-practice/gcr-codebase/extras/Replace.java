import java.util.Scanner;
public class Replace {
    public static void replaceCharacter(String text,char old_char,char new_char){
        // funtion to replace 
        String result=text.replace(old_char, new_char);
        System.out.println("Text After Replacing a character "+ result);
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a text");
        String text=input.nextLine();

        System.out.println("Enter a Character to replace ");
        // enter character to replace 
        char old_char=input.next().charAt(0);

        System.out.println("Enter a Character to replace ");
        // enter a new character 
        char new_char=input.next().charAt(0);
        replaceCharacter(text, old_char, new_char);

        input.close();



    }
    
}
