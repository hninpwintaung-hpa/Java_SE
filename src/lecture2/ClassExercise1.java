package lecture2;

public class ClassExercise1 {
	public static void main(String[] args) {
		Grades grades=new Grades();
		String studentName=grades.getName();
		System.out.print(studentName+"'s grades : ");
		grades.printTotal();
	}

}
