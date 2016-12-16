import java.util.Scanner;
 public class StringConcat
 {
    public static String strcat(String str1, String str2)
	{
        	char[] charArray1 = str1.toCharArray();
        	char[] charArray2 = str2.toCharArray();
        	int counter=charArray1.length+charArray2.length;
        	char[] charContainer=new char[counter];
        	int i=0;
        	for(; i<charArray1.length; i++) 
		{
            		charContainer[i]=charArray1[i];
        	}
        	for(int j=0; i<counter; j++,i++) 
		{
        	    charContainer[i]=charArray2[j];
        	}
        	return new String(charContainer);
    	}
    	public static void main(String args[])
	{
        	String str1,str2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your String1");
		str1 = s.next();
		System.out.println("Enter your String2");
		str2 = s.next();
        	String strContainer = strcat(str1,str2);
        	System.out.println("String Container : " +strContainer);  
    	}
 }
