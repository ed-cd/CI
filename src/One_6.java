
public class One_6 {
	public static String compress(String s) {
		StringBuffer sb = new StringBuffer();
		int count;
		for (int n = 0; n < s.length();) {
			count = 1;
			char currentChar = s.charAt(n);
			for (int m = n + 1; m < s.length(); m++) {
				if (s.charAt(m) == currentChar) {
					count++;
				} else {
					break;
				}
			}
			sb.append(currentChar);
			sb.append(count);
			n += count;
		}
		return sb.length() < s.length() ? sb.toString() : s;
	}
}
