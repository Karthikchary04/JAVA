package stringPrograms;

import java.util.Scanner;

public class Sorting_String_array_By_Freq
{
    public void sorting(String arr[])
    {
    	String key=null;
    	int j=0;
    	for(int i=1;i<arr.length;i++)
    	{
    		key=arr[i];
    		j=i-1;
    		while(j>=0 && arr[j].length()>key.length())
    		{
    			arr[j+1]=arr[j];
    			j--;
    		}
    		arr[j+1]=key;
    	}
    }
	public static void main(String[] args) 
	{
       Sorting_String_array_By_Freq sf=new Sorting_String_array_By_Freq();
       Scanner s=new Scanner(System.in);
       System.out.println("enter string");
       String str=s.nextLine();
       String arr[]=str.split(" ");
       sf.sorting(arr);
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
	}

}
