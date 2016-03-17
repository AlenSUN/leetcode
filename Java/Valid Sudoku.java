public class Solution {
	public boolean isValidSudoku(char[][] board) {
		Set<Character> s = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			s.clear();
			for (int j = 0; j < 9; j++)
				if (board[i][j] != '.' && !s.add(board[i][j]))
					return false;
		}

		for (int i = 0; i < 9; i++) {
			s.clear();
			for (int j = 0; j < 9; j++)
				if (board[j][i] != '.' && !s.add(board[j][i]))
					return false;
		}

		for (int i = 0; i < 9; i++) {
			s.clear();
			for (int j = 0; j < 3; j++)
				for (int k = 0; k < 3; k++)
					if (board[i / 3 * 3 + j][i % 3 * 3 + k] != '.' && !s.add(board[i / 3 * 3 + j][i % 3 * 3 + k]))
						return false;
		}

		return true;
	}
}