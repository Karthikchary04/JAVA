package KARTHIK;

import java.util.Scanner;

public class StringFirst 
{
	public void FirstOccurance()
	{
		int character=0;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter string");
    	String str=s.nextLine();
    	System.out.println("enter character");
    	char ch=s.nextLine().charAt(0);
    	for(int i=0;i<str.length();i++)
    	{
    		if(ch==str.charAt(i))
    		{
    			System.out.println(i);
    			break;
    		}
    	}
	}
    public static void main()
    {
    	StringFirst s=new StringFirst();
    	s.FirstOccurance();
    }
}
