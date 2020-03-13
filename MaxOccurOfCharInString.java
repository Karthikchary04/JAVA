package stringPrograms;
import java.util.Scanner;
public class MaxOccurOfCharInString 
{
    public void maxOcuurance(String str)
    {
    	int charcount=1,max=0;
    	char max_char=' ';
    	char ch[]=str.toCharArray();
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
    		if(max<charcount)
    		{
    			max=charcount;
    			max_char=ch[i];
    		}
    		if(charcount==max)
    	    {
    	      System.out.println("maximum occurance of char is"+" "+ch[i]+"is"+charcount);
    	    }
    	charcount=1;
    	}
    	}
    }
	public static void main(String[] args) 
	{
		MaxOccurOfCharInString mc=new MaxOccurOfCharInString();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		mc.maxOcuurance(str);
	}

}
