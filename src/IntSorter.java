//Just a class to implement a bunch of different ways to sort integers.
public class IntSorter {

	/**
	 * Bubble sort.
	 * <p>
	 * This method takes the input list and sorts it in-place using bubble sort.
	 * Optimized by reducing the method calls inside the loops. Still takes
	 * quadratic time, though.
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

	/**
	 * Insertion sort
	 * <p>
	 * Sorts an array of integers via insertion sort. Done in-place. O(n^2) time
	 * complexity.
	 * </p>
	 * 
	 * @param list Unsorted list.
	 * @return Sorted list. Same address as the parameter list.
	 */

	public static int[] insertionSort(int[] list) {
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

	/**
	 * Selection sort.
	 * <p>
	 * Sorts an input list via the selection sort algorithm.
	 * </p>
	 * 
	 * @param list Input list, presumably unsorted.
	 * @return The same list, now sorted in ascending order.
	 */
	public static int[] selectionSort(int[] list) {
		int temp, minIndex = 0, length = list.length;
		for (int k = 0; k < length; k++) {
			minIndex = k;
			for (int i = k; i < length; i++) {
				if (list[i] < list[minIndex]) {
					minIndex = i;
				}
			}
			temp = list[k];
			list[k] = list[minIndex];
			list[minIndex] = temp;
		}
		return list;
	}

	/**
	 * Merge sort.
	 * <p>
	 * Sorts an input list via merge sort.
	 * </p>
	 * 
	 * @param list Input list, unsorted.
	 * @return Sorted list with all the elements of the input list. Will be at a
	 *         different address.
	 */
	public static int[] mergeSort(int[] list) {
		int[] sorted = mergeSortHelper(list);
		for (int k = 0; k < list.length; k++) {
			list[k] = sorted[k];
		}
		return list;
	}

	/**
	 * Merge sort helper.
	 * <p>
	 * Helper method for the main mergeSort() method. On second inspection, this
	 * helper method might as well be merged with the public method, as it's got
	 * nothing extra.
	 * </p>
	 * 
	 * @param list Unsorted list.
	 * @return List, sorted.
	 */
	private static int[] mergeSortHelper(int[] list) {
		int length = list.length;
		if (length < 2) {
			return list;
		} else {
			int split = length / 2;
			int[] left = new int[split];
			int[] right = new int[length - split];
			for (int k = 0; k < length; k++) {
				if (k < split) {
					left[k] = list[k];
				} else {
					right[k - split] = list[k];
				}
			}
			return merge(mergeSortHelper(left), mergeSortHelper(right));
		}
	}

	/**
	 * Merges two arrays.
	 * <p>
	 * Takes two sorted input arrays, starting at the beginning of each array, and
	 * adding the lesser of the arrays' values to the merged array.
	 * </p>
	 * 
	 * @param left  One of the arrays to be merged, called "left" for convenience.
	 *              Assumed to already be sorted.
	 * @param right One of the arrays to be merged, called "right" for convenience.
	 *              Assumed to already be sorted.
	 * @return An array with all of left's and right's values. This new array should be sorted.
	 */
	private static int[] merge(int[] left, int[] right) {
		int[] sorted = new int[left.length + right.length];
		int leftIndex = 0, rightIndex = 0;
		for (int k = 0; k < sorted.length; k++) {
			if (leftIndex >= left.length) {
				sorted[k] = right[rightIndex];
				rightIndex++;
			} else if (rightIndex >= right.length) {
				sorted[k] = left[leftIndex];
				leftIndex++;
			} else if (left[leftIndex] <= right[rightIndex]) {
				sorted[k] = left[leftIndex];
				leftIndex++;
			} else if (right[rightIndex] < left[leftIndex]) {
				sorted[k] = right[rightIndex];
				rightIndex++;
			}
		}
		return sorted;
	}
}
