import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class One_7Test {

	@Test
	public void test() {
		int[][] testArray = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] testResult = {{6,9,8},{3,5,7},{2,1,4}};
		One_7.rotateLeftNinetyInPlace(testArray);
		
		assertTrue(Arrays.deepEquals(testArray, testResult));
	}

}
