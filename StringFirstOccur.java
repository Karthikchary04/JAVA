package stringPrograms;

import java.util.Scanner;

public class StringFirstOccur
{
	public void FirstOccur()
	{
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter string");
    	String str=s.nextLine();
    	System.out.println("enter character");
    	char ch=s.nextLine().charAt(0);
    	for(int i=str.length()-1;i>=0;i--)
    	{
    		if(ch==str.charAt(i))
    		{
    	    	System.out.println(i);
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
