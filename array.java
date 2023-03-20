package thrteenfeb;
import java.util.*;
public class array {
	int[] a;
	void read(int n)
	{
		a = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
	}
	void display()
	{
		System.out.println("array elements are: ");
		for(int ele:a)
			System.out.println(ele);
	}
	void sum()
	{
		int sum=0;
		for(int ele:a)
			sum = sum+ele;
		System.out.println("the sum is: "+sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of elements you want to enter");
		int n = sc.nextInt();
		array e = new array();
		e.read(n);
		e.display();
		e.sum();

	}

}
