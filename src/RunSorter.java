

public class RunSorter {
	
	private static void printArray(int[] array) {
		String toPrint = "[";
		for (int k = 0; k < array.length - 1; k++) {
			toPrint += "" + array[k] + ", ";
		}
		toPrint += "" + array[array.length - 1] + "]";
		System.out.println(toPrint);
	}

	public static void main (String[] args) {
		int size = 20;
		int[] unsorted = new int[size];
		for (int k = 0; k < size; k++) {
			unsorted[k] = (int)(Math.random() * size);
		}
		System.out.print("Unsorted array is: ");
		printArray(unsorted);
		System.out.print("Sorted array is (done via bubble sort): ");
		printArray(IntSorter.BubbleSort(unsorted.clone()));
	}
}
