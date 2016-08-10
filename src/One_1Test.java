import static org.junit.Assert.*;

import org.junit.Test;

public class One_1Test {

	@Test
	public void test() {
		String testString1 = "abba";
		String testString2 = "ABba";
		String testString3 = "abc de fg";
		assertFalse(One_1.areAllCharactersUnique(testString1));
		assertTrue(One_1.areAllCharactersUnique(testString2));
		assertTrue(One_1.areAllCharactersUnique(testString3));
		assertFalse(One_1.areAllCharactersUniqueBitwise(testString1));
		assertTrue(One_1.areAllCharactersUniqueBitwise(testString2));
		assertTrue(One_1.areAllCharactersUniqueBitwise(testString3));
		assertFalse(One_1.areAllCharactersUniqueWithoutOtherDataStructures(testString1));
		assertTrue(One_1.areAllCharactersUniqueWithoutOtherDataStructures(testString2));
		assertTrue(One_1.areAllCharactersUniqueWithoutOtherDataStructures(testString3));
	}

}
