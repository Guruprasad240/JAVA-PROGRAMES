import java.util.*;
class Login 
{
	public void user()
	{
		String a;
		String c;
		int b,d;
		Scanner s = new Scanner(System.in);
		System.out.print("\n Enter ur user name\t:\t");
		a = s.next();
		System.out.print("\n Enter ur Password\t:\t");
		b = s.nextInt();
		System.out.println("\nyour account is successfuly created\n\nWELCOME TO HADOOP WORLD\n");
		System.out.print("\n Enter ur user name \t:\t");
		c = s.next();
		System.out.print("\n Enter ur Password\t:\t");  
		d = s.nextInt();
		if(b==d)
		{
			if(a.equals(c))
			{
				System.out.println("\nThank you for log in"+a+"\n");
				System.out.print(c+"Welcome to the Hadoop World");
			}
			else
			{
				System.out.print(c+"Check ur user name once");
			}
		}
		else
		{
			System.out.println("\nYour entered log id (or) Password is didn't matched\n");
			System.out.println("\nplease log in again\n"); 
		}
		System.out.print("\n"+a+" Thank you");
	}
	public static void main(String[] args) 
	{
		Login p = new Login();
		p.user();
	}
}
