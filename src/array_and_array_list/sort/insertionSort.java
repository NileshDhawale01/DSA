package array_and_array_list.sort;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		insertionSorting();
	}

	public static void insertionSorting() {

		int[] arr = { 1, 5, 3, 2, 8, 6, 4, 7, 9 };

		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}
		System.out.println("Sorted Array Is :: " + Arrays.toString(arr));
	}
}
