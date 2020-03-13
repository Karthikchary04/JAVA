package stringPrograms;
import java.util.Scanner;
public class BubbleSort 
{
	int arr[]=new int[]{30,20,50,10,60,};
	public void sorting()
	{
		for(int i=0;i<5-1;i++)
		{
			for(int j=0;j<5-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args)
	{
        BubbleSort b=new BubbleSort();
        b.sorting();
        b.display();
	}
}
