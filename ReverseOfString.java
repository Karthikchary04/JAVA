package KARTHIK;
import java.util.Scanner;
public class ReverseOfString 
{
	public void StringReverse()
	{
		String str1;
		String str2="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		str1=s.next();
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2+=str1.charAt(i);
		}
		System.out.println(str1+"-"+str2);
		System.out.println(str1.contentEquals(str2));
	}
   public static void main(String[] args)
   {
	   ReverseOfString r=new ReverseOfString();
	   r.StringReverse();   
   }
}