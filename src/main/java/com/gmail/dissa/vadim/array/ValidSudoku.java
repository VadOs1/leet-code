package com.gmail.dissa.vadim.array;

/*
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * Example 1:
 * Input:
 * [
 * ["5","3",".",".","7",".",".",".","."],
 * ["6",".",".","1","9","5",".",".","."],
 * [".","9","8",".",".",".",".","6","."],
 * ["8",".",".",".","6",".",".",".","3"],
 * ["4",".",".","8",".","3",".",".","1"],
 * ["7",".",".",".","2",".",".",".","6"],
 * [".","6",".",".",".",".","2","8","."],
 * [".",".",".","4","1","9",".",".","5"],
 * [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: true
 * Example 2:
 * Input:
 * [
 * ["8","3",".",".","7",".",".",".","."],
 * ["6",".",".","1","9","5",".",".","."],
 * [".","9","8",".",".",".",".","6","."],
 * ["8",".",".",".","6",".",".",".","3"],
 * ["4",".",".","8",".","3",".",".","1"],
 * ["7",".",".",".","2",".",".",".","6"],
 * [".","6",".",".",".",".","2","8","."],
 * [".",".",".","4","1","9",".",".","5"],
 * [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being
 * modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * Note:
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * The given board contain only digits 1-9 and the character '.'.
 * The given board size is always 9x9.*/

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		int boardLength = 9;

		if (board.length != boardLength) {
			return false;
		}

		int[][] squares = new int[boardLength][boardLength];
		int[][] verticalLine = new int[boardLength][boardLength];

		for (int i = 0; i < boardLength; i++) {
			if (board[i].length != boardLength) {
				return false;
			}
			int[] horizontalLine = new int[boardLength];
			for (int k = 0; k < boardLength; k++) {
				char c = board[i][k];
				if (Character.isDigit(c)) {
					int number = Character.getNumericValue(c);
					horizontalLine[k] = number;
					verticalLine[k][i] = number;
					squares[((Double) Math.floor(k / 3)).intValue() + ((Double) Math.floor(i / 3)).intValue() * 3][i % 3
							* 3 + k % 3] = number;
				} else if (c == '.') {

				} else {
					return false;
				}
			}
			// horizontal line verification
			for (int l = 0; l < boardLength; l++) {
				for (int m = l + 1; m < boardLength; m++) {
					if (horizontalLine[l] != 0 && horizontalLine[l] == horizontalLine[m]) {
						return false;
					}
				}
			}
		}

		// vertical line verification
		for (int i = 0; i < boardLength; i++) {
			for (int k = 0; k < boardLength; k++) {
				for (int p = k + 1; p < boardLength; p++) {
					if (verticalLine[i][k] != 0 && verticalLine[i][k] == verticalLine[i][p]) {
						return false;
					}
				}

			}
		}

		// squares verification

		for (int i = 0; i < boardLength; i++) {
			for (int k = 0; k < boardLength; k++) {
				for (int p = k + 1; p < boardLength; p++) {
					if (squares[i][k] != 0 && squares[i][k] == squares[i][p]) {
						return false;
					}
				}

			}
		}

		return true;
	}
}
