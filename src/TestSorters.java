import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSorters {
	int[] unsorted;
	final int size = 50;

	@BeforeEach
	void setUp() throws Exception {
		unsorted = new int[size];
		for (int k = 0; k < size; k++) {
			unsorted[k] = (int) (Math.random() * size) + 1; 
		}
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
