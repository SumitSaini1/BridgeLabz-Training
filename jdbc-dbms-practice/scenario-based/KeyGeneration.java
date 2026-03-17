import java.util.*;

public class KeyGeneration {
    public static String validation(String input) {
        if (input.isEmpty()) {
            return "Invalid Input (empty string)";
        }
        if (input.length() < 6) {
            return "Invalid Input (length < 6)";
        }
        if (input.matches(".*[0-9].*")) {
            return "Invalid Input (contains digits)";
        }
        if (input.contains(" ")) {
            return "Invalid Input (contains space)";
        }
        if (input.matches(".*[^a-zA-Z].*")) {
            return "Invalid Input (contains special character)";

        }
        return "valid";
    }

    public static String  key(String input){
        String lower=input.toLowerCase();
        StringBuilder removeAsciiEven=new StringBuilder();
        for(int i=0;i<lower.length();i++){
            int ch=(int) lower.charAt(i);
            char ch2= lower.charAt(i);

            if(ch%2!=0){
                removeAsciiEven.append(ch2);

                // if(i%2==0){
                //     removeAsciiEven.append(Character.toUpperCase(ch2));
                // }else{
                //     
                // }
                

            }
           
        }
        removeAsciiEven.reverse();
        StringBuilder keyGenerated=new StringBuilder();
        for(int i=0;i<removeAsciiEven.length();i++){
           

            char ch= removeAsciiEven.charAt(i);
            if(i%2==0){
                keyGenerated.append(Character.toUpperCase(ch));
            }else{
                keyGenerated.append(ch);
            }

            
           
        }
        return keyGenerated.toString();

    }

    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++){
                String input=sc.nextLine();
                String valRes=validation(input);
                if(valRes.equals("valid")){
                    String keyGenerated=key(input);
                    System.out.println("The generated key is - "+keyGenerated);
                }else{
                    System.out.println(valRes);
                }
                
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
