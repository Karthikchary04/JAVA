package stringPrograms;
import java.util.Scanner;
public class FirstOccurOfAllChar
{
	 public void firstOccurance(String str)
	    {
	    	char ch[]= str.toCharArray();
	    	for(int i=0;i<ch.length;i++)
	    	{
	    		if(ch[i]!=' ')
	    		{
	    		for(int j=i+1;j<ch.length;j++)
	    		{
	    			if(ch[i]==ch[j])
	    			{
	    				ch[j]=' ';
	    			}
	    		}
	    		System.out.println("character occurance of"+ch[i]+"is"+i);
	    	    }
	    	}
	    }
	public static void main(String[] args) 
	{
		FirstOccurOfAllChar fc=new FirstOccurOfAllChar();
		System.out.println("enter string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		fc.firstOccurance(str);
	}

}
