//Just a class to implement a bunch of different ways to sort integers.
public class IntSorter {

	/**
	 * Bubble sort.
	 * <p>
	 * This method takes the input list and sorts it in-place using bubble sort.
	 * Optimized by reducing the method calls inside the loops.
	 * </p>
	 * 
	 * @param list The list to be sorted.
	 * @return The same list, now sorted.
	 */
	public static int[] bubbleSort(int[] list) {
		int temp;
		int length = list.length;
		for (int k = 0; k < length; k++) {
			for (int i = 0; i < length - k - 1; i++) {
				if (list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}
		return list;
	}

	public static int[] InsertionSort(int[] list) {
		int temp;
		int start;
		int length = list.length;
		for (int k = 1; k < length; k++) { // we can skip the first index, since it's already sorted. This'll also avoid
											// ArrayIndexOutofBounds exceptions, as we'll always stop at the second to
											// last element in our comparisons.
			start = k;
			while (start > 0 && list[start] < list[start - 1]) {
				temp = list[start];
				list[start] = list[start - 1];
				list[start - 1] = temp;
				start--;
			}
		}
		return list;
	}
}
