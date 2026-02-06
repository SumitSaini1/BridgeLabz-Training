package collectors;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		String paragraph="Java is a Programming Language ";
		String[] splitPara=paragraph.split(" ");
		Map<String, Integer> wordOccurence=Arrays.stream(splitPara).collect(Collectors.toMap(word-> word,word->1,Integer::sum));
		System.out.println(wordOccurence);


	}

}
