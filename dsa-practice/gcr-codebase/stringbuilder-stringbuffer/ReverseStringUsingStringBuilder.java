public class ReverseStringUsingStringBuilder {

    public static String reverseString(String str) {
        // create stringbuilder object
        StringBuilder sb = new StringBuilder();

        // append the string
        sb.append(str);

        // reverse the string
        sb.reverse();

        // convert back to string
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";

        // call method and print result
        System.out.println("reversed string: " + reverseString(input));
    }
}
