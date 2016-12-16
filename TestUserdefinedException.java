import java.io.*;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{	
		super(s);
	}
}
class TestUserdefinedException
{
	public static void votingeligibility(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("not valid age");
		}
		else
		{
			System.out.println("Eligible for voting");
		}
	}
	public  static void main(String[] args)
	{
		try
		{
			votingeligibility(24);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception Occured");
		}
	}
}
