package stringPrograms;
import java.util.Scanner;
public class NoOfWords 
{
    public void characters()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter string");
    	String str=s.nextLine();
    	String words[]=str.split(" ");
    	int wc=words.length;
    	System.out.println(wc);
    }
	public static void main(String[] args)
	{
       NoOfWords n=new NoOfWords();
       n.characters();
	}

}
