package array_and_array_list.sort;

import java.util.Arrays;

public class CyclicSortQuestions {

	public static void main(String[] args) {
		questionOne();
		
		
	}

	public static void questionOne() {

		// 0 - n
		int[] arr = {  1, 2, 4, 3, 5 };

		int i = 0;
		while (i < arr.length) {

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
