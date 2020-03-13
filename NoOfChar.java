package stringPrograms;
import java.util.Scanner;
public class NoOfChar
{
	public void noOfCharacters()
	{
		int charcount=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words[i].length();j++)
			{
			   charcount++;
			}
			System.out.println(words[i]+charcount);
			charcount=0;
		}
	}
	public static void main(String[] args) 
	{
		NoOfChar n=new NoOfChar();
		n.noOfCharacters();
	}

}
