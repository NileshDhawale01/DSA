package recursion;

public class Numbers {

	public static void main(String[] args) {

		numberPrint(1);
	}

	public static void numberPrint(int number) {

		// base condition for control recursion
		if (number > 10)
			return;
		System.out.println(number);
		numberPrint(number + 1);
	}
}
