package stringPrograms;

public class SelectionSort
{
	int arr[]=new int[]{20,60,40,10,50};
    public void sorting()
    {
    	int loc=0;
    	for(int i=0;i<5;i++)
    	{
    		int min=arr[i];
    		for(int j=i+1;j<5;j++)
    		{
    			if(min>arr[j])
    			{
    				min=arr[j];
    				loc=j;
    			}
    		}
    		if(min<arr[i])
    		{
    			int temp=arr[i];
    			arr[i]=arr[loc];
    			arr[loc]=temp;
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
       SelectionSort s=new SelectionSort();
       s.sorting();
       s.display();
	}

}
