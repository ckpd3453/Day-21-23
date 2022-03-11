package bridgelabz;

import bridgelabz.JUnit2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidationUnit2 {
	@Test
	public void test1() {
		JUnit2 test = new JUnit2();
		Boolean firstname = JUnit2.fname("Chandra");
		assertEquals(true, firstname);
	}
	@Test
	public void test2() {
		JUnit2 test1 = new JUnit2();
		Boolean lastname = JUnit2.lname("Prasad");
		assertEquals(true, lastname);
	}
	@Test
	public void test3() {
		JUnit2 test2 = new JUnit2();
		Boolean email = JUnit2.email("chandra53@bl.co.in");
		assertEquals(true, email);
	}
	@Test
	public void test4() {
		JUnit2 test3 = new JUnit2();
		Boolean phone = JUnit2.number("91 7001950699");
		assertEquals(true, phone);
	}
	@Test
	public void test5() {
		JUnit2 test4 = new JUnit2();
		Boolean output = JUnit2.password("Chandra@2453");
		assertEquals(true, output);
	}
}
