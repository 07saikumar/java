package thrteenfeb;
//import java.util.*;
public class Finalize_method {
	
	public static void main(String[] args)
	{	
		Finalize_method d = new Finalize_method();
		System.out.println("Hash Code:"+d.hashCode());
		d=null;
		System.gc();		// garbage collector method under System....
		System.out.println("garbage collected end!!");
	}
	protected void finalize()			/* protected: is a key word to make ensure that 
			the particular defined is available only under (gc) garbage collector */
	
										// finalize is an inbuilt method
	{
		System.out.println("exectuing finalize method");
	}
	
	

}
