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

}
