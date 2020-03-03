package KARTHIK;
import java.util.Scanner;
public class PrimeFactors 
{
	public int prime(int j)
	{
		int fc=0;
		for(int i=1;i<j;i++)
    	{
    		if(j%i==0)
    		{
               fc++;
    		}
    	}
		if(fc==1)
		{
			return j;
		}
		return j;
	}
    public void Factors()
    {
    	int fc=0,i,value;
    	System.out.println("enter number to prime factors");
    	Scanner s=new Scanner(System.in);
    	int num=s.nextInt();
    	for( i=1;i<=num/2;i++)
    	{
    		if(num%i==0)
    		{
    			value=prime(i);
    			System.out.println(value);
    		}
    	}
    }
	public static void main(String[] args) 
	{
       PrimeFactors p=new PrimeFactors();
       p.Factors();
	}
}
