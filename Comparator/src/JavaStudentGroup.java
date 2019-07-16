import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JavaStudentGroup {

	ArrayList<Student> Studentai = new ArrayList<Student>();

	public void runProgram() {

		addToArray();
//		Student student1 = new Student("AA", "AC", 123);
//		Student student2 = new Student("AA", "AB", 123);
//		Student student3 = new Student("AA", "AB", 127);

//		Studentai.add(student1);
//		Studentai.add(student2);
//		Studentai.add(student3);
		printStudents();

		Collections.sort(Studentai);
		System.out.println("##############");
		printStudents();
	}

	public void printStudents() {
		for (Student studentai : Studentai) {
			System.out.println(studentai);
		}
	}

	public void addToArray() {
		for (int i = 0; i < 20; i++) {
			String name = generateRandomString().substring(0, 1).toUpperCase()
					+ generateRandomString().substring(1).toLowerCase();
			String surname = generateRandomString().substring(0, 1).toUpperCase()
					+ generateRandomString().substring(1).toLowerCase();
			int id = Integer.parseInt(generateRandomIntID());
			Student student = new Student(name, surname, id);
			Studentai.add(student);

		}
	}

	private String generateRandomString() {

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < getRandomNumberInRange(4, 8); i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}

	private String generateRandomIntID() {
		String AlphaNumericString = "1234567890";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <4; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
