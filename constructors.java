
import java.util.*;
public class Main
{	
    Scanner sc = new Scanner(System.in);
  
    String s = sc.nextLine();
    int a =sc.nextInt() ;
    int b= sc.nextInt();
  
    Main()    // constructor
    {
        a =110;
        b=140;
        s = "sai kumar";
    }
   
	public static void main(String[] args)  // main 
  {
	Main d = new Main();
	System.out.println("a : "+d.a+" b : "+d.b+ " string: "+d.s);
	System.out.println("enter a and b");
		
	}
}
