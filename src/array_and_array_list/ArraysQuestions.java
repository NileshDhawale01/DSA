package array_and_array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysQuestions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Question :: ");
		int number = scanner.nextInt();

		switch (number) {
		case 1: {
			questionOne();
			break;
		}
		case 2: {
			questionTwo();
			break;
		}
		case 3: {
			questionThree();
			break;
		}
		case 4: {
			questionFour();
			break;
		}
		case 5: {
			questionFive();
			break;
		}
		case 6: {
			questionSix();
			break;
		}
		default:
			System.out.println("Use Correct Number !!");
		}
		scanner.close();
	}

	public static void questionOne() {

		// Given an integer array nums of length n, you want to create an array ans of
		// length 2n
		// where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
		// Specifically, ans is the concatenation of two nums arrays.Return the array
		// ans.

		int nums[] = { 0, 2, 1, 5, 3, 4 };
		int n = nums.length;

		// ans
		int ans[] = new int[2 * n];
		for (int i = 0; i < n; i++) {
			ans[i] = nums[i];
			ans[i + n] = nums[i];
		}

		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

	public static void questionTwo() {

		// Given a zero-based permutation nums (0-indexed), build an array ans
		// of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length
		// and return it.
		// A zero-based permutation nums is an array of distinct integers from 0 to
		// nums.length - 1 (inclusive).

		int[] nums = { 5, 0, 1, 2, 3, 4 };

		int ans[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}

		for (int a : ans) {
			System.out.print(a + " ");
		}
	}

	public static void questionThree() {

		// Given an array of integers nums, return the number of good pairs.
		// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

		int[] nums = { 1, 2, 3, 1, 1, 3 };
		int goodPair = 0;

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i < j) {
					goodPair++;
				}
			}
		}

		System.out.println("Good Pair Count is :: " + goodPair);
	}

	public static void questionFour() {

		// There is a programming language with only four operations and one variable X:
		// ++X and X++ increments the value of the variable X by 1.
		// --X and X-- decrements the value of the variable X by 1.
		// Initially, the value of X is 0.
		// Given an array of strings operations containing a list of operations,
		// return the final value of X after performing all the operations.

		String[] operations = { "--X", "X++", "X++" };

		int finalValue = 0;

		for (String a : operations) {
			if (a.equals("++X") || a.equals("X++"))
				finalValue++;
			else if (a.equals("--X") || a.equals("X--"))
				finalValue--;
		}

		System.out.println("final Value is :: " + finalValue);
	}

	public static void questionFive() {

		// Given the array nums consisting of 2n elements in the form
		// [x1,x2,...,xn,y1,y2,...,yn].
		// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		boolean first = true;

		int indexOne = 0;
		int indexTwo = n;
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {

			if (first) {
				ans[i] = nums[indexOne++];
				first = false;
			} else {
				ans[i] = nums[indexTwo++];
				first = true;
			}
		}

		for (int a : ans)
			System.out.print(a + " ");

	}

	public static void questionSix() {

		// You are given a 0-indexed array of strings words and a character x.
		// Return an array of indices representing the words that contain the character
		// x.
		// Note that the returned array may be in any order.

		String[] words = { "abc", "bcd", "aaaa", "cbc" };
		char x = 'a';

		List<Integer> result = new ArrayList<>();
		int index = 0;
		for (String word : words) {

			if (word.contains(String.valueOf(x))) {
				result.add(index);
			}
			index++;
		}

		for (int a : result)
			System.out.print(a + " ");

	}
}
