package lecture2;

public class Grades2 {
	private String studentName;
	
	public void setName(String tName) {
		studentName= tName;
	}
	public String getName() {
		return studentName;
	}
	public int getTotal(int tEng, int tMath, int tScience) {
		return  tEng+ tMath+ tScience;
	}

}
