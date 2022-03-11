package bridgelabz;

public class JUnit2 {
	public static boolean fname(String fn) {
		return fn.matches("[A-Z][a-z]*");
	}
	
	public static boolean lname(String ln) {
		return ln.matches("[A-Z]{1}[a-z]{3,}");
	}
	
	public static boolean email(String mail) {
		return mail.matches("([a-z]+[0-9]+@bl[.]co[.]in)*");
	}
	
	public static boolean number(String pn) {
		return pn.matches("^([0-9]{2}\\s[0-9]{10})$");
	}

	// 3.created method to validate atleast 1 special character
	public static boolean password(String pwd) {
		return pwd.matches("^(?=.*[A-Z]+)(?=.*[!@#$&*])(?=.*[0-9]+)(?=.*[a-z]+).{8,}$");
	}
}
