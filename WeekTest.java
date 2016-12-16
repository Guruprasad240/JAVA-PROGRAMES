import java.util.Scanner;
import java.io.*;
class  WeekTest
{
	public static void main(String[] args) 
	{
		
		//FileWriter fw = new FileWriter("d:\\guru" );
		Scanner s = new Scanner(System.in);
		System.out.println("Enter How many lines u want to type");
		int a = s.nextInt();
		String [] b = new String[a];
		for(int i = 0;i < a;i++)
		{
			System.out.println("Enter the"+(i+1)+" line");
			b[i] = s.next();

		}
		System.out.println();
		
	}
}
