package array_and_array_list.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LinearSearchQuestions {

	public static void main(String[] args) {

		// required data
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int target = 7;
		float arr2[] = { 1.2f, 3.4f, 6.0f, 9.2f };
		String[] arr3 = { "Data", "is", "very", "important", ".", "." };
		boolean[] arr4 = { true, true, true, true, true, true };
		char[] arr5 = { 'd', 'r', 'y', 'g', 'l', 'i' };

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(9);

		// method calls
		int questionOneAnswer = questionOne(arr, target);
		int countByQuestionTwo = questionTwo(arr, target);
		int maxByQuestionThree = questionThree(arr);
		float minCountQuestionFour = questionFour(arr2);
		boolean existByQuestionFive = questionFive(arr3, "important");
		int evenCountByQuestionSix = questionSix(arr);
		int firstIndexByQuestionSeven = questionSeven(arr3, ".");
		List<Integer> indisesByQuestionEighth = questionEighth(arr, 1);
		boolean allSameByuestionNine = questionNine(arr4, true);
		boolean ovelByQuestionTen = questionTen(arr5);

		int indexByQuestionArrayListOne = questionArrayListOne(list, 9);

		// checks
		System.out.println("Index is :: " + questionOneAnswer);
		System.out.println("Question Two Answer is :: " + countByQuestionTwo);
		System.out.println("Max is :: " + maxByQuestionThree);
		System.out.println("Min Value is :: " + minCountQuestionFour);
		System.out.println("Element is found :: " + existByQuestionFive);
		System.out.println("Even Count is :: " + evenCountByQuestionSix);
		System.out.println("First Index is :: " + firstIndexByQuestionSeven);
		indisesByQuestionEighth.forEach(e -> System.out.println("Element fount at index :: " + e));
		System.out.println("All Same is :: " + allSameByuestionNine);
		System.out.println("Vovel Contains is :: " + ovelByQuestionTen);

		System.out.println("Index is :: " + indexByQuestionArrayListOne);
	}
	// main end

	public static int questionOne(int[] arr, int target) {

		// Implement a function to perform linear search in an integer array and return
		// the index of a given element if found, otherwise return -1.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int questionTwo(int[] arr, int target) {

		// Modify the previous function to return the number of occurrences of the
		// element if found multiple times.
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		return count;
	}

	public static int questionThree(int arr[]) {

		// Write a function to find the maximum element in an integer array using linear
		// search.

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static float questionFour(float[] arr) {

		// Implement a function to find the minimum element in a floating-point array
		// using linear search.
		float min = 0.0f;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static boolean questionFive(String[] arr, String element) {

		// Create a function to determine if a specific element exists in a string array
		// using linear search.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	public static int questionSix(int[] arr) {

		// Write a function to count the number of even numbers in an array of integers
		// using linear search.
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int questionSeven(String[] arr, String element) {

		// Implement a function to find the first occurrence of a given element in an
		// array of strings using linear search.

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	public static List<Integer> questionEighth(int[] arr, int element) {

		// Create a function to find and return the indices of all occurrences of a
		// given element in an array of integers using linear search.

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				list.add(i);
			}
		}
		return list;
	}

	public static boolean questionNine(boolean[] arr, boolean target) {

		// Write a function to determine if all elements in an array of booleans are
		// true using linear search.

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		return count == arr.length;
	}

	public static boolean questionTen(char[] arr) {

		// Implement a function to check if an array of characters contains a vowel
		// using linear search.
		HashSet<Character> charSet = new HashSet<>();
		charSet.add('a');
		charSet.add('e');
		charSet.add('i');
		charSet.add('o');
		charSet.add('u');

		for (int i = 0; i < arr.length; i++) {
			if (charSet.contains(arr[i])) {
				return true;
			}
		}
		return false;
	}

	public static int questionArrayListOne(ArrayList<Integer> list, int element) {

		// Modify the linear search function to work with an ArrayList of integers and
		// return the index of the first occurrence of a given element.
		for (int i = 0; i < list.size(); i++) {
			if (element == list.get(i)) {
				return i;
			}
		}
		return -1;
	}
}
