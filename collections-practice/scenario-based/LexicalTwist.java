import java.util.Scanner;

public class LexicalTwist {

	// method to reverse a given string
	public static String reverseString(String secondString) {

		StringBuilder reverse = new StringBuilder();

		// loop from last character to first
		for (int i = secondString.length() - 1; i >= 0; i--) {
			reverse.append(secondString.charAt(i));
		}

		// return reversed string
		return reverse.toString();
	}

	// method to check if second string is reverse of first string case insensitive
	public static boolean checkedReverseVersion(String firstString, String secondString) {
		String reverse = reverseString(secondString);

		// compare strings ignoring case
		if (firstString.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		// scanner object for user input
		Scanner input = new Scanner(System.in);

		// read first word
		System.out.println("Enter the First Word:");
		String first = input.nextLine();

		// check if first word contains space
		if (first.contains(" ")) {
			System.out.println(first + " is an invalid word");
			return;
		}

		// read second word
		System.out.println("Enter the Second Word:");
		String second = input.nextLine();

		// check if second word contains space
		if (second.contains(" ")) {
			System.out.println(second + " is an invalid word");
			return;
		}

		// if second word is reverse of first
		if (checkedReverseVersion(first, second)) {

			// reverse first word and convert to lowercase
			String reverseFirstString = reverseString(first).toLowerCase();
			StringBuilder reversBuilder = new StringBuilder();

			// replace vowels with '@'
			for (int i = 0; i < reverseFirstString.length(); i++) {
				if (reverseFirstString.charAt(i) == 'a' || reverseFirstString.charAt(i) == 'e'
						|| reverseFirstString.charAt(i) == 'i' || reverseFirstString.charAt(i) == 'o'
						|| reverseFirstString.charAt(i) == 'u') {
					reversBuilder.append('@');
				} else {
					reversBuilder.append(reverseFirstString.charAt(i));
				}
			}

			// print transformed word
			System.out.println("Tranformed Word:" + reversBuilder.toString());

		} else {

			// combine both words and convert to uppercase
			String combineString = (first + second).toUpperCase();

			int vowelCount = 0;
			int consonantCount = 0;
			String vowelsSet = "AEIOU";

			// stringbuilders to store first two distinct vowels and consonants
			StringBuilder vowels = new StringBuilder();
			StringBuilder consonants = new StringBuilder();

			// loop through combined string
			for (int i = 0; i < combineString.length(); i++) {
				char ch = combineString.charAt(i);

				// skip non-letter characters
				if (!Character.isLetter(ch)) {
					continue;
				}

				// check vowel
				if (vowelsSet.indexOf(ch) != -1) {
					vowelCount++;

					// store first two distinct vowels
					if (vowels.indexOf(String.valueOf(ch)) == -1 && vowels.length() < 2) {
						vowels.append(ch);
					}
				} else {
					consonantCount++;

					// store first two distinct consonants
					if (consonants.indexOf(String.valueOf(ch)) == -1 && consonants.length() < 2) {
						consonants.append(ch);
					}
				}
			}

			// compare vowel and consonant count
			if (vowelCount > consonantCount) {
				System.out.println("First Two Distinct Vowels:" + vowels.toString());
			} else if (consonantCount > vowelCount) {
				System.out.println("First Two Distinct Consonant:" + consonants.toString());
			} else {
				System.out.println("Vowels and consonants are equal");
			}
		}
	}
}
