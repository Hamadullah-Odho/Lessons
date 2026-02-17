package fancyword;

public class FancyWord {

	private String[][] matrix;
	private String word;

	public FancyWord(String inputWord) {

		word = inputWord;
		int size = word.length();

		matrix = new String[size][size];

		createFancyWord();
	}

	private void createFancyWord() {

		int size = word.length();

		// Fill everything with spaces first
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				matrix[row][column] = " ";
			}
		}

		// First row (full word)
		for (int position = 0; position < size; position++) {
			matrix[0][position] = word.substring(position, position + 1);
		}

		// Middle part
		for (int row = 1; row < size - 1; row++) {

			matrix[row][row] = word.substring(row, row + 1);

			matrix[row][size - 1 - row] =
					word.substring(size - 1 - row, size - row);
		}

		// Last row (full word)
		for (int position = 0; position < size; position++) {
			matrix[size - 1][position] =
					word.substring(position, position + 1);
		}
	}

	public String toString() {

		String output = "";

		for (int row = 0; row < word.length(); row++) {
			for (int column = 0; column < word.length(); column++) {
				output += matrix[row][column];
			}
			output += "\n";
		}

		return output;
	}
}
