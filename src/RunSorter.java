import java.util.Arrays;
import java.util.Collections;

/*Currently, this class only tests the sorts one by one. It's rather inefficient,
 * and I imagine it'll get pretty cumbersome by the time I implement all the sorts
 * I want to. Eventually, I'll create some sort of way to select sorts, so I'll only
 * have to run the new ones. Or I'll build the GUI first.
 */

public class RunSorter {

	private static void printArray(int[] array) {
		String toPrint = "[";
		for (int k = 0; k < array.length - 1; k++) {
			toPrint += "" + array[k] + ", ";
		}
		toPrint += "" + array[array.length - 1] + "]";
		System.out.println(toPrint);
	}

	public static void main(String[] args) {
		final int size = 20;
		int[] unsorted = new int[size];
		int[] sorted = new int[size];
		for (int k = 0; k < size; k++) {
			unsorted[k] = (int) (Math.random() * size);
		}
		System.out.print("Unsorted array is: ");
		printArray(unsorted);
		System.out.println("Sorted arrays via different algorithms (should all be the same):");
		System.out.print("Arrays.sort(): (answer key of sorts HAHA): ");
		sorted = unsorted.clone();
		Arrays.sort(sorted);
		printArray(sorted);
		System.out.print("Bubble sort: ");
		printArray(IntSorter.bubbleSort(unsorted.clone()));
		System.out.print("Insertion sort: ");
		printArray(IntSorter.insertionSort(unsorted.clone()));
	}
}
