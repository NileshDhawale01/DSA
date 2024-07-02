package array_and_array_list.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 5, 6, 2, 9, 8 };
		System.out.print("Sorted Array is :: " + Arrays.toString(bubbleSort(arr)));
	}

	public static int[] bubbleSort(int[] arr) {

		// loop goes 0 to n-1
		for (int i = 0; i < arr.length; i++) {

			// loop goes 0 to n-1-i
			for (int j = 0; j < arr.length - i - 1; j++) {

				// if swap need then swap
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
