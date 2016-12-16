import java.util.Scanner;

class Pattern1 
{
	public static void main(String[] args) 
	{
     int n;
	 Scanner scan=new Scanner(System.in);
	 n=scan.nextInt();
    for(int i=0;i<n;i++)
		{
	for(int j=0;j<n;j++)
			{
	System.out.print((char)('A'+j));
	System.out.print(" ");
	}
	for(int k=n-i-1;k>0;k--)
			{System.out.print((char)('A'+k));
	}
	for(int l=0;l<=i;l++)
		{
	System.out.print(" ");
	
	}


	}
}

