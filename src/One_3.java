public class One_3 {
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int[] charCounts1 = new int[256];// I assume that string is ascii, if
											// Unicode would use HashMap
		int[] charCounts2 = new int[256];
		for (int n = 0; n < s1.length(); n++) {
			char c1 = s1.charAt(n);
			char c2 = s2.charAt(n);
			charCounts1[c1]++;
			charCounts2[c2]++;
		}
		for (int n = 0; n < 256; n++) {
			if (charCounts1[n] != charCounts2[n]) {
				return false;
			}
		}
		return true;
	}
}
