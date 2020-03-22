package interview_tasks;
import java.util.Scanner;
public class LinkedList_Palindrome_Or_Not 
{
    public Node head=null;
    public Node tail=null;
    public void insertNode(int data)
    {
    	Node newNode=new Node(data);
    	if(head==null)
    	{
    		head=newNode;
    		tail=newNode;
    	}
    	else
    	{
    		tail.next=newNode;
    		tail=newNode;
    	}
    }
    public void display()
    {
    	Node temp=head;
    	if(temp==null)
    	{
    		System.out.println("linkedlist is empty");
    	}
    	else
    	{
    		while(temp!=null)
    		{
    			System.out.print(temp.data+" ");
    			temp=temp.next;
    		}
    	}
    }
    public void palindromeOrNot()
    {
    	int n=0,j=1;
    	Node temp=head;
    	if(head.data==tail.data)
    	{
    	while(temp!=null)
    	{
    		n++;
    		temp=temp.next;
    	}
    	Node cur=head.next;
    	Node pre=head.next;
    	while(j<=n/2)
    	{
    		for(int i=2;i<n-2;i++)
    		{
    			cur=cur.next;
    		}
    		System.out.println("cur"+cur.data);
    		/* System.out.println("pre:"+pre.data+"--"+"cur1"+cur.data);
    		//if(pre.data==cur.data)
    		{
    			pre=pre.next;
    			 System.out.println("pre1:"+pre.data);
    			n--;
    		}
    		else
    		{
    			System.out.println("list is not in palindrome");
    			break;
    		}
    		
    	}*/
    		j++;
    	}
    	}
    	else
    	{
    		System.out.println(" Linked list is not palindrome");
    	}
    }
    public void options()
    {
    	int opt;
    	System.out.println("1.insert node\n2.display\n3.check palindrome or not");
    	Scanner s=new Scanner(System.in);
    	do
    	{
    		System.out.println("enter option");
    		opt=s.nextInt();
    		if(opt==1)
    		{
    			System.out.println("enter value");
    			int value=s.nextInt();
    			insertNode(value);
    		}
    		else if(opt==2)
    		{
    			display();
    		}
    		else if(opt==3)
    		{
    			palindromeOrNot();
    		}
    	}
    	while(opt!=0);
    }
	public static void main(String[] args) 
	{
		LinkedList_Palindrome_Or_Not l=new LinkedList_Palindrome_Or_Not();
		l.options();
	}

}
