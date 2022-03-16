package userRegistration;

public class Main {

	/*
	 * Procedure:- 
	 * =========== 
	 * 1. Created reference for interface (@ServerInterface) and used lambda expression 
	 * 2. Matching given input by the pattern defined
	 */
	public static void main(String[] args) throws InterruptedException {

		// Created reference for interface (@ServerInterface) and used lambda expression
		ServerInterface fname = () -> {
			String fn = "Chandra";
			//Matching given input by the pattern defined
			return fn.matches("^[A-Z]{1}[a-z]{2,}$");
		};
		System.out.println(fname.user());

		// Created reference for interface (@ServerInterface) and used lambda expression
		ServerInterface lname = () -> {
			String ln = "Prasad";
			//Matching given input by the pattern defined
			return ln.matches("^[A-Z]{1}[a-z]{3,}$");
		};
		System.out.println(lname.user());

		// Created reference for interface (@ServerInterface) and used lambda expression
		ServerInterface email = () -> {
			String mail = "chandra53@bl.co.in";
			//Matching given input by the pattern defined
			return mail.matches("([a-z]+[0-9]+@bl[.]co[.]in)*");
		};
		System.out.println(email.user());

		// Created reference for interface (@ServerInterface) and used lambda expression
		ServerInterface number = () -> {
			String pn = "91 7001950699";
			//Matching given input by the pattern defined
			return pn.matches("^([0-9]{2}\\\\s[0-9]{10})$");
		};
		System.out.println(number.user());

		// Created reference for interface (@ServerInterface) and used lambda expression
		ServerInterface password = () -> {
			String pwd = "Chandra@2453";
			//Matching given input by the pattern defined
			return pwd.matches("^(?=.*[A-Z]+)(?=.*[!@#$&*])(?=.*[0-9]+)(?=.*[a-z]+).{8,}$");
		};
		System.out.println(password.user());
	}

}
