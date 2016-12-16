import java.util.Scanner;
public class FindDuplicateNumbers
{
public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many Numbers you want to enter ");
		int a = s.nextInt();

		int b[] = new int[a];

		int sum = 0;
		int partialSum = 0;

		for(int i=0; i<b.length; i++)
        {
			System.out.println("Enter "+(i+1)+" number you want to enter");
			b[i] = s.nextInt();
		
			for (int k=0; k<b.length; k++)
			{
				sum=sum+i;
			}
			for(int j=0; j<b.length-1; j++)
			{
				partialSum = partialSum+j;
			}
			int duplicateNumber = sum-partialSum;
			System.out.println("The duplicate number in the numbers: "+duplicateNumber);
		}
	}
}