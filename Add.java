package Practice;
import java.util.*;
public class  Add
{
	public void add()
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value \t:\t");
		a = s.nextInt();
		System.out.print("\nEnter b value \t:\t");
		b = s.nextInt();
		System.out.print("\nEnter c value \t:\t");
		c = s.nextInt();
		int d = a+b+c;
		System.out.println("\nTotal of a,b,c is \t:\t");
		System.out.println("\n Press '1' to find Grether number (or) Press any key to terminate \t:\t");
		int e = s.nextInt();
		if(e == 1)
		{
			int f;
			System.out.println("\nPress 1 to enter numbers again to find the greather number\n\t\t(OR)\nPress any number to find the greather number from above numbers:\t");
			f = s.nextInt();
			if(f == 1)
			{
				int g,h,i;
				Scanner z = new Scanner(System.in);
				System.out.print("Enter s value \t:\t");
				g = z.nextInt();
				System.out.print("\nEnter g value \t:\t");
				h = z.nextInt();
				System.out.print("\nEnter p value \t:\t");
				i = z.nextInt();
				if(g>h)
				{
					System.out.println("A is Greather");
				}
				else if(h>i)
				{
					System.out.println("B is Greather");
				}
				else
				{
					System.out.println("C is Greather");
				}
			}
			else
			{
				if(a>b)
				{
					System.out.println("A is Greather");
				}
				else if(b>c)
				{
					System.out.println("B is Greather");
				}
				else
				{
					System.out.println("C is Greather");
				}			
			}
		}
		else
		{
			System.out.println("Thank you for using our project");
		}
	}
}

