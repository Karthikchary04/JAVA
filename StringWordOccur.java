package stringPrograms;
import java.util.Scanner;
public class StringWordOccur
{
    public void WordOccur()
    {
    	int character=1;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter a string");
    	String str=s.nextLine();
    	String arr[]=str.split(" ");
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i].equals(arr[j]))
    			{
    				character++;
    				arr[j]=" ";
    			}
    		}
    		if(arr[i]!=" ")
    		System.out.println(arr[i]+character);
    		character=1;
    	}
    }
	public static void main(String[] args)
	{
      StringWordOccur s=new StringWordOccur();
      s.WordOccur();
	}

}
