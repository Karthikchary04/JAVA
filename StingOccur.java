package stringPrograms;
import java.util.Scanner;
public class StingOccur
{
    public void FirstOccur()
    {
    	int character=0;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter string");
    	String str=s.nextLine();
    	System.out.println("enter character");
    	char ch=s.nextLine().charAt(0);
    	for(int i=0;i<str.length();i++)
    	{
    		if(ch==str.charAt(i) || ch-32==str.charAt(i))
    		{
    			character++;
    		}
    	}
    	System.out.println(character);
    	
   }
	public static void main(String[] args) 
	{
        StingOccur s=new StingOccur();
        s.FirstOccur();
	}
}
