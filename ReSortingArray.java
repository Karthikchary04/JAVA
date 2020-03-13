package interview_tasks;
import java.util.Scanner;
public class ReSortingArray 
{
    public void sorting()
    {
    	int res,abc,value=0,k=0,status=0;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter n value");
    	int n=s.nextInt();
    	int arr1[]=new int[n];
    	int arr2[]=new int[100];
    	for(int i=0;i<n;i++)
    	{
    		arr1[i]=s.nextInt();
    	}
    	for(int i=0;i<n;i++)
    	{
    		if(arr1[i]!=0)
    		{
    		 res=arr1[i]*-2;
    		 abc=(arr1[i])+(res);
    		for(int j=i+1;j<n;j++)
    		{
    			if(abc==arr1[j])
    			{
    				status=1;
    				arr1[j]=0;
    			}
    		}
    		if(status==1)
    		{
    			arr2[k]=arr1[i];
    			k++;
    			arr2[k]=abc;
				k++;
    			status=0;
    		}else
    		{
    			arr2[k]=arr1[i];
    			k++;
				
    		}	
    	 }   	
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(arr2[i]);
    	}
    }
	public static void main(String[] args) 
	{
	  ReSortingArray r=new ReSortingArray();
	  r.sorting();
	}

}
