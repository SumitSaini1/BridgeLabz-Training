public class ConcatenateUsingStringBuffer {

    public static String concatenateStrings(String[] arr) {
        // create stringbuffer object
        StringBuffer sb = new StringBuffer();

        // append each string from array
        for (String str : arr) {
            sb.append(str);
        }

        // convert to string and return
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"java", " ", "is", " ", "powerful"};

        // print concatenated string
        System.out.println(concatenateStrings(words));
    }
}
