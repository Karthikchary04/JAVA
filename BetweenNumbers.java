package KARTHIK;
import java.util.Scanner;
public class BetweenNumbers 
{
    public void StartStop(int start,int stop)
    {
    	if(start<stop)
    	{
    		for(int i=start+1;i<stop;i++)
    		{
    			System.out.println(i);
    		}
    	}
    	else
    	{
    		for(int i=stop-1;i>start;i--)
    		{
    			System.out.println(i);
    		}
    	}
    }
	public static void main(String[] args) 
	{
        BetweenNumbers b=new BetweenNumbers();
        b.StartStop(40,90);
	}

}
