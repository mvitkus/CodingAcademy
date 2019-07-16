import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JavaStudentGroup {

	ArrayList<Student> Studentai = new ArrayList<Student>();

	public void runProgram() {

		addToArray();

		printStudents(Studentai);

		Collections.sort(Studentai);
		System.out.println("##############");
		printStudents(Studentai);

		System.out.println();

		ArrayList<Student> studentai1 = new ArrayList<Student>();
		ArrayList<Student> studentai2 = new ArrayList<Student>();
		ArrayList<Student> studentai3 = new ArrayList<Student>();
		ArrayList<Student> studentai4 = new ArrayList<Student>();

		int i = 0;
		while (i <= Studentai.size()) {

			studentai1.add(Studentai.get(i));
			i++;
			if (i == Studentai.size()) {
				break;
			}
			studentai2.add(Studentai.get(i));
			i++;
			if (i == Studentai.size()) {
				break;
			}
			studentai3.add(Studentai.get(i));
			i++;
			if (i == Studentai.size()) {
				break;
			}
			studentai4.add(Studentai.get(i));
			i++;
			if (i == Studentai.size()) {
				break;
			}
		}

		printStudents(studentai1);
		System.out.println("##########");
		printStudents(studentai2);
		System.out.println("##########");
		printStudents(studentai3);
		System.out.println("##########");
		printStudents(studentai4);
		System.out.println("##########");

	}

	public void printStudents(ArrayList<Student> listas) {
		for (int i = 0; i < listas.size(); i++) {
			System.out.println(listas.get(i));
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
		for (int i = 0; i < 4; i++) {
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
