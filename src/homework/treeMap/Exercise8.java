package homework.treeMap;

import java.util.TreeMap;

public class Exercise8 {
	private TreeMap<Integer, String> studentMap = new TreeMap<>();

	public void addStudent(int studentID, String studentName) {
		studentMap.put(studentID, studentName);
	}

	public String getStudentName(int studentID) {
		return studentMap.get(studentID);
	}

	public static void main(String[] args) {
		Exercise8 student = new Exercise8();

		student.addStudent(123456, "Alice");
		student.addStudent(789012, "Bob");
		student.addStudent(345678, "Carol");

		int studentIDToFind = 789012;
		String studentName = student.getStudentName(studentIDToFind);

		System.out.println("Student with ID " + studentIDToFind + " is: " + studentName);

	}
}
