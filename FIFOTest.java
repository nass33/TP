import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {
	protected FIFO fifo = null;
	protected ArrayList<Integer> list = new ArrayList<Integer>();

	@BeforeEach
	void setUp() throws Exception {
		fifo = new FIFO();
		fifo.add(9);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() throws Exception {
		list = fifo.getqueue();
		int last = list.get(list.size()- 1);
		assertEquals(9, last);
		
	}

	@Test
	void testFirst() {
		list = fifo.getqueue();
		int first = fifo.first();
		assertEquals(9, first);	
	}

	@Test
	void testIsEmpty() throws Exception {
		assertTrue(fifo.isEmpty());
	}

	@Test
	void testRemoveFirst() {
		fifo.removeFirst();
		int taille = fifo.size();
		assertEquals(0, taille);
	}

	@Test
	void testSize() {
		int taille = fifo.size();
		assertEquals(1, taille);
		
	}

}
