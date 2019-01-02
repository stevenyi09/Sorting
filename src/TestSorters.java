import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSorters {
	int[] unsorted1, sorted1, unsorted2, sorted2;
	final int size1 = 50;
	final int size2 = 1000;

	@BeforeEach
	void setUp() throws Exception {
		unsorted1 = new int[size1];
		for (int k = 0; k < size1; k++) {
			unsorted1[k] = (int) (Math.random() * size1) + 1; 
		}
		sorted1 = unsorted1.clone();
		Arrays.sort(sorted1);
		unsorted2 = new int[size2];
		for (int k = 0; k < size1; k++) {
			unsorted2[k] = (int) (Math.random() * size2) + 1;
		}
		sorted2 = unsorted2.clone();
		Arrays.sort(sorted2);
	}

	@Test
	void testBubbleSort() {
		assertArrayEquals(sorted1, IntSorter.bubbleSort(unsorted1));
		assertArrayEquals(sorted2, IntSorter.bubbleSort(unsorted2));
		//fail("Not yet implemented");
	}
	
	@Test
	void testInsertionSort() {
		assertArrayEquals(sorted1, IntSorter.insertionSort(unsorted1));
		assertArrayEquals(sorted2, IntSorter.insertionSort(unsorted2));
	}

}
