package stringPrograms;
import java.util.Scanner;
public class MinOccurOfCharInString
{
    public void minOccurance(String str)
    {
    	int charcount=1,min=1;
    	char min_char=' ';
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
    		if(min>=charcount)
    		{
    			charcount=min;
    			min_char=ch[i];
    			System.out.println("min occurance of char in string is"+ch[i]+" "+charcount);
    		}
    		charcount=1;
    	    }
    	}
    		
    }
	public static void main(String[] args) 
	{
        MinOccurOfCharInString mc=new MinOccurOfCharInString();
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        String str=s.nextLine();
        mc.minOccurance(str);
	}

}