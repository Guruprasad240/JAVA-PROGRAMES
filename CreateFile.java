import java.io.*;
class  CreateFile
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("GURU");
		f.mkdir();
		System.out.println(f.exists());
	}
}
