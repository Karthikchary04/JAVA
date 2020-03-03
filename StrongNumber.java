package KARTHIK;
import java.util.Scanner;
public class StrongNumber 
{
    public void Snumber()
    {
    	int n=0,i=1,j,rem=0,fact=1,sum=0,temp;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter n value");
    	n=s.nextInt();
    	while(i<=n)
    	{
    		temp=i;
    		while(i!=0)
    		{
    		rem=i%10;
    		for(j=1;j<=rem;j++)
    		{
    			fact=fact*j;
    		}
    		sum+=fact;
    		i=i/10;
        	}
    		i=temp;
    		if(sum==i)
    		{
    			System.out.println(i);
    		}
    		sum=0;
    		fact=1;
    		rem=0;
    		i++;
         }
    }
	public static void main(String[] args)
	{
       StrongNumber s=new StrongNumber();
       s.Snumber();
	}
}
