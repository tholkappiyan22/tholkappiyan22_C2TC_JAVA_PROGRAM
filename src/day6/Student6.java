package day6;

public class Student6  {
	private String sname;
	private int reg;
	private static int id;
	private static final int x = 0;
	
	static {
		System.out.println("static block executed");
	}
	
		public Student6() {
			id++;
			reg++;
		// TODO Auto-generated constructor stub
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public int getReg() {
			return reg;
		}

		public void setReg(int reg) {
			this.reg = reg;
		}

		public static int getId() {
			return id;
		}

		public static void setId(int id) {
			Student6.id = id;
		}

		@Override
		public String toString() {
			return "Student6 [id= " + id +","+ " sname= "+sname + ", reg=" + reg + "]";
		}
		
}



	