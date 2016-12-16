import java.util.Scanner;
 class Progress 
 {
	public static void main(String[] args) 
	{
		float markes;
		String n;
		int a,b;
		float sum = 0;
		float per;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the student name\t:\t");
		n = s.next();
		System.out.print("how many subjects u have\t:\t");
		a = s.nextInt();
		System.out.print("how many markes you have per subject \t:\t");
		b = s.nextInt();
		int c[] = new int[a];
		int i=0;
		while(i<a)
		{
			System.out.print("Enter "+(i+1)+" subject markes\t:\t");
			c[i] = s.nextInt();
			sum = sum+c[i];
			if(c[i] <=b)
			{
				i++;	
			}
			else
			{
				System.out.println("your enterd subject "+i+" markes are invalid ");
			}	
		}
		System.out.println(n+" Total markes are \t:\t"+sum);
		per = (sum / (a*b))*100;
		System.out.println(n+" got "+per+" percentage");
		if(per>=85)
		{
			System.out.println(n+" got A+ Grade");
		}
		else if(per>=75)
		{
			System.out.println(n+" got A Grade");
		}
		else if(per>=65)
		{
			System.out.println(n+" got B Grade");
		}
		else if(per>=50)
		{
			System.out.println(n+" got c Grade");
		}
		else
		{
			System.out.println(n+" your fail ");
			System.out.println(n+" be prepare well for next exams");
		}
	}
}