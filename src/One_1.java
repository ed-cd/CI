public class One_1 {
	public static boolean areAllCharactersUnique(String s) {
		// book suggested optimisation - if the string is too long to contain
		// the theoretical number
		// of unique characters, return false
		if (s.length() > 'z' - 'A') {
			return false;
		} else {
			boolean[] characters = new boolean['z' + 1];
			for (int n = 0; n < s.length(); n++) {
				char c = s.charAt(n);

				if (Character.isAlphabetic(c)) {

					if (characters[c]) {
						return false;
					} else {
						characters[c] = true;
					}
				}
			}
			return true;
		}
	}

	public static boolean areAllCharactersUniqueBitwise(String s) {
		long check = 0;

		for (int n = 0; n < s.length(); n++) {
			if (Character.isAlphabetic(s.charAt(n))) {
				byte offsetCharNumber = (byte) (s.charAt(n) - 'A');
				if ((check & (((long) 1 << offsetCharNumber))) > 0) {
					return false;
				} else {
					check |= ((long) 1 << offsetCharNumber);
				}
			}
		}

		return true;
	}

	public static boolean areAllCharactersUniqueWithoutOtherDataStructures(String s) {
		for (int n = 0; n < s.length(); n++) {
			char c = s.charAt(n);

			if (Character.isAlphabetic(c)) {
				for (int m = n + 1; m < s.length(); m++) {
					if (s.charAt(m) == c) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
