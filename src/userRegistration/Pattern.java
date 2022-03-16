package userRegistration;

public class Pattern {
	/*
	 * Test Case for first name and also handling exception
	 */
	public void test1() throws Exception {
		//getting boolean result by calling method of UserRegistration Class
		Boolean firstname = Main.fname("Chandra");
		//Getting Exception
		try {
			if (firstname == true) {
				System.out.println("true");
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid First Name");
		}
	}

	/*
	 * Test Case for Last name and also handling exception
	 */
	
	public void test2() {
		//getting boolean result by calling method of UserRegistration Class
		Boolean lastname = Main.lname("Prasad");
		//Getting Exception
		try {
			if (lastname == true) {
				System.out.println("true");
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid Last Name");
		}
	}

	/*
	 * Test Case for email and also handling exception
	 */
	
	public void test3() {
		//getting boolean result by calling method of UserRegistration Class
		Boolean email = Main.email("chandra53@bl.co.in");
		//Getting Exception
		try {
			if (email == true) {
				//Running Test Case
				System.out.println("true");
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid Email Id");
		}
	}

	/*
	 * Test Case for phone number and also handling exception
	 */
	
	public void test4() {
		//getting boolean result by calling method of UserRegistration Class
		Boolean phone = Main.number("91 7001950699");
		//Getting Exception
		try {
			if (phone == true) {
				//Running Test Case
				System.out.println("true");
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid Phone No.");
		}
	}

	/*
	 * Test Case for password and also handling exception
	 */
	
	public void test5() {
		//getting boolean result by calling method of UserRegistration Class
		Boolean output = Main.password("Chandra@2453");
		//Getting Exception
		try {
			if (output == true) {
				//Running Test Case
				System.out.println("true");
			} else {
				//throwing exception 
				throw new Exception();
			}
			//Handling Exception
		} catch (Exception e) {
			System.out.println("Invalid Password");
		}
	}
}
