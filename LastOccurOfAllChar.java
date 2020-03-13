package stringPrograms;
import java.util.Scanner;
public class LastOccurOfAllChar
{
    public void lastOccurance(String str)
    {
    	char ch[]=str.toCharArray();
    	for(int i=ch.length-1;i>=0;i--)
    	{
    		if(ch[i]!=' ')
    		{
    		for(int j=i-1;j>=0;j--)
    		{
    			if(ch[i]==ch[j])
    			{
    				ch[j]=' ';
    			}
    		}
			System.out.println("last occurance of"+ch[i]+" "+i);
    		}
    	}
    }
	public static void main(String[] args) 
	{
		LastOccurOfAllChar lc=new LastOccurOfAllChar();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		lc.lastOccurance(str);
	}

}
