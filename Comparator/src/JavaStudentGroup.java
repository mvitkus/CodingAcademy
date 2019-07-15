import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class JavaStudentGroup {
	

	ArrayList<Student> Studentai = new ArrayList<Student>();

//	public void printArray() {
//		for (int i = 0; i < Studentai.size(); i++) {
//			System.out.println("Vardas: " + Studentai.get(i).getVardas() + " " + "Pavarde: "
//					+ Studentai.get(i).getPavarde() + " " + "ID: " + Studentai.get(i).getStudentID());
//		}
//	}
	
	public void runProgram() {
		
		addToArray();
		printStudents();
		Collections.sort(Studentai);
		System.out.println("##############");
		printStudents();
	}

	public  void printStudents() {
		

		
		for(Student studentai : Studentai) {
			System.out.println(studentai);
			
		}
	}
	
	public void addToArray() {
		for (int i = 0; i < 20; i++) {
			String name = generateRandomString();
			String surname = generateRandomString();
			int id = Integer.parseInt(generateRandomIntID());
			Student student = new Student(name, surname, id);
			Studentai.add(student);

		}
	}

	private String generateRandomString() {

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}

	private String generateRandomIntID() {
		String AlphaNumericString = "1234567890";
		StringBuilder sb = new StringBuilder(11);
		for (int i = 0; i <= 6; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}
	
	

}
