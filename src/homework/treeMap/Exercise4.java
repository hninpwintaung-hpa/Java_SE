package homework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise4 {
  
	public static void main(String[] args) {
		Map<String, Double> students =new TreeMap<>();
		
		Student s1= new Student("Ashley",  85.0);
		Student s2= new Student("Cathy", 90.0);
		Student s3= new Student("Ariana", 76.5);
		Student s4= new Student("Selena", 82.5);
		Student s5= new Student("Cardi", 76.0);
		
		students.put(s1.getName(),s1.getGrade());
		students.put(s2.getName(),s2.getGrade());
		students.put(s3.getName(),s3.getGrade());
		students.put(s4.getName(),s4.getGrade());
		students.put(s5.getName(),s5.getGrade());
		
		findAllStudentAboveGrade(76.5, students);
	}
	
	public static void findAllStudentAboveGrade(double grade, Map<String, Double> students) {
		for(Map.Entry<String, Double> student : students.entrySet()) {
			if(student.getValue() > grade) {
				System.out.println(student.getKey() + " : " + student.getValue());
			}
		}
		
	}
}
