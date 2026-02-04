package Streams;

import java.util.Arrays;
import java.util.List;

public class EventAttendeeWelcomeMessage {

	public static void main(String[] args) {
		List<String> price=Arrays.asList("Sumit","Rahul");
		price.forEach(p->System.out.println("Welcome "+p));

	}

}
