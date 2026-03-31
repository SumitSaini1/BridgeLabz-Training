package Streams;

import java.util.Arrays;
import java.util.*;

public class TransformingNamesDisplay {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Sumit","rahul","hello");
		List<String> upperCase=names.stream().map(s->s.toUpperCase()).sorted().toList();
		upperCase.forEach(System.out::println);
		
		// TODO Auto-generated method stub

	}

}
