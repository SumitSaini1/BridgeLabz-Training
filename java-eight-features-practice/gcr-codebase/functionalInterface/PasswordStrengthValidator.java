package FunctionalInterface;

interface Validator{
	static void CheckStrength(String password) {
		if(password.length()>8) {
			System.out.println("Password strength is high");
		}else {
			System.out.println("Password strength is low ");
		}
	}
}
public class PasswordStrengthValidator {

	public static void main(String[] args) {
		Validator.CheckStrength("HelloWorld");
		
		

	}

}
