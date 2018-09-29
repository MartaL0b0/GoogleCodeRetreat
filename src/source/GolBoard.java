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
		if (i == -1){
			i = height -1;
		}
		if (i == height){
			i = 0;
		}
		if (j == -1){
			j = width -1;
		}
		if (j == width){
			j = 0;
		}
		return this.cells[i][j];
	}

	public void setCell(int i, int j, int k) {
		this.cells[i][j] = k;
		
	}

	public int getNeighbours(int h, int w) {
		int count = 0;
		for (int i = h - 1; i < h+2; i++){
			for (int j = w -1; j < w +2; j++){
				count += this.getCell(i, j);
			}
		}
		
		return count - this.getCell(h, w);
	}

	public int getNextState(int i, int j) {
		
		return 0;
	}

	
	
}
