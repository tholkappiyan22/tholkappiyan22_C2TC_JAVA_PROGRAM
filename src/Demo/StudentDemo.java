package Demo;

public class StudentDemo {
	public static void main(String[]args) {
		Student st = new Student();
		st.setId(101);
		st.setName("kamini");
		st.setAge(20);
		System.out.println(st);
		
		Student st1 = new Student();
		st1.setId(102);
		st1.setName("thols");
		st1.setAge(20);
		System.out.println(st1);
	}

}
