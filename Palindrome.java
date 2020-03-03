package KARTHIK;
import java.util.Scanner;
public class Palindrome
{
    public void Reverse()
    {
    	int num=0,rev=0;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter number to check palindrome or not");
    	num=s.nextInt();
    	int temp=num;
    	while(num!=0)
    	{
    		int rem=num%10;
    		rev=rev*10+rem;
    		num=num/10;
    	}
    	num=temp;
    	if(num==rev)
    	{
    		System.out.println("number is palindrome");
    	}
    }
	public static void main(String[] args) 
	{
       Palindrome p=new Palindrome();
       p.Reverse();
	}

}
