package Demo;

public class Student {
	private int Id;
	private String name;
	private int age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = Id;
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
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}