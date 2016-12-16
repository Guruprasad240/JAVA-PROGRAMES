import java.util.Scanner;
class  Spending
{
	public static void main(String[] args) 
	{
		String a;
		float per;
		float sum = 0;
		int b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Coustomer name\t:\t");
		a = s.next();
		System.out.print("How many iteams coustomer bought :\t");
		b = s.nextInt();
		float r[] = new float[b*2];
		for(int i=1;i<=b;i++)
		{
			System.out.println("Enter rate of"+i+" product\t:\t");
			float p = s.nextFloat();
			System.out.println("Enter quantity of "+i+" product :\t");
			int q = s.nextInt();
			r[i] = p*q;
			sum = sum+r[i];
		}
		System.out.println("Total amount "+a+" have to pay :\t"+sum);
		if(sum <= 10000)
		{
				per = (sum /10000)*100 ;
				System.out.println(a+" spending "+per+" Percentage of salary to purchase");
		}
		else
		{
			System.out.println(a+"you don't have enoughf money to purchage");
		}
		
	}
}
