package interview_tasks;
import java.util.Scanner;
public class QueueFromStack
{
	int Stack1[]=new int[]{10,20,30,40,50};
	int Stack2[]=new int[5];
	public void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Stack2[i]);
		}
	}
    public void pop()
    {
    	for(int i=5-1;i>=0;i--)
    	{
    		Stack2[i]=Stack1[i];
    	}
    }
	public static void main(String[] args)
	{
       QueueFromStack Qs=new QueueFromStack();
       Qs.pop();
       Qs.display();
	}

}
