package KARTHIK;
import java.util.Scanner;
public class ArmStrongNumbers
{
	public void Display(int j)
	{
		System.out.print(j+"\t");
	}
    public void ArmStrong()
    {
    	int n,i,sum=0,digits=0,rem=0,temp;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter n value");
    	n=s.nextInt();
    	for(i=1;i<n;i++)
    	{
    		temp=i;
    		while(i!=0)
    		{
    			i=i/10;
    			digits++;
    		}
    		i=temp;
    		while(i!=0)
    		{
    			rem=i%10;
    			sum+=Math.pow(rem,digits);
    			i=i/10;
    		}
    		i=temp;
    		if(i==sum)
    		{
    			Display(i);
    		}
    		sum=0;
    		digits=0;
    		rem=0;
    	}
    }
	public static void main(String[] args) 
	{
       ArmStrongNumbers a=new ArmStrongNumbers();
       a.ArmStrong();
	}
}
