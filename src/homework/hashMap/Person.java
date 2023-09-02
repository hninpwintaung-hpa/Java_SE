package homework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Person {

	 private String name;
	 private int age;
	 
	 public Person(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 public static void main(String[] args) {
		 
		 Map<Object , Integer> personMap = new HashMap<>();
		 
		 Person person1 = new Person("Ashley", 23);
		 Person person2 = new Person("Rosie", 25);
		 Person person3 = new Person("Christine", 30);
		 
		 personMap.put(person1,person1.getAge());
		 personMap.put(person2,person2.getAge());
		 personMap.put(person3,person3.getAge());
		 
		 personMap.forEach((person, age)->System.out.println(((Person) person).getName() + "," + age));
		 
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
