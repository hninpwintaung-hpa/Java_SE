package lecture12;

public class Student {
	public static int totalStudents = 0;
	public String name;
	public String id;

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
       totalStudents +=1;
	}
	
	public static void main(String[] args) {
		Student student1= new Student("Alice","1");
		Student student2 = new Student("Bryan","2");
		
		System.out.println(student1.name);
		System.out.println(student2.name);
		System.out.println(Student.totalStudents);
	}
}
