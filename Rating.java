import java.util.Scanner;
class  Rating
{
	public static void main(String[] args) 
	{
		String name;
		float avg,b;
		float sum = 0;
		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("how many coustomers rating you want to calculate :\t");
		a = s.nextInt();
		System.out.print("What is the maximum ratting points :\t");
		b = s.nextFloat();
		float r[] = new float[a*2];
		for(int i=1;i<=a;i++)
		{
			System.out.println("Enter "+i+"Coustomer name\t:\t");
			name = s.next();
			System.out.println("your "+i+"customer"+name+" entering rating you out of"+b+" :\t");
			r[i] = s.nextFloat();
			if (r[i]<=b)
			{
				sum = sum+r[i];
			}
			else
			{
				System.out.println("Your exteed maximum Rating Points limit");
				System.out.println("So it is naot consider");
			}
			
		}
		avg = sum / a ;
		System.out.println("Aevarage rating is "+avg);
	}
}
