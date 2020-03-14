package stringPrograms;
import java.util.Scanner;
public class Duplicate_Char_In_String 
{
    public void duplicate(String str)
    {
    	int charcount=1;
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
    		if(charcount>=2)
    		{
    			System.out.println("duplicate characters are:"+ch[i]+" "+charcount);
    		}
    		charcount=1;
    		}
    	}
    }
	public static void main(String[] args) 
	{
       Duplicate_Char_In_String d=new Duplicate_Char_In_String();
       Scanner s=new Scanner(System.in);
       System.out.println("enter String");
       String str=s.nextLine();
       d.duplicate(str);
	}

}
