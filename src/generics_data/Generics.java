package generics_data;

public class Generics {

	static class Student {

		String name;
		String about;

		Student(String name, String about) {
			this.name = name;
			this.about = about;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAbout() {
			return about;
		}

		public void setAbout(String about) {
			this.about = about;
		}

	}

	static class Teacher {

		String teacherName;
		String teacherAbout;

		Teacher(String teacherName, String teacherAbout) {

			this.teacherName = teacherName;
			this.teacherAbout = teacherAbout;
		}

		public String getTeacherName() {
			return teacherName;
		}

		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}

		public String getTeacherAbout() {
			return teacherAbout;
		}

		public void setTeacherAbout(String teacherAbout) {
			this.teacherAbout = teacherAbout;
		}
	}

	public static <T> void handleData(T data) {

		// check which class instance is
		if (data instanceof Student) {

			Student student = (Student) data;
			System.out.println("student Information is :: \nStudent Name is :: " + student.getName()
					+ "\nStudent About is :: " + student.getAbout());
		} else if (data instanceof Teacher) {

			Teacher teacher = (Teacher) data;
			System.out.println("Teacher Information is :: \nTeacher Name is :: " + teacher.getTeacherName()
					+ "\nStudent About is :: " + teacher.getTeacherAbout());
		} else {
			System.out.println("given Object Belong to Unknown Source we cant Process it :: " + data);
		}
	}

	public static void main(String[] args) {

		Student student = new Student("Nilesh Dhawale", "Hii I'm Nilesh Dhawale");
		Teacher teacher = new Teacher("Pankaj Gurar", "Hii, Pankaj Gujar is the Teacher");

		handleData(student);
		System.out.println("\n-------------------------------------------------------\n");
		handleData(teacher);

	}
}
