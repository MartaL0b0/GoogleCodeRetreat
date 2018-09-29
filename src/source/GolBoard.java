package source;

public class GolBoard {

	public int width;
	public int height;
	public int[][] cells;
	
	public GolBoard(int i, int j) {
		this.height = i;
		this.width = j;
		this.cells = new int [i][j];
	}

	public int getCell(int i, int j) {
		
		return this.cells[i][j];
	}

	public void setCell(int i, int j, int k) {
		this.cells[i][j] = k;
		
	}

	public int getNeighbours(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
