package Streams;

import java.util.Arrays;
import java.util.List;
import java.time.LocalDateTime;
public class LoggingTransactions {

	public static void main(String[] args) {
		List<Integer> id= Arrays.asList(
                1,2,5,6
        );
		
		id.forEach(ids-> System.out.println(LocalDateTime.now()+ "-Transaction: "+ids));
	}

}
