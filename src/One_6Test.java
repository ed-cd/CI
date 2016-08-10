import static org.junit.Assert.*;

import org.junit.Test;

public class One_6Test {

	@Test
	public void test() {
		String s1 = "aabcccccaaa";
		String s2 = "a2b1c5a3";
		String s3 ="abcdefg";
		assertTrue(s2.equals(One_6.compress(s1)));
		assertTrue(s3 == One_6.compress(s3));
	}

}
