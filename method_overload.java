package thrteenfeb;			// method overloading
import java.util.*;
public class method_overloading {
	int add(int x, int y)
	{
		return(x+y);
	}
	int add(int a, int b, int c)
	{
		return(a+b+c);
	}
	void add(String s, String y)
	{
		System.out.println(s+" "+y);
	}
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		method_overloading m = new method_overloading();
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		String s=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println("sum of a and b: "+m.add(a,b));
		System.out.println("sum of a and b: "+m.add(a,b,c));
		m.add(s,s2);
		

	}

}
