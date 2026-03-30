import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static String removeCharacter(String text, char remove) {
        // string builder to keep updated string 
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            
            if (text.charAt(i) != remove) {
                result.append(text.charAt(i));

            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text:");
        // take input
        String text = input.nextLine();
        System.out.println("Enter a character to remove in a String:");
        // charactter to remove 
        char remove = input.next().charAt(0);
        // call method to remove character 
        String result=removeCharacter(text, remove);
        System.out.println("String after remove a Character is : "+ result);
        
        input.close();


    }
}
