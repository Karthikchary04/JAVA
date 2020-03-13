package interview_tasks;
import java.util.Scanner;
public class DeleteDuplicateElements
{
    public void deleteElements(int arr[],int n)
    {
    	for(int i=0;i<n-1;i++)
    	{
    		for(int j=i+1;j<n;j++)
    		{
    			if(arr[i]==arr[j])
    			{
    				arr[j]=0;
    			}
    		}
    	}
    }
    public void display(int arr[],int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]!=0)
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) 
	{
		DeleteDuplicateElements d=new DeleteDuplicateElements();
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter"+n+"values");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		d.deleteElements(arr,n);
		d.display(arr,n);
	}
}
