import java.io.*;
class  CreatingNewFile
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("D:\\guru");
		f.mkdir();
		File s = new File("D:\\guru\\guru1.txt");
		s.createNewFile();
		s.exists();
		System.out.println(s.exists());
		PrintWriter pf = new PrintWriter("D:\\guru\\guru1.txt");
		pf.Write("Hi to all \n");
		pf.Print("Hello from Guru");
		pf.close();
	}
}
