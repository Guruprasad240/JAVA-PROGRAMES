import java .io.*;
public class Custfile {
	public static void main(String[] args) throws Exception{
		byte CustId=1;
		String CustName="Prasad";
		int CustAge=22;
		int CustSal=45000;
		char grade='A';
		try
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Customer Id");
		CustId=(byte)br.read();
		System.out.println("Enter Customer Name");
		CustName= (String)br.readLine();
		System.out.println("Enter Customer Age");
		CustAge= Integer.parseInt(br.readLine());
		System.out.println("Enter Customer salary");
		CustSal= Integer.parseInt(br.readLine());
		System.out.println("Enter Customer grade");
		grade=(char)br.read();
		System.out.println("Id is "+ CustId);
		System.out.println("Name is "+ CustName);
		System.out.println("Age is "+ CustAge);
		System.out.println("Salary is "+ CustSal);
		System.out.println("Grade is "+ grade);
		}
		catch(IOException ex)
		{
		System.out.println(ex.toString());
		}
        try {
        PrintWriter pr=new PrintWriter("D:\\guru.txt");	
        pr.write(grade);
        pr.write(CustSal+"\n");
        pr.write(CustAge+"\n");
        pr.write(CustName+"\n");
        pr.write(CustId+"\n");
        pr.close();}
        catch(Exception er)
        {
        	
        }
        
	}
}
	

