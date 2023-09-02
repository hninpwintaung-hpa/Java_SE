package lecture2;

public class Grades3 {
	private String studentName;
	private int english;
	private int math;
	private int science;

	public Grades3(String tName, int tEng, int tMath, int tScience) {
		studentName = tName;
		english = tEng;
		math = tMath;
		science = tScience;
	}

	public String getName() {
		return studentName;
	}

	public int getTotal() {
		return english + math + science;
	}
}
