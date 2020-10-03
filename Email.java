import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String args[]) {
		List<String> email = new ArrayList<String>();
		email.add("abc@bridgelabz.com");
	    email.add("abc@gmail.co.in");
		

		
		String regex = "^abc@([a-z0-9-]+)\\.([a-z]{2,3})$";

		Pattern pattern = Pattern.compile(regex);

		for (String emailId : email) {
			Matcher matcher = pattern.matcher(emailId);
			System.out.println(email + " : " + matcher.matches());
		}
	}
}
