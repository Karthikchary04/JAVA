package stringPrograms;
import java.util.Scanner;
public class Removing_Given_Char
{
    public void removing(String str,char c)
    {
    	char ch[]=str.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		if(c==ch[i])
    		{
    			for(int j=i;j<ch.length;j++)
    			{
    				ch[j]=ch[j+1];
    			}
    		}
    	}
    	for(int j=0;j<ch.length;j++)
    	{
    		System.out.println(ch[j]);
    	}
    	str=String.valueOf(ch);
    	System.out.println(str);
    }
	public static void main(String[] args)
	{
        Removing_Given_Char r=new Removing_Given_Char();
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        System.out.println("enter character to remove from string");
        char ch=s.next().charAt(0);
        r.removing(str,ch);
	}

}
