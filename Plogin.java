package Practice;
import java.util.*;
public class  Plogin
{
	public  void login()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Welcome to the Project Please Login \t:\t");
		int a;
		System.out.print("Please Enter your pin");
		a = s.nextInt();
			if(a == 347)
			{
				System.out.print("Mr.GuruPrasad Welcome to the project ");
			}
			else if(a == 348)
			{
				System.out.print("Miss.Lavanya Welcome to the project");
			}
			else if(a == 349)
			{
				System.out.print("Mr.Arun Welcome to the project ");
			}
			else if(a == 350)
			{
				System.out.print("Miss.Renuka Welcome to the project");
			}
			else if(a == 353)
			{
				System.out.print("Mr.Bhanu Welcome to the project");
			}
			else if(a == 351)
			{
				System.out.print("Mr.Aniketh Welcome to the project");
			}
			else if(a == 352)
			{
				System.out.print("Mr.Prudvi Welcome to the project");
			}
			else
			{
				System.out.println("You r not a authorised user");
			}
	}
}