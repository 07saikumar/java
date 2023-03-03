package javaprograms;
import java.util.*;
public class mout_char_art {
	Scanner sc = new Scanner(System.in);
	char c1,c2;
	void read() {
		c1 = sc.next().charAt(0);
		c2 = sc.next().charAt(0);
	}
	void art()
	{
		
		while(true) {
		System.out.println("choose 1.add 2.sub 3.multiplication 0. exit");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1 : System.out.println("sum of characters : "+(c1+c2));
		break;
		case 2 : System.out.println("difference of characters : "+(c1-c2));
		break;
		case 3 :System.out.println("product of characters :"+(c1*c2));
		break;
		default : System.exit(0);
		}
		System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("enter any two characters: ");
		mout_char_art c = new mout_char_art();
		c.read();
		c.art();

	}

}
