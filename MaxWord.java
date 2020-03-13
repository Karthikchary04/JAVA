package stringPrograms;
import java.util.Scanner;
public class MaxWord
{
    public void max()
    {
    	int charcount=0,max=0,word=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(max<words[i].length())
			{
				max=words[i].length();
				word=i;
			}
        }
		System.out.println(words[word]+"  :  "+max);
    }
   public static void main(String[] args)
	{
     MaxWord m=new MaxWord();
     m.max();
	}
}
