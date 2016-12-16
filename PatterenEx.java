import java.util.Scanner;
public class PatterenEx
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		int numofrows = sobj.nextInt();

		int rowcount = numofrows;
 
		System.out.println("Ready to print");

		for(int i=0;i<numofrows;i++)
		{
			for(int j = 1;j<+i*2;j++)
			{
				System.out.print("");
			}
		} 
		for(int j=1;j<=rowcount;j++)
		{
			System.out.println('A'+j);
		}
		for(int j=0;j>=1;j--)
		{
			System.out.println('A'+j);
		}
		System.out.println("");
		rowcount--;
			
	}

}
