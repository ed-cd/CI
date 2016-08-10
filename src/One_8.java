
public class One_8 {
	public static void zeroOut(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean[] zeroRows = new boolean[cols];

		for (int col = 0; col < cols; col++) {
			for (int row = 0; row < rows; row++) {
				if (matrix[row][col] == 0) {
					zeroRows[row] = true;
					for (int tempRow = 0; tempRow < rows; tempRow++) {
						matrix[tempRow][col] = 0;
					}
					break;
				}
			}
		}

		for (int row = 0; row < rows; row++) {
			if (zeroRows[row]) {
				for (int col = 0; col < cols; col++) {
					matrix[row][col] = 0;
				}
			}
		}
	}
}
