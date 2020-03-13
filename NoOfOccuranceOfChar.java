package stringPrograms;
import java.util.Scanner;
public class NoOfOccuranceOfChar
{
    public void firstOccurance(String str)
    {
    	int charcount=1;
    	char ch[]= str.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		if(ch[i]!=' ')
    		{
    		for(int j=i+1;j<ch.length;j++)
    		{
    			if(ch[i]==ch[j])
    			{
    				charcount++;
    				ch[j]=' ';
    			}
    		}
    		System.out.println("character occurance of"+ch[i]+"is"+charcount);
    		charcount=1;
    	    }
    	}
    }
	public static void main(String[] args)
	{
		NoOfOccuranceOfChar fc=new NoOfOccuranceOfChar();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
        fc.firstOccurance(str);
	}
}
