package Streams;

import java.util.Arrays;
import java.util.List;

public class EmailNotifications {
	public static void sendEmailNotification(String email) {
		System.out.println(email+" Dear, Come tommorrow for reviews.");
		
	}
	public static void main(String[] args) {
		
		List<String> emails= Arrays.asList(
                "ss@gmail.com","ds@gmail.com"
        );
		emails.forEach(email->sendEmailNotification(email) );
		
	}

}
