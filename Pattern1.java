import java.util.Scanner;

class Pattern1 
{
	public static void main(String[] args) 
	{
     int n;
	 Scanner scan=new Scanner(System.in);
	 System.out.print(" Enter how many lines you want :\t");
	 n=scan.nextInt();
    for(int i=0;i<n;i++)
		{
     for(int l=0;l<i;l++)
		{
	System.out.print(" ");
		}
	for(int j=0;j<n-i;j++)
			{
		//System.out.print(" ");
		char c = (char)('A'+j);
		System.out.print(" ");
	//System.out.print((char)('A'+j));
	System.out.print(c);
	System.out.print(" ");
	}
	System.out.print(" ");
	for(int k=n-i-2;k>=0;k--)
			{
		System.out.print((char)('A'+k));
		System.out.print(" ");
	}
System.out.println(" ");
	}
}
}

