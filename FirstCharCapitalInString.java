package stringPrograms;
import java.util.Scanner;
public class FirstCharCapitalInString
{
    public void capitalize(String str)
    {
    	String Words[]=str.split(" ");
    }
	public static void main(String[] args) 
	{
		FirstCharCapitalInString fc= new FirstCharCapitalInString();
		Scanner s=new Scanner(System.in);
		System.out.println("enter String");
		String str=s.nextLine();
		fc.capitalize(str);
	}

}
