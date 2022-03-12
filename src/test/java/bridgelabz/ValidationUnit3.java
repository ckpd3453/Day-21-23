package bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidationUnit3 {

	/*
	 * 1. Took multiple email data entry into a string array
	 */
	String[] email = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
			"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc", "abc@.com.my",
			"abc123@gmail.a", "abc123@.com", "abc123@.com.com", "..abc@abc.com", ".abc()*@gmail.com", "abc@%*.com",
			"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

	/*
	 * 2. Created a method to validate all the data stored in the array by the given pattern in the main class for true
	 */
	@Test
	public void test1() {

		// Loop for validating all the elements present in the array
		for (int i = 0; i <= 7; i++) {
			// storing array element to a variable
			String checker = email[i];

			// Validating element of string array to pattern defined in JUnit3 class
			Boolean email = JUnit3.email(checker);
			assertEquals(true, email);
		}
	}

	/*
	 * 3. Created a method to validate all the data stored in the array by the given pattern in the main class for false
	 */
	@Test
	public void test2() {

		// Loop for validating all the elements present in the array
		for (int i = 9; i < email.length; i++) {
			// storing array element to a variable
			String checker = email[i];

			// Validating element of string array to pattern defined in JUnit3 class
			Boolean email = JUnit3.email(checker);
			assertEquals(false, email);
		}
	}
}
