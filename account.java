package javaprograms;
import java.util.*;		// account, deposit money,withdraw money current balance amount. 
public class Account {
	Scanner sc = new Scanner(System.in);
	int balance;
	void create() {
		System.out.println("enter the account holder name to be created: ");
		String name = sc.nextLine();
		System.out.println("account successfully created for "+name+" 🫡🫡");
		
		
	}
	void deposit() {
		System.out.println("enter the amout to be deposited");
		int amount = sc.nextInt();
		balance = balance +amount;
		System.out.println("available balance: "+balance);
	}
	void withdraw() {
		System.out.println("enter the amount to be withdrawl");
		int draw = sc.nextInt();
		if(draw>balance)
			System.out.println("insufficient balance");
		else
			{
			balance = balance-draw;
			System.out.println("available balance: "+balance);
			}
	}
	void current() {
		System.out.println("available balance: "+balance);
	}

	public static void main(String[] args) 
	{
		Account a = new Account();
		Scanner sc = new Scanner(System.in);	// create deposit withdraw current
		while(true) {			
		System.out.println("1.create 2.deposit 3.withdraw 4.current 5.exit");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1 :a.create();
				while(true)
				{
					System.out.println("2.deposit 4.current 5.exit");
					int k = sc.nextInt();		// 2 4 5
					switch(k)
					{
					case 2: a.deposit();
					break;
					case 4: a.current();
					break;
					case 5: break;
					}		
				}
			

		case 2: a.deposit();
		break;
		case 3 : a.withdraw();
		break;
		case 4: a.current();
		break;
		case 5 : System.exit(0);
		
		}
		System.out.println("\n");
		}
		

	}

}
