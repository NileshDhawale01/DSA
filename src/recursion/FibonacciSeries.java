package recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		//fibonacci index 0 1 2 3 4 5 6 7 8
		//--------------- 0 1 1 2 3 5 8 13 21
		int position = 4;
		int ans = fibonacci(position);
		System.out.println("Number at " + position + " in fibocacci series is :: " + ans);
	}

	public static int fibonacci(int number) {

		if (number < 2) {
			return number;
		}
		// f(n) = f(n-1)+f(n-2)
		return fibonacci(number - 1) + fibonacci(number - 2);

	}
}
