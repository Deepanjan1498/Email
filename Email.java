import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String args[]) {
		List<String> email = new ArrayList<String>();
		email.add("@bridgelabz.com");
	    email.add("abc+xyz@gmail.co.in");
	    email.add("ab.xy@gmail.co.in");
		

		
		String regex = "^([a-z0-9-_\\+]+)(\\.[a-z0-9]+)?@([a-z0-9-]+)\\.([a-z]{2,3})(\\.[a-z]{2})?$";

		Pattern pattern = Pattern.compile(regex);

		for (String emailId : email) {
			Matcher matcher = pattern.matcher(emailId);
			System.out.println(email + " : " + matcher.matches());
		}
	}
}
