import java.util.Scanner;
public class Mycal
{
	public static void main(String[] args)
	{
		int n1,n2,result,choice;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter your first number");
		
		n1 =sobj.nextInt();
		System.out.println("Please enter your secoend number");
		
		n2 =sobj.nextInt();
		System.out.println("Please enter your choice number");
		
		choice =sobj.nextInt();
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for Sub");
		System.out.println("Press 3 for Mul");
		System.out.println("Press 4 for Div");
		
		switch(choice)
		{
		case 1:
		
			result = cobj.add(n1,n2);
			System.out.println("Result is "+result);
		
		break;
		case 2:
		
			result = cobj.add(n1,n2);
			System.out.println("Result is "+result);
	
		
		case 3:
		
			result = cobj.add(n1,n2);
			System.out.println("Result is "+result);
	
		
		case 4:
		
			result = cobj.add(n1,n2);
			System.out.println("Result is "+result);
		
		break;
		}
	}
}
class Calculator
{
	int result;

// wheen programmerwant to provide the data to function while calling
//programmer use function parameter which can be provided in 2 ways
//value and reference

	public int add(int num1,int num2)
	{
		result = num1+num2;
		return result;

	}

	public int add(int num1,int num2)
	{
		result = num1*num2;
		return result; 

	}

	public int mul(int num1,int num2)
	{
		result = num1-num2;
		return result;
	}

	public int div(int num1,int num2)
	{
		result = num1/num2;
		return result;

	}

}
