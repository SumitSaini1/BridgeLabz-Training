import java.util.Scanner;

public class StringIndexOutBound {
    public static void generateException(String text) { // method to generate a StringIndexOutOfBoundsException 

        System.out.println("Access index of text :" + text.charAt(10));

    }

    public static void handleException(String text){
        try {
            System.out.println("Access index of text :" + text.charAt(10)); // call generate exception method 
        } catch (StringIndexOutOfBoundsException e) {
            // exception handled here

            System.out.println("Exception occured in Handle Exception");

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");

        String text = input.nextLine();

        // handle genrated StringIndexOutOfBoundsException  by method 
        try {
            generateException(text); // call generate exception method 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("------------generateException-----------------");
            System.out.println("Exception occured in Generate Exception");

        }
        System.out.println("------------HandleException-----------------");
        handleException(text); // call a handleException method 





    }

}
