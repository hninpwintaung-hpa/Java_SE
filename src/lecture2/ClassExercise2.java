package lecture2;

public class ClassExercise2 {
	public static void main(String[] args) {
		Grades2 grades2 = new Grades2();
		grades2.setName("Lily");
		
		// String studentName=grades2.getName();
		int total = grades2.getTotal(100, 100, 100);
		
		
		System.out.println(grades2.getName() + "'s grades : ");
		System.out.println("The total is " + total + " points");

	}
}
