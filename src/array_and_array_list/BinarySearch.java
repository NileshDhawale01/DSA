package array_and_array_list;

public class BinarySearch {

	public static void main(String[] args) {

		// if data is sorted we can use it very effectively
		// O(log n)
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Index of 7 is :: " + getIndexOfElement(arr, 7));
		System.out.println("Index of 10 is :: " + getIndexOfElement(arr, 10));
		System.out.println("Index of 1 is :: " + getIndexOfElement(arr, 1));
		System.out.println("Index of 100 is :: " + getIndexOfElement(arr, 100));

	}

	public static Integer getIndexOfElement(int[] arr, int element) {

		// here we can use while loop
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			// fine mid
			int mid = (start + end) / 2;

			if (arr[mid] == element)
				return mid;
			// if element is greater than mid element
			if (element > arr[mid]) {
				start = mid + 1;
			} else {
				// element is smaller than mid element
				end = mid - 1;
			}
		}
		return -1;
	}
}
