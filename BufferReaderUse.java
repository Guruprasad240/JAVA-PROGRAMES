import java.io.*;
class  BufferReaderUse
{
	public static void main(String[] args) throws Exception
	{
		FileWriter fw = new FileWriter("d://guru//guru1.txt");
		BufferedWriter buw = new BufferedWriter(fw);
		buw.write("Hello World!");
	
		buw.close();
		}
}
