package lecture2;

public class ClassExercise3 {
	public static void main(String[] args) {
		Grades3 grades3 = new Grades3("Lily", 100, 95, 100);

		String studentName = grades3.getName();
		int total = grades3.getTotal();

		System.out.println(studentName + "'s grades : ");
		System.out.println("The total is " + total + " points");
	}

}
