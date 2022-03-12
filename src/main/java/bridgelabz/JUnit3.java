package bridgelabz;

public class JUnit3 {
	
	/**
	 * Procedure:-
	 * ============
	 * 1. Created a pattern for email to and return to Validation class to validate multiple email data entry
	 */
	public static boolean email(String mail) {
		return mail.matches("^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
	}
}
