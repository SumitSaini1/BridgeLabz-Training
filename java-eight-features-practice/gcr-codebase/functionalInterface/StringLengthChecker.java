package FunctionalInterface;
import java.util.function.Function;
public class StringLengthChecker {

	public static void main(String[] args) {
		
		Function<String,Integer> lengthFind=str->str.length();
		System.out.println("Length:"+lengthFind.apply("Sumit"));
		
		// TODO Auto-generated method stub

	}

}
