package interview_tasks;
import java.util.Scanner;
public class Tower_OF_Henoi 
{
    public void henoi(int arr1[],int n)
    {
    	int nod1=0,nod2=0;
    	int arr2[]=new int[n];
    	int arr3[]=new int[n];
    	arr3[nod2]=arr1[n-1];
    	nod2++;
    	n--;
    	arr2[nod1]=arr1[n-1];
    	nod1++;
    	n--;
    	arr2[nod1]=arr3[nod2-1];
    	nod1++;
    	nod2--;
    	arr3[nod2]=arr1[n-1];
    	nod2++;
    	n--;
    	arr1[n]=arr2[nod1-1];
    	n++;
    	nod1--;
    	arr3[nod2]=arr2[nod1-1];
    	nod2++;
    	nod1--;
    	arr3[nod2]=arr1[n-1];
    	nod2++;
    	n--;
    	for(int i=0;i<nod2;i++)
    	{
    		System.out.println(arr3[i]);
    	}
    }
	public static void main(String[] args) 
	{
		Tower_OF_Henoi to=new Tower_OF_Henoi();
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=s.nextInt();
		}
		to.henoi(arr1,n);
	}

}
