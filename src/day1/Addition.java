package day1;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		int a,b,c;
		Scanner Sc;
		Sc = new Scanner(System.in);
		
		System.out.print("enter a ");
		a= Sc.nextInt();
		System.out.print("enter b ");
		b= Sc.nextInt();
		c= a+b;
		System.out.println("addition of a " +a+ "and b= "+b+ " is "+c);
		
	}

}
