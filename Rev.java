import java.util.Scanner;
class  Rev
{
	public static void main(String[] args) 
	{
		int a;
		int rev =0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number\t:\t");
		a = s.nextInt();
		while(a>0)
		{
			rev = (rev*10)+(a%10);
			a = a/10;
		}
		System.out.println("Reverse number\t:\t"+rev);
	}
}
