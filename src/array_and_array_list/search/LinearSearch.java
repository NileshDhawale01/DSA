package array_and_array_list.search;

public class LinearSearch {

	public static void main(String[] args) {

		// linear search
		// basically it will more usefull when we have unsorted data
		// O(n)

		Integer[] arr = { 1, 2, 4, 3, 9, 7, 8, 6 };

		System.out.println("Best Condition :: " + getElementIndex(arr, 1));
		System.out.println("Worst Condition :: " + getElementIndex(arr, 10));
		System.out.println("Ideal Condition :: " + getElementIndex(arr, 3));

	}

	public static Integer getElementIndex(Integer[] arr, Integer element) {

		if (arr.length == 0) {
			return -1;
		}

		for (int intex = 0; intex < arr.length; intex++) {
			if (arr[intex] == element) {
				return intex;
			}
		}

		return -1;

	}
}
