package stringPrograms;
import java.util.Scanner;
public class FirstOccurOfChar
{
    public void firstOccurance(String str,char search)
    {
    	char ch[]=str.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    			if(ch[i]==search)
    			{
    				System.out.println("first occurance of"+search+"is"+i);
    				break;
    			}
    	}
    }
	public static void main(String[] args)
	{
		FirstOccurOfChar fc=new FirstOccurOfChar();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		System.out.println("enter search element");
		char search=s.next().charAt(0);
		fc.firstOccurance(str,search);
	}

}
