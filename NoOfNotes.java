package stringPrograms;
import java.util.Scanner;
public class NoOfNotes 
{
	int amt=0,a2000,b500,c100;
	public void Amount(int amt)
	{
		if(amt%100==0)
		{
			if(amt>=2000)
			{
				a2000=amt/2000;
				amt-=a2000*2000;
			}
			if(amt>=500)
			{
				b500=amt/500;
				amt-=b500*500;
			}
			if(amt>=100)
			{
				c100=amt/100;
			}
		}
	}
	public void Notes()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter amount to print notes");
		amt=s.nextInt();
		if(amt%100==0)
		{
			if(amt>=2000)
			{
				a2000=amt/2000;
				amt-=a2000*2000;
			}
			if(amt>=500)
			{
				b500=amt/500;
				amt-=b500*500;
			}
			if(amt>=100)
			{
				c100=amt/100;
			}
		}
		else
		{
		   int rem=amt%100;
		   if(rem>50)
		   {
		   amt=(amt-rem)+100;
		   System.out.println(amt);
		   System.out.println("enter option 1.To print amount \n 2.exit");
		   int opt=s.nextInt();
		   if(opt==1)
		   {
			Amount(amt);
		   }
			else
			{
		      System.out.println("enter valid amount");
		      amt=s.nextInt();
		      Amount(amt);
			}
		   }
		   else
		   {
			   amt=amt-rem;
			   System.out.println(amt);
			   System.out.println("enter option 1.To print amount \n 2.exit");
			   int opt=s.nextInt();
			   if(opt==1)
			   {
				Amount(amt);
			   }
				else
				{
			      System.out.println("enter valid amount");
			      amt=s.nextInt();
			      Amount(amt);
				}
			   }
			   }
	}
	public void Display()
	{
		System.out.println("2000 notes are"+a2000);
		System.out.println("500 notes are"+b500);
		System.out.println("100 notes are"+c100);
	}
	public static void main(String[] args) 
	{
       NoOfNotes obj=new NoOfNotes();
       obj.Notes();
       obj.Display();
}
}