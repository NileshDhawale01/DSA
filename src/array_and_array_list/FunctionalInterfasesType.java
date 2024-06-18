package array_and_array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfasesType {

	public static void main(String[] args) {

		// it has four type --> Functional Interfase
		// 1. Predicate --> boolean
		// 2. Consumer --> no result
		// 3. Function --> input and output
		// 4. supplier --> no input only supply

		class Student {

			Integer id;
			String studentName;
			String about;

			Student(Integer id, String studentName, String about) {
				this.id = id;
				this.studentName = studentName;
				this.about = about;
			}
		}

		Student student = new Student(1, "Nilesh", "Java Developer");
		// 1. predicate

		Predicate<Student> studentIdData = s -> s.id > 0;

		boolean result = studentIdData.test(student);
		System.out.println("Result is :: " + result);

		// 2. consumer --> no result

		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(100);
		numberList.add(200);
		numberList.add(300);
		numberList.add(400);

		Consumer<Integer> operationOnNumbers = s -> {
			System.out.println("We can do any operation here :: " + s * s);
		};

		numberList.stream().forEach(n -> {
			operationOnNumbers.accept(n);
		});

		// 3. Function --> Input Output

		Function<Integer, String> addAndMakeString = convert -> (convert + convert) + "";

		Integer num = 1000;
		System.out.println("Add and Making String :: " + addAndMakeString.apply(num));

		// 4. Supplier --> to input only supply

		Supplier<Integer> getOtp = () -> (int) (Math.random() * 9000) + 1000;

		System.out.println("get OTP :: " + getOtp.get());

	}
}
