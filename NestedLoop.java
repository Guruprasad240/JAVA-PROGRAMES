import java.util.Scanner;
class NestedLoop
{
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		int outerloop =0,innerloop = 0;
		for (outerloop = 0;outerloop<5 ;outerloop++)
		{
			for (innerloop = 1;innerloop <=outerloop ;innerloop++)
			{
				System.out.print(innerloop);
			}
			System.out.println("");
		}
		for (outerloop=5;outerloop>=0;outerloop--)
		{
			for (innerloop = 1;innerloop <=outerloop ;innerloop++)
			{
				System.out.print(innerloop);
			}
			System.out.println("");
		}
		
	}
}
