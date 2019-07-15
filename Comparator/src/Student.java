
public class Student {
	
	private String vardas;
	private String pavarde;
	private int studentID;
	
	public Student(String vardas, String pavarde, int studentID) {
		super();
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.studentID = studentID;
	}
	public String getVardas() {
		return vardas;
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public String getPavarde() {
		return pavarde;
	}
	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	

}
