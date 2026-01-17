import java.util.HashSet;
public class RemoveDuplicatesfromaString {
    public static void main(String[] args) {
        String input="Hello";
        StringBuilder newString=new StringBuilder();
        HashSet<Character> unique=new HashSet<>();
        char[] words=input.toCharArray();
        for(char ch : words){
            if(!unique.contains(ch)){
                unique.add(ch);
                newString.append(ch);
            }
        }
        System.out.println(newString.toString());
        
    }
    
}
