package LamdaExpression;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class NameUppercasing {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>(Arrays.asList("Sumit","rahul"));
		
		List<String> upper=name.stream().map(String::toUpperCase).toList();
		upper.forEach(System.out::println);
		
		
		
		// TODO Auto-generated method stub

	}

}
