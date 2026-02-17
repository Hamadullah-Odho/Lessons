package spiral;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SpiralMatrix
{
	//define a matrix
	private int[][] matrix;
	private int size;

	public SpiralMatrix()
	{
	}

	public SpiralMatrix(int size)
	{
		this.size = size;
		matrix = new int[size][size];
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}

	public void createSpiral()
	{
		int currentRow = 0;
		int currentColumn = 0;
		int direction = 0;   // 0=down, 1=right, 2=up, 3=left

		for (int number = 1; number <= size * size; number++) {

			matrix[currentRow][currentColumn] = number;

			// Decide next move
			if (direction == 0) { // DOWN
				if (currentRow + 1 < size && matrix[currentRow + 1][currentColumn] == 0)
					currentRow++;
				else {
					direction = 1;
					currentColumn++;
				}
			}

			else if (direction == 1) { // RIGHT
				if (currentColumn + 1 < size && matrix[currentRow][currentColumn + 1] == 0)
					currentColumn++;
				else {
					direction = 2;
					currentRow--;
				}
			}

			else if (direction == 2) { // UP
				if (currentRow - 1 >= 0 && matrix[currentRow - 1][currentColumn] == 0)
					currentRow--;
				else {
					direction = 3;
					currentColumn--;
				}
			}

			else if (direction == 3) { // LEFT
				if (currentColumn - 1 >= 0 && matrix[currentRow][currentColumn - 1] == 0)
					currentColumn--;
				else {
					direction = 0;
					currentRow++;
				}
			}
		}
	}

	public String toString() {

		String output = "";

		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				output += String.format("%-5d", matrix[row][column]);
			}
			output += "\n";
		}

		return output;
	}
}