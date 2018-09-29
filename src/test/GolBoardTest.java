package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import source.GolBoard;

public class GolBoardTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitial() {
		GolBoard b = new GolBoard(1, 2);
		assertEquals(1, b.height);
		assertEquals(2, b.width);
	}

	@Test
	public void testGetCell(){
		GolBoard b = new GolBoard(1, 2);
		b.setCell(0, 0, 1);
		assertEquals(1, b.getCell(0,0));
	}
	
	@Test
	public void testGetNighbours(){
		GolBoard b = new GolBoard(3, 3);
		//b.setCell(0, 0, 1);
		assertEquals(0, b.getNeighbours(1,1));
	}
	
	@Test
	public void testGetNighbours1(){
		GolBoard b = new GolBoard(3, 3);
		//b.setCell(0, 0, 1);
		assertEquals(0, b.getNeighbours(0,0));
	}
	
	@Test
	public void testAliveToDeadLow(){
		GolBoard b = new GolBoard(3, 3);
		b.setCell(1, 1, 1);
		assertEquals(0, b.getNextState(1,1));
	}
	
	@Test
	public void testAliveToAliveHigh(){
		GolBoard b = new GolBoard(3, 3);
		b.setCell(1, 1, 1);
		b.setCell(0, 1, 1);
		b.setCell(1, 0, 1);
		b.setCell(1, 2, 1);
		assertEquals(1, b.getNextState(1,1));
	}
	
	@Test
	public void testAliveToDeadHigh(){
		GolBoard b = new GolBoard(3, 3);
		b.setCell(1, 1, 1);
		b.setCell(0, 1, 1);
		b.setCell(1, 0, 1);
		b.setCell(1, 2, 1);
		b.setCell(2, 2, 1);
		assertEquals(0, b.getNextState(1,1));
	}
	
	@Test
	public void testDeadToAliveHigh(){
		GolBoard b = new GolBoard(3, 3);
		b.setCell(1, 1, 0);
		b.setCell(0, 1, 1);
		b.setCell(1, 0, 1);
		b.setCell(1, 2, 1);
		assertEquals(1, b.getNextState(1,1));
	}
	
	@Test
	public void testDeadToDead(){
		GolBoard b = new GolBoard(3, 3);
		b.setCell(1, 1, 0);
		b.setCell(0, 1, 1);
		b.setCell(1, 0, 1);
		
		assertEquals(0, b.getNextState(1,1));
	}
}
