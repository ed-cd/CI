import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class One_8Test {

	@Test
	public void test() {
		int[][] testArray = {
				{1,2,3,4},
				{5,6,0,8},
				{9,10,11,12}
				};
		int[][] testResult = {
				{1,2,0,4},
				{0,0,0,0},
				{9,10,0,12}
				};
		One_8.zeroOut(testArray);
		assertTrue(Arrays.deepEquals(testArray, testResult));
	}

}
