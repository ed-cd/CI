import java.util.LinkedList;

public class One_4 {
	public static void webEncodeSpaces(char[] s, int trueLength) {
		for (int n = 0; n < trueLength; n++) {
			if (s[n] == ' ') {
				for (int m = s.length - 1; m > n; m -= 2) {
					s[m - 1] = s[m - 3];// shift everything by 2 to make space
					s[m] = s[m - 2];
				}
				s[n] = '%';
				s[n + 1] = '2';
				s[n + 2] = '0';
			}
		}
	}
}
