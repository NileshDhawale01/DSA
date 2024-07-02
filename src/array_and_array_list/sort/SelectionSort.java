package array_and_array_list.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		selectionSorting();
	}

	public static void selectionSorting() {

		// In Selection Sorting first we find max element in array
		// and put it in it's exact position
		// time complexity is O(n^2)

		int[] arr = { 1, 5, 4, 6, 3, 2, 9, 8, 7 };

		int maxIndex = -1;
		for (int i = 0; i < arr.length - 1; i++) {

			maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[maxIndex]) {
					maxIndex = j;
				}
			}

			// swap
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
		System.out.println("Sorted Array Is :: " + Arrays.toString(arr));
	}
}
