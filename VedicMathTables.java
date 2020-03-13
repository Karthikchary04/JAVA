package interview_tasks;
import java.util.Scanner;
public class VedicMathTables
{
	int arr[]=new int[10];
    int arr1[]=new int[10];
    String arr2[]=new String[10];
    public int table(int num)
    {
    	    int rem=0;
    	    rem=num%10;
    		for(int i=0;i<10;i++)
    		{
    			arr[i]=rem*(i+1);
    		}
    		num=num/10;
    		for(int i=0;i<10;i++)
    		{
    			arr1[i]=num*(i+1);
    			arr1[i]+=arr[i]/10;
    			arr2[i]=String.valueOf((arr[i]%10));
    			System.out.println(arr1[i]+arr2[i]);
    		}
    	return 0;
    }
	public static void main(String[] args) 
	{
       Scanner s=new Scanner(System.in);
       System.out.println("enter number to print table");
       VedicMathTables v=new VedicMathTables();
       int num=s.nextInt();
       v.table(num);
	}
}
