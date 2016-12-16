import java.util.StringTokenizer;
public class Removemultichar
	{
		public static void main(String[] args)
		{		
			String str = "This      is      java";
			StringTokenizer st = new StringTokenizer(str," ");
			StringBuffer sb = new StringBuffer();
			while(st.hasMoreElements())
			{
				sb.append(st.nextElement()).append(" ");
			}
			System.out.println(sb.toString().trim());
		}
	}
