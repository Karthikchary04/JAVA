package interview_tasks;
import java.util.Scanner;
public class Converting_Given_String 
{
    public void converting(String str,int n) 
    {
    	int convert;
    	char ch;
    	for(int i=0;i<str.length();i++)
    	{
    		convert=(int)str.charAt(i);
    		ch=(char)(convert+n);
    		System.out.println(ch);
    	}
    }
	public static void main(String[] args) 
	{
        Converting_Given_String c=new Converting_Given_String();
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        System.out.println("enter n value");
        int n=s.nextInt();
        c.converting(str,n);
	}

}
