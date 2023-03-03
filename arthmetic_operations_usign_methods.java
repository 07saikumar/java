package javaprograms;
import java.util.*;
public class artithmeti_methods {
	Scanner sc = new Scanner(System.in);
	int a,b;
	void read() {
		a =sc.nextInt();
		b= sc.nextInt();
	}
	void add() {
		int add = a+b;
		System.out.println("sum is: "+add);
	}
	void sub() {
		int sub = a-b;
		System.out.println("difference is: "+sub);
	}
	void mul() {
		int mul = a*b;
		System.out.println("proudct is: "+mul);
	}

	public static void main(String[] args) 
	{
		
		System.out.println("enter a and b values: ");
		
		artithmeti_methods s = new artithmeti_methods();
		s.read();
		s.add();
		s.sub();
		s.mul();
		
		

	}

}
