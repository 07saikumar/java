package thrteenfeb;
import java.util.*;
public class sort {
	static int[] read(int n)
	{
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		return a;
		
	}
	static int[] srt(int[] a, int n)
	{
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++) 
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	static void dispaly(int a[],int n)
	
	{
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] k;
		k=read(n);
		k=srt(k,n);
		dispaly(k,n);
	

}
}
