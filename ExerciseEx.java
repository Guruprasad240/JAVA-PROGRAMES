import java.io.*;
import java.util.Scanner;
class  ExerciseEx
{
	public static void main(String[] args)throws Exception
	{
		FileWriter fw = new FileWriter("d:\\Guru.txt");
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter the number customers");
		int numofcust = sobj.nextInt();
		String [][] s1 = new String[numofcust][4];

		for(int i= 0;i<numofcust;i++)
		{
			System.out.println("Enter the cousomer id,cusomer name,customer Age,salary");
			for(int j=0;j<4;j++)
			{
				s1[i][j] = sobj.next();
			}
		}
		for(String[] s2:s1)
		{
			for (String[] s3:s1)
			{
				fw.write(s3);
			}
		}
		FileReader fr = new FileReader("d:\\Guru.txt");
		BufferedReader br = new BufferedReader(fr); 
		for(int k =0;k<numofcust;k++)
		{
			for(int l =0;k<4;l++)
			{
				String s = br.readLine();
				System.out.println(s);
			}
		}
	}
}
