package source;



public class GoLBoard {
	public int height;
	public int width;
	
	public int[][] board;
	
	public GoLBoard(int h, int w){
		height = h;
		width = w;
		board = new int[h][w];
	}
	
	public void initialise(){
		board[height/2][width/2] = 1;
		board[height/2 - 1][width/2 - 1] = 1;
		board[height/2 - 1][width/2 + 1] = 1;
		board[height/2 + 1][width/2 - 1] = 1;
		board[height/2 + 1][width/2 + 1] = 1;
	}
	
	public void sumRow(int h, int w, int row, Integer sum){
		// use sum parameter as the counter, therefore always pass 0;
		for(int i = w-1; i<= w+1 ; i++){
			sum += board[row][i];
		}
		if (h == row) sum--;
	}
	
	public int countNeighbours(int h, int w, int neighbours){
		// use neighbours parameter as the counter, therefore always pass 0;
		
		sumRow(h, w, h-1, neighbours);
		sumRow(h, w, h, neighbours);
		sumRow(h, w, h+1, neighbours);
		return neighbours;
	}
}