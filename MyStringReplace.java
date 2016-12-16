import java.util.Scanner;
public class MyStringReplace
	{
     
		public static void main(String a[])
		{
		
			String str = "This is an example string";
			System.out.println("my string is \t\t\t\t\t:\t"+str);
			System.out.println("Replace char 's' with 'o'\t\t\t:\t"
						+str.replace('s', 'o'));
                     
			System.out.println("Replace first occurance of string\"is\" with \"ui\" :\t"
						+str.replaceFirst("is", "ui"));
                     
			System.out.println("Replacing \"is\" every where with \"no\"\t\t:\t"
						+str.replaceAll("is", "no"));
		}
}