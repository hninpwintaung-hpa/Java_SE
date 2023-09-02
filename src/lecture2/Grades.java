package lecture2;

public class Grades {
	private String name;
	private int english;
	private int math;
	private int science;

	public Grades() {
		name = "Dave";
		english = 100;
		math = 100;
		science = 100;
	}

	public String getName() {
		return name;
	}

	public void printTotal() {
		int total = english + math + science;
		System.out.println("The total is " + total + " points.");
	}
	
	public static void main(String[] args) {
		Grades grades=new Grades();
		System.out.println("Student name: " + grades.getName());
		grades.printTotal();
		
	}
}
