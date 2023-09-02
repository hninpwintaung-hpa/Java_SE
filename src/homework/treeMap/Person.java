package homework.treeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Map<Person, Integer> personMap = new TreeMap<>(Comparator.comparingInt(Person::getAge));

		Person person1 = new Person("Ashley", 24);
		Person person2 = new Person("Rosie", 25);
		Person person3 = new Person("Jennie", 26);

		personMap.put(person1, person1.getAge());
		personMap.put(person2, person2.getAge());
		personMap.put(person3, person3.getAge());
		
		for(Map.Entry<Person, Integer> map : personMap.entrySet()) {
			Person person = (Person) map.getKey();
			int age = map.getValue();
			System.out.println((person.getName()) + "'s age :" + age);
		}
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
