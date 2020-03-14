package stringPrograms;
import java.util.Scanner;
public class FirstNonRepeatedCharInString
{
    public void nonRepeatedhar(String str)
    {
    	int charcount=1;
    	char ch[]=str.toCharArray();
  
    	for(int i=0;i<ch.length;i++)
    	{
    		for(int j=i+1;j<ch.length;j++)
    		{
    			if(ch[i]==ch[j])
    			{

    				charcount++;
    			}
    		}
    		if(charcount==1)
    		{
    			System.out.println("first non repeated character in string is"+ch[i]+" "+charcount);
    			break;
    		}
    		charcount=1;
    	}
    }
	public static void main(String[] args)
	{
       FirstNonRepeatedCharInString f=new FirstNonRepeatedCharInString();
       Scanner s=new Scanner(System.in); 
       System.out.println("enter string");
       String str=s.nextLine();
       f.nonRepeatedhar(str);
	}

}
