
public class One_7 {
	public static void rotateLeftNinetyInPlace(int[][] arr) {
		int l = arr.length;
		for (int n = 0; n < l / 2; n++) {
			for (int times = 0; times < l - n * 2; times++) {
				int dRow = 1;
				int dCol = 0;
				int row = n;
				int col = n;
				int temp;
				int prev = arr[row][col];
				do {
					temp = arr[row][col];
					arr[row][col] = prev;
					prev = temp;
					row += dRow;
					col += dCol;
					if (row == l - n - 1 && col == 0) {
						dRow = 0;
						dCol = 1;
					} else if (row == l - n - 1 && col == l - n - 1) {
						dRow = -1;
						dCol = 0;
					} else if (row == 0 && col == l - n - 1) {
						dRow = 0;
						dCol = -1;
					}
				} while (row != n || col != n);
				arr[row][col] = prev;
			}
			int x = 1;
		}
	}
}
