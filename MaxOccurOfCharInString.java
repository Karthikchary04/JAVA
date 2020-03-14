package stringPrograms;
import java.util.Scanner;
public class MaxOccurOfCharInString 
{
    public void maxOcuurance(String str)
    {
    	
    	int arr[]=new int[10];
    	char c[]=new char[10];
    	int charcount=1,max=0,k=0,loc=0;
    	char max_char=' ';
    	char ch[]=str.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		if(ch[i]!=' ')
    		{
    		for(int j=i+1;j<ch.length;j++)
    		{
    			if(ch[i]==ch[j])
    			{
    				charcount++;
    				ch[j]=' ';
    			}
    		}
    		arr[k]=charcount;
    		c[k]=ch[i];
    		k++;
    		for(int j=0;j<k;j++)
        	{
        		if(max<arr[j])
        		{
        			max=arr[j];
        			loc=j;
        		}
        	}
    	charcount=1;
    	}
    	}
    	System.out.println("max:"+max);
    	for(int i=0;i<k;i++)
    	{
    		if(arr[i]==max)
    		{
    			System.out.println(ch[i]);
    		}
    	}
    }
	public static void main(String[] args) 
	{
		MaxOccurOfCharInString mc=new MaxOccurOfCharInString();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		mc.maxOcuurance(str);
	}

}
