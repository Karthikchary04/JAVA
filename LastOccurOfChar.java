package stringPrograms;
import java.util.Scanner;
public class LastOccurOfChar
{
    public void lastOccur(String str,char search)
    {
    	char ch[]=str.toCharArray();
    	for(int i=ch.length-1;i>=0;i--)
    		{
    			if(search==ch[i])
    			{
    				System.out.println("last occurance of"+ch[i]+" "+i);
    				break;
    			}
    	}
    }
	public static void main(String[] args)
	{
       LastOccurOfChar lc=new LastOccurOfChar();
       Scanner s=new Scanner(System.in);
       System.out.println("enter string");
       String str=s.nextLine();
       System.out.println("enter search element");
       char search=s.next().charAt(0);
       lc.lastOccur(str,search);
	}

}
