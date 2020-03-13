package interview_tasks;
import java.util.Scanner;
public class PatternWithoutLoop 
{
    public void pattern(int num)
    { 
    	int temp=num; 
    	   if(num!=-num)
    	   {
    		   System.out.println(num);
        	   num=num-4;
    		 pattern(num);
    	   }
    	if(num==0)
    	{
    		System.out.println(num);
    		num=num+4;
    		pattern(num);
    	}
    		if(num!=temp)
    		{
    			System.out.println(num);
        		num=num+4;
    			pattern(num);
    		}
    	}
	public static void main(String[] args)
	{
       PatternWithoutLoop p=new PatternWithoutLoop();
       System.out.println("enter number to print pattern");
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
       p.pattern(num);
	}

}
