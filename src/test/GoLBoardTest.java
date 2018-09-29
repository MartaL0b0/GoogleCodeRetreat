package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import source.GoLBoard;

public class GoLBoardTest {

	public GoLBoard board;
	@Before
	public void setUp() throws Exception{
		board = new GoLBoard(5, 5);
		board.initialise();
	}
	
	@Test
	public void testInit(){
		assertEquals(board.height, 5);
		assertEquals(board.width, 5);
	}
	
	@Test
	public void testCountNeighbours(){
		int neighbours = 0;
		
		assertEquals(board.countNeighbours(2,2,neighbours), 4);
		//assertEquals(board.countNeighbours(0,0), 1);
	}
}
