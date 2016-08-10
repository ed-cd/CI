import static org.junit.Assert.*;

import org.junit.Test;

public class One_3Test {

	@Test
	public void test() {
		String s1 = "abcdefg";
		String s2 = "abc defg";
		String s3 = "acbgdef";
		assertTrue(One_3.isPermutation(s1, s3));
		assertFalse(One_3.isPermutation(s1, s2));
	}

}
