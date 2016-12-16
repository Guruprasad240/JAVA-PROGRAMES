import java.util.Scanner;
class Ptest 
{
	public static void main(String[] args) 
	{
		float per;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter percentage :\t");
		per = s.nextFloat();
		if(per>85)
		{
			System.out.println(" got A+ Grade");
		}
		else if(per>75)
		{
			System.out.println(" got A Grade");
		}
		else if(per>65)
		{
			System.out.println(" got B Grade");
		}
		else if(per>50)
		{
			System.out.println(" got c Grade");
		}
		else
		{
			System.out.println(" your fail ");
			System.out.println(" be prepare well for next exams");
		}
	}
}
