package lecture5;

public class Student {
	private String  name = "Lily";
	private int age = 24;
	private String email = "lily@gmail.com";
	
	{
		name = "Pwint";
	}
	
	public Student() {
		
	}
	
	public Student(String name) {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
