//Just a class to implement a bunch of different ways to sort integers.
public class IntSorter {

	public static int[] BubbleSort(int[] list) {
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
	
}
