package files;
import java.io.FileWriter;
import java.util.Scanner;
public class BankOPerationsINFiles implements BankInterfaceInFiles
{
	public void accountDetails()
	{
    	try 
    	{
    		FileWriter details=new FileWriter("D://java files/Details.txt");
    		Scanner s=new Scanner(System.in);
    		System.out.println("enter pin");
    		int pin=s.nextInt();
    		details.write("pin :"+pin);
    		details.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println("an error occured");  		
    	}
	}
    public void validate(int pin)
    {
    	int pincount=0;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter pin");
    	int epin=s.nextInt();    	
    	if(pin==epin)
    	{
    		options();
    	}
    	else
    	{
    		System.out.println("invalid pin");
    	}
    	System.out.println("your card has been blocked for the day");
    }
    public double deposite(double acbal,double amt)
    {
    	acbal+=amt;
    	return acbal;
    }
    public double withdraw(double acbal,double amt)
    {
    	int wordcount=0; 
    	double temp=amt;
    	if(amt<=acbal)
    	{
    		wordcount++;
    		if(amt%100==0)
        	{
    			if(amt>=2000)
    			{
        		int a2000=(int)amt/2000;
        		amt=amt-(a2000*2000);
    			}
    			if(amt>=500)
    			{
    				int b500=(int)amt/500;
    				amt=amt-(b500*500);
    			}
    			if(amt>=100)
    			{
    				int c100=(int)amt/100;
    			}
        	}
    		amt=temp;
    		acbal=acbal-amt;
    	}
    	else
    	{
    		System.out.println("invalid amount");
    	}
    	return acbal;
    }
    private void options()
    {
    	int opt=0;
    	double acbal=0;
    	System.out.println("1.deposite /n 2.withdraw");
    	do
    	{
    		Scanner s=new Scanner(System.in);
    		System.out.println("enter option");
    		opt=s.nextInt();
    		if(opt==1)
    		{
    			System.out.println("enter deposite amount");
    			double amt=s.nextDouble();
    			acbal=deposite(acbal,amt);
    			System.out.println(acbal);
    		}
    		if(opt==2)
    		{
    			System.out.println("enter withdraw amount");
    			double amt=s.nextDouble();
				acbal=withdraw(acbal,amt);
				System.out.println(acbal);
    		}
    	}
    	while(opt!=0);
    }
}
