package day4;

public class StudentDemo {
	public static void main(String[]args) {
		Student st=Student.getObj();
		
		st.setSid(101);
		st.setSname("thols");
		System.out.println(st);
		
		Student st1=Student.getObj();
		st1.setSid(102);
		st1.setSname("kamini");
		System.out.println(st1);
		
		
		
	}
}
