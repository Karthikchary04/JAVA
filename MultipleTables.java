package KARTHIK;
import java.util.Scanner;
public class MultipleTables
{
    public void tables()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter n value");
    	int n=s.nextInt();
    	int i=1,res=0,j=1;
    	while(i<=n)
    	{
    		for(j=1;j<=10;j++)
    		{
    			res=i*j;
    			System.out.println(i+"*"+j+"="+res);
    		}
    		i++;
    		res=0;
    	}
    }
	public static void main(String[] args) 
	{
       MultipleTables m=new MultipleTables();
       m.tables();
	}

}
