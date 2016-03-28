public class Solution {
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;

		int l = s.length();
		int num = numRows * 2 - 2;
		int numCols = (l / num + 1) * 2;
		char[][] zigzag = new char[numRows][numCols];
		for (int i = 0; i < l; i++)
			if (i % num < numRows)
				zigzag[i % num][i / num * 2] = s.charAt(i);
			else
				zigzag[num - i % num][i / num * 2 + 1] = s.charAt(i);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; i++)
			for (int j = 0; j < numCols; j++)
				if (zigzag[i][j] != 0)
					sb.append(zigzag[i][j]);
		return sb.toString();
	}
}