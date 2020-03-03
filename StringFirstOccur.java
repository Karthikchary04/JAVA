package KARTHIK;
import java.util.Scanner;
public class StringFirstOccur
{
    public void FirstOccur()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter string");
    	String str=s.nextLine();
    	System.out.println("enter charcter to search");
    	String search=s.next();
    	String arr[]=new String[100];
    	for(int i=0;i<str.length();i++)
    	{
           arr[i]=s.next();
           if(search==arr[i])
    	   {
    		   System.out.println("search element found");
    		   break;
    	   }
    	}
    }
	public static void main(String[] args) 
	{
        StringFirstOccur s=new StringFirstOccur();
        s.FirstOccur();
	}

}
