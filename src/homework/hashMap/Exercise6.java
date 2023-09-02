package homework.hashMap;

import java.util.HashMap;
import java.util.Map;

import homework.treeMap.Student;

public class Exercise6 {
	 public static void main(String[] args) {
	        HashMap<String, Double> studentGradeMap = new HashMap<>();

			Student s1= new Student("Ashley",  85.0);
			Student s2= new Student("Cathy", 90.0);
			Student s3= new Student("Ariana", 76.5);
			Student s4= new Student("Selena", 82.5);
			Student s5= new Student("Cardi", 76.0);
			
			studentGradeMap.put(s1.getName(),s1.getGrade());
			studentGradeMap.put(s2.getName(),s2.getGrade());
			studentGradeMap.put(s3.getName(),s3.getGrade());
			studentGradeMap.put(s4.getName(),s4.getGrade());
			studentGradeMap.put(s5.getName(),s5.getGrade());
			
	        double grade = 85.0;
	        printstudentGradeMapAboveGrade(studentGradeMap, grade);
	    }

	    public static void printstudentGradeMapAboveGrade(Map<String, Double> gradeMap, double grade) {
	        System.out.println("Students who scored above " + grade + ":");
	        for (Map.Entry<String, Double> entry : gradeMap.entrySet()) {
	            if (entry.getValue() > grade) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }
}
