package array_and_array_list.sort;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		sort();
	}

	public static void sort() {

		// to use cyclic sort range should be 0 -> n or 1-to n or similar in pattern
		int[] arr = { 2, 1, 5, 4, 3 };

		// here we have range 1 to n
		// index 0 1 2 3 4 5
		// arr-- 1 2 3 4 5 6

		// in cyclic sort we can stick start from index and proceed

		int i = 0;
		while (arr.length > i) {
			int currentIndex = arr[i] - 1;
			if (arr[currentIndex] != arr[i]) {
				int temp = arr[currentIndex];
				arr[currentIndex] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
