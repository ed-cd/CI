import static org.junit.Assert.*;

import org.junit.Test;

public class One_4Test {

	@Test
	public void test() {
		String s1 = "Mr John Smith    ";
		String s2 = "Mr%20John%20Smith";
		char[] s1Arr = s1.toCharArray();
		One_4.webEncodeSpaces(s1Arr, s1Arr.length);
		assertTrue(s2.equals(new String(s1Arr)));
	}

}
