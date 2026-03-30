// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String s="leetcode";
        int index= firstUniqChar(s);
        System.out.println(index);

    }
}