package homework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Student {
  public static void main(String[] args) {
	  Map<String, Integer> students = new HashMap<>();
	  
	  students.put("Ashley", 89);
	  students.put("Rosie", 78);
	  students.put("Christine", 85);
	  
	  students.forEach((name,score)->System.out.println(name + "," + score));
	  
  }
}
