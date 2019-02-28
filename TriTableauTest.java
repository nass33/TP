import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTrier() {
		fail("Not yet implemented");
	}

	@Test
	void testTriCroissant() {
		int valeursAV[] = {9,5,3};
		int valeursAP[] = {3,5,9};
		TriTableau.triCroissant(valeursAV);
		Assertions.assertEquals(valeursAP[0],valeursAV[0]);
	}

	@Test
	void testTriDecroissant()  {
		int valeursAV[] = {5,9,3};
		int valeursAP[] = {9,5,3};
		TriTableau.triDecroissant(valeursAV);
		Assertions.assertEquals(valeursAP[0],valeursAV[0]);
	}


}
